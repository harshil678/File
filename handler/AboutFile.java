package handler;

import java.io.File;

public class AboutFile {
    static void aboutFile(File file){
        System.out.println("\nFile Name:  "+file.getName());
        System.out.println("File canRead:  "+file.canRead());
        System.out.println("File canWrite:  "+file.canWrite());
        System.out.println("File size in bytes:  "+file.length()+"\n");
    }
}
