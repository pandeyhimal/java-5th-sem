package Y_File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class h_file_copy_char {
    public static void main(String[] args) throws IOException{
        //existing file
        File file = new File("D:/java/Y_File_IO/a_myfile.txt");
        FileInputStream fis = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        // Reading data from the file
        fis.read(bytes);
        // Writing data to another file
        File out = new File("D:/java/Y_File_IO/b_myfile.txt");
        try (FileOutputStream outputStream = new FileOutputStream(out)) {
            // writing data to the file
            outputStream.write(bytes);
            outputStream.flush();
        }
        System.out.println("Data has been written successfully:");
        fis.close();
    }
}

//Java Development kit(jdk)
