package Y_File_IO;

// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

import java.io.*;

public class f_file_read_filereader {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        // FileReader fr = new FileReader("D:/java/Y_File_IO/a_myfile.txt");
        try {
            fr = new FileReader("D:/java/Y_File_IO/a_myfile.txt");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found:" + fe);
        }
        fr.close();
    }
}
