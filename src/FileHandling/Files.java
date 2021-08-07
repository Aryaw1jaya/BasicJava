package FileHandling;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class Files {

    public static void main(String[] args) throws IOException{
        Create();               // Create File
        System.out.println();
        Write();                // Write File (Edit)
        System.out.println();
        Read();                 // Read File
        System.out.println();
        GetFileInfo();          // Info Files
        
        System.out.println();
        Delete();               // Delete File
    }
    
    public static void Create(){
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
              System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
            } else {
              System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    public static void Write(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void Delete(){
        File myObj = new File("filename.txt"); 
        if (myObj.delete()) { 
          System.out.println("Deleted the file: " + myObj.getName());
        } else {
          System.out.println("Failed to delete the file.");
        }
    }
    public static void Read(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);  
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    public static void GetFileInfo(){
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
          System.out.println("File name: " + myObj.getName()); 
          System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
          System.out.println("Writeable: " + myObj.canWrite()); 
          System.out.println("Readable: " + myObj.canRead()); 
          System.out.println("File size in bytes: " + myObj.length());
        } else {
          System.out.println("The file does not exist.");
        }
    }
    
}
