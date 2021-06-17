gen: ./parsers/rats/java/javarats.rats
	java -jar ./libs/rats.jar -out ./parsers/rats/java/ ./parsers/rats/java/javarats.rats 

compile: gen
	javac -cp .;./libs/rats.jar ./tester/Main.java

run: compile
	java -cp .;./libs/rats.jar ./tester/Main

clean:
	del /S *.class
	del ./parsers/rats/java/javarats.java