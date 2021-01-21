all: ListFiles.class

ListFiles.class: ListFiles.java
	javac -cp .;rats.jar ListFiles.java

clean: 
	del /S *.class

DIR=""

run: ListFiles.class
	java -cp .;rats.jar ListFiles $(DIR)