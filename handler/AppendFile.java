package handler;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
    static void appendFile(File file){
        try {
            FileWriter fw = new FileWriter(file,true);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter content to write into file: ");
            String str = "\n"+sc.nextLine();
            fw.write(str);
            System.out.println("Content appended to file successfully!\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
