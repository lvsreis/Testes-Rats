all: Execucao.class

Execucao.class: Execucao.java ListFilesFuncoes.java
	javac -cp .;rats.jar Execucao.java

clean: 
	del /S *.class

DIR=""

run: Execucao.class
	java -cp .;rats.jar Execucao $(DIR)