mkdir target
javac -d ./target `find src/java -name "*.java"` 
cp -R src/resources target/.
jar cfm ./target/images-to-chars-printer.jar src/manifest.txt -C target .
java -jar target/images-to-chars-printer.jar . 0
#rm -rf target

