The File class in the java.io package allows us to work with files
To use the File class, create an object of the class, and specify the filename or directory

Syntax
import java.io.File

File myFile = new File("fileName.txt");

methods
canRead()	Boolean	Tests whether the file is readable or not
canWrite()	Boolean	Tests whether the file is writable or not
createNewFile()	Boolean	Creates an empty file
delete()	Boolean	Deletes a file
exists()	Boolean	Tests whether the file exists
getName()	String	Returns the name of the file
getAbsolutePath()	String	Returns the absolute pathname of the file
length()	Long	Returns the size of the file in bytes
list()	String[]	Returns an array of the files in the directory
mkdir()	Boolean	Creates a directory

FileReader class
-reads data from a file
-commmon methods: read(), close()

FileWriter class
-writes data to a file
-common methods write(), close()

BufferedReader
-provides efficient reading of text using buffering
-common methods: read(), newLine(), close()

BufferedWriter
- provides efficient writing of text using buffering
common methods: write(), newLine(), close()

PrintWriter
Simplifies writing formatted data to a file.

Scanner
Used to read from files easily 
methods: nextLine() , nextInt()

Files (java.nio.file)
Provides utility methods for file handling in the java.nio.file package.
Methods: readAllBytes(), write(), copy(), move(), delete()

Create a File
use the createNewFile() method - returns true if the file was created and false if the file already exists
The method is enclosed in try..catch block incase it throws an IOException (if the file cannot be created for some reason)
To create a file to a specific directory use double backslashes (Windows) or / (Mac or Linux)

Write To a File
Use the FileWriter class together with its write() method to write some text
When you are done writing close it with the close() method

Read a File
Use scanner class to read the contents of the file

Delete a File
Use the delete() method
You can also delete a folder provided that it's empty
