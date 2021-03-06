package intrucoes;

import dataStructure.ReorderBufferNode;
import dataStructure.ReservationStationNode;

public class InstrucaoIOpAddi extends InstrucaoI implements Instrucao {
	int time = 1;
	public InstrucaoIOpAddi(int r1, int r2, int r3, int r4) {
		super(r1, r2, r3, r4);
	}	
	@Override
	public boolean issue() {
		dataStructure_.issued = null;
		if(dataStructure_.getReservationStation().isFullAdd() || 
				dataStructure_.getReorderBuffer_().isFull()) return false;
		
		ReservationStationNode rsNode = new ReservationStationNode();
		ReorderBufferNode robNode = new ReorderBufferNode();
		
		if(dataStructure_.getRegisterStatus_().isBusy(rs_)){
			int h = dataStructure_.getRegisterStatus_().getReorder(rs_);
			if(!dataStructure_.getReorderBuffer_().getNodeID(h).busy){
				rsNode.setVj(dataStructure_.getReorderBuffer_().getNodeID(h).value);
				rsNode.setQj(0);
			}else{
				rsNode.setQj(h);
			}
		}else{
			rsNode.setVj(dataStructure_.getRegisters_().getReg(rs_));
			rsNode.setQj(0);
		}
		
		rsNode.setBusy(true);
		rsNode.setInstrucao(this);
		rsNode.setOp(instrucao_);
		
		int b;
		b = dataStructure_.getReorderBuffer_().getROBList().size();
		rsNode.setDest(b);
		
		robNode._instrucao = this;
		robNode.instruction = instrucao_;
		robNode.destination = rt_;
		robNode.busy = true;
		
		if(dataStructure_.getReorderBuffer_().getROBList().size() == 0)
			robNode.ID = 1;
		else
			robNode.ID = dataStructure_.getReorderBuffer_().getROBList().get(dataStructure_.getReorderBuffer_().getROBList().size()-1).ID+1;
		System.out.println("RobNode ID: " + robNode.ID);
		rsNode.setDest(robNode.ID);
		rsNode.setVk(0);
		rsNode.setQk(0);
		
		rsNode.setA(immediate_);
		
		dataStructure_.getRegisterStatus_().getReorder().set(rt_, robNode.ID);
		dataStructure_.getRegisterStatus_().getBusy().set(rt_, true);
		
		robNode.state = "Issue";
		
		dataStructure_.getReorderBuffer_().getROBList().add(robNode);
		dataStructure_.getReservationStation().getAddList().add(rsNode);
		dataStructure_.issued = rsNode;
		dataStructure_.sPointer++;
		mudou = true;
		return true;
	}
	
	@Override
	public boolean isExecutable(int i) {
		return dataStructure_.getReservationStation().getAddList().get(i).getQj() == 0 &&
				dataStructure_.getReservationStation().getAddList().get(i).getQk() == 0 ;
	}
	
	@Override
	public boolean execute(int i) {
		if(dataStructure_.getReorderBuffer_().getRobNodeDest(dataStructure_.getReservationStation().getAddList().get(i).getDest())!=null)
			dataStructure_.getReorderBuffer_().getRobNodeDest(dataStructure_.getReservationStation().getAddList().get(i).getDest()).state = "Executando";
		if(time == 0){
			//dataStructure_.getReservationStation().getAddList().get(i).setVj(dataStructure_.getRegisters_().getReg(dataStructure_.getReservationStation().getAddList().get(i).getVj()));
			//dataStructure_.getReservationStation().getAddList().get(i).setVj(45);
			//dataStructure_.getReservationStation().getAddList().get(i).setVk(dataStructure_.getRegisters_().getReg(dataStructure_.getReservationStation().getAddList().get(i).getVk()));
			this.setTerminou(true);
			mudou = false;
			return true;
		}
		time--;
		return false;
	}
	@Override
	public boolean write(int i) {
			ReorderBufferNode robnode = null;
			for(ReorderBufferNode r : dataStructure_.getReorderBuffer_().getROBList()){
				if(r._instrucao.equals(this)){
					robnode = r;
				}
			}
			
			robnode.value = /*dataStructure_.getRegisters_().getReg(*/dataStructure_.getReservationStation().getAddList().get(i).getVj()/*)*/ +
					dataStructure_.getReservationStation().getAddList().get(i).getA();
			robnode.busy = false;
			robnode.state = "Escrita";
			int b = dataStructure_.getReservationStation().getAddList().get(i).getDest();
			dataStructure_.getReservationStation().getAddList().get(i).setBusy(false);
		
			for(ReservationStationNode r : dataStructure_.getReservationStation().getAddList()){
				if(r.getQj() == b) {
					r.setVj(robnode.value);
					r.setQj(0);
				}
				
				if(r.getQk() == b){
					r.setVk(robnode.value);
					r.setQk(0);
				}
			}
			
			for(ReservationStationNode r : dataStructure_.getReservationStation().getMultList()){
				if(r.getQj() == b) {
					r.setVj(robnode.value);
					r.setQj(0);
				}
				
				if(r.getQk() == b){
					r.setVk(robnode.value);
					r.setQk(0);
				}
			}
		
			for(ReservationStationNode r : dataStructure_.getReservationStation().getLoadList()){
				if(r.getQj() == b) {
					r.setVj(robnode.value);
					r.setQj(0);
				}
				if(r.getQk() == b){
					r.setVk(robnode.value);
					r.setQk(0);
				}
			}
			dataStructure_.write = robnode;
			escrita = true;
			return true;
	}
	
	@Override
	public void commit(){
		if(dataStructure_.getReorderBuffer_().getROBList().get(0).state == "Escrita"){
			if (!dataStructure_.getReorderBuffer_().getBusy(0)){
				int d = dataStructure_.getReorderBuffer_().getDest(0);
				
				dataStructure_.getRegisters_().setReg(rt_, dataStructure_.getReorderBuffer_().getValue(0));
				//dataStructure_.getReorderBuffer_().setBusy(0, false);
				System.out.println("");
				System.out.println("Instrucao "+ instrucao_);
				System.out.println("Ver se acerta"+ dataStructure_.getRegisterStatus_().getReorder(rt_) +" == "+ dataStructure_.getRegisterStatus_().getReorder(dataStructure_.getReorderBuffer_().getDest(0)));
				if(dataStructure_.getRegisterStatus_().getReorder(rt_) == dataStructure_.getRegisterStatus_().getReorder(dataStructure_.getReorderBuffer_().getDest(0))){
					dataStructure_.getRegisterStatus_().getBusy().set(rt_, false);
					dataStructure_.getRegisterStatus_().getReorder().set(rt_, 0);
				}
			}
			dataStructure_.getReorderBuffer_().getROBList().remove(0);
		}
	}

	/*@Override
	public void commit(){
		if(dataStructure_.getReorderBuffer_().getROBList().get(0).state == "Escrita"){
			int h = 0;
			if (!dataStructure_.getReorderBuffer_().getBusy(h)){
				int d = dataStructure_.getReorderBuffer_().getDest(h);
				
				dataStructure_.getRegisters_().setReg(d, dataStructure_.getReorderBuffer_().getValue(h));
				
				dataStructure_.getReorderBuffer_().setBusy(h, false);
				if(dataStructure_.getRegisterStatus_().getReorder(d) == dataStructure_.getReorderBuffer_().getDest(h))
				{
					dataStructure_.getRegisterStatus_().getBusy().set(d, false);
					dataStructure_.getRegisterStatus_().getReorder().set(d, 0);
				}
			}
			dataStructure_.getReorderBuffer_().getROBList().remove(0);
		}
	}*/
}