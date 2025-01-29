package handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    static void usingScanner(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            System.out.println("File has been read.\n");
        } catch (FileNotFoundException e) {
            System.out.println("File not found\n");
        }
    }

    static void usingFileReader(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) { // Using read method
                System.out.print((char) i);
            }
            fileReader.close();
            System.out.println("File has been read.\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
