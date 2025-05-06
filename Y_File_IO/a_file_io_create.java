package Y_File_IO;

import java.io.File;
import java.io.IOException;

public class a_file_io_create {
    public static void main(String[] args) {
        File file = new File("D:/java/Y_File_IO/a_myfile.txt");

        // if (!file.exists()) {
        // file.createNewFile();
        // System.out.println("File created successfully:");
        // } else {
        // System.out.println("File already exists:");
        // }

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created successfully:");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists:");
        }
    }
}