import matplotlib.pyplot as plt
import matplotlib.dates as mdates

j = 0
c = 0
cx = 0
jx = 0
p = 0
pc = 0
pcx = 0
px = 0
xm = 0
cont = 0

linguagem = ["java", "closure", "closure_xml", "java_xml", "pair", "pair_closure", 
"pair_closure_xml", "pair_xml", "xml"]

dataset = open('Saida.csv', 'r')

for line in dataset:
    line = line.strip()  # Tira o \n no final da linha
    x, y, z = line.split(';')  # Quebra a linha com o marcador ;

    if x == "java":
        cont += 1
        j += int(y)
    elif x == "closure":
        c += int(y)
    elif x == "closure_xml":
        cx += int(y)
    elif x == "java_xml":
        jx += int(y)
    elif x == "pair":
        p += int(y)
    elif x == "pair_closure":
        pc += int(y)
    elif x == "pair_closure_xml":
        pcx += int(y)
    elif x == "pair_xml":
        px += int(y)
    elif x == "xml":
        xm += int(y)
dataset.close()

X = []
Y = []

valor = [j, c, cx, jx, p, pc, pcx, px, xm]

for i in range(0, 9):
    X.append(linguagem[i])
    Y.append(valor[i]/cont)

plt.bar(X, Y)

plt.title('Tempo de Execução')
plt.xlabel('Nome arquivo')
plt.ylabel('Tempo')

# plt.xticks(rotation=90)
# plt.xticks(rotation=45, ha='right')
plt.tick_params(axis='x', labelrotation=45)
plt.subplots_adjust(bottom=0.35)

plt.show()
