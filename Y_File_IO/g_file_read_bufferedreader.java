package Y_File_IO;

import java.io.BufferedReader;
import java.io.File;
// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class g_file_read_bufferedreader {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\Y_File_IO\\a_myfile.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        br.close();
    }
}
