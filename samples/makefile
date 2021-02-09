all: ListFiles.class

ListFiles.class: ListFiles.java
	javac -cp .;rats.jar ListFilesFuncoes.java

clean: 
	del /S *.class

DIR=""

run: ListFiles.class
	java -cp .;rats.jar ListFilesFuncoes $(DIR)