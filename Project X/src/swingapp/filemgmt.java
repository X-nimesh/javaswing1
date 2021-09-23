package swingapp;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class filemgmt {
  public static void main(String[] args) {
    try {

      FileWriter myWriter = new FileWriter("D:\\filename.txt");
      Scanner scn =new Scanner(System.in);
      System.out.println("Enter what you want to write");

    String content = scn.nextLine(); 
      myWriter.write(content);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");

    } catch (IOException e) {

      System.out.println("An error occurred.");
      e.printStackTrace();

    }
  }
}