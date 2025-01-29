package handler;

import java.io.File;
import java.util.Scanner;

public class CreateFile {
    static void createFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = sc.nextLine();
        try{
            File file = new File(fileName);
            if(file.createNewFile()) {
            System.out.println("File created successfully\n");
            }
            else {
                System.out.println("File not created\n");
            }
        }
        catch(Exception e){
            System.out.println("File not created due to some error.");
        }

    }
}
