*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: J TITUS JEROLD

*INTERN ID*: CT04DG1795

*DOMAIN*: JAVA PROGRAMMING INTERN

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

## This Java program demonstrates a complete cycle of file handling operations including file creation, writing, reading, and appending using classes from the java.io package. It begins by attempting to create a new file named newfile.txt using the `File` class and `createNewFile()` method. If the file is created successfully, a message is printed confirming its creation. If the file already exists or an error occurs, it is caught and an error message is printed. Next, the program uses a `BufferedWriter` wrapped around a `FileWriter` to write the string "i am the first one" to the file, replacing any existing content since the writer is not in append mode. After writing, the program reads and prints the content of the file line by line using `BufferedReader` and `FileReader`, displaying the text "Before Modification:" followed by the file's content, which at this stage contains only the first message. Following this, the program appends new content by creating another `BufferedWriter` with `FileWriter` in append mode (second argument set to `true`) and writes a newline followed by the text "i am the second one", preserving the previous content. Finally, it reads the file again and prints its entire content under the heading "After Modification:", now showing both messages: the original and the appended one. All operations are enclosed in `try-with-resources` blocks which automatically close the streams after use, ensuring efficient resource management and reducing the chances of memory leaks. Exception handling is performed with simple `catch` blocks that catch `IOException` or general `Exception` and print a user-friendly error message in case of failures. This code provides a practical example of sequential file operations — demonstrating how to create a file, write to it, read from it, and then append more data, all while handling exceptions and managing resources effectively, making it a solid beginner-level illustration of Java file I/O operations.

#OUTPUT

![Image](https://github.com/user-attachments/assets/a1c5c858-3510-4537-b6da-17de8e7a021c) 
