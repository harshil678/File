package handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    static void writeFile(File file) {
        try {
            FileWriter fw = new FileWriter(file);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter content to write into file: ");
            String str = sc.nextLine();
            fw.write(str);
            System.out.println("File written successfully!\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred. Unable to write the file due to system error\n");
        }
    }
}
