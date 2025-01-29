package handler;

import java.io.File; // Import the File class
import java.util.Scanner;

//import static handler.AboutFile.aboutFile;
//import static handler.AppendFile.appendFile;
//import static handler.CreateFile.createFile;
//import static handler.ReadFile.usingFileReader;
//import static handler.ReadFile.usingScanner;
//import static handler.WriteFile.writeFile;

public class FileHandle {
    public static void main(String[] args) {
        System.out.println("Welcome to 'File Handle Utility'");
        System.out.println("Here is the Menu for it: \n");
        System.out.println("******************************");
        System.out.println("c   -  for creating a file");
        System.out.println("s   -  for Reading file using Scanner class");
        System.out.println("r   -  for Reading file using FileReader class");
        System.out.println("w   -  for writing file");
        System.out.println("a   -  for appending to file");
        System.out.println("i   -  for getting file information");
        System.out.println("q   -  for quitting..");
        System.out.println("******************************\n");
        File fileObj = new File("file2.txt");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter menu option:  ");
            String inp = sc.next();
            if (inp.length() == 1) {
                char c = inp.charAt(0);
                if (c=='q' || c=='Q') {break;}
                switch (c) {
                    case 's':
                        ReadFile.usingScanner(fileObj);
                        break;
                    case 'r':
                        ReadFile.usingFileReader(fileObj);
                        break;
                    case 'w':
                       WriteFile.writeFile(fileObj);
                        break;
                    case 'a':
                        AppendFile.appendFile(fileObj);
                        break;
                    case 'c':
                        CreateFile.createFile();
                        break;
                    case 'i':
                        AboutFile.aboutFile(fileObj);
                        break;
                    default:
                        System.out.println("\nInvalid input...\n");
                        break;
                }
            } else {
                System.out.println("\nInvalid input...\n");
            }
        }
    }
}