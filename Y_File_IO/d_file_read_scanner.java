package Y_File_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d_file_read_scanner {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("D:/java/Y_File_IO/a_myfile.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
