
javac -d ./target src/java/edu/school21/printer/*/*.java

# Usage: <white pixel> <black pixel> <path to image>
java -classpath target edu.school21.printer.app.Program . 0 ./it.bmp
rm -rf target
