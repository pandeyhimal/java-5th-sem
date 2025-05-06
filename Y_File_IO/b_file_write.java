package Y_File_IO;

import java.io.FileWriter;
import java.io.IOException;

public class b_file_write {
    public static void main(String[] args) throws IOException {
        String str = "qwertyuiop asdfghjkl zxcvbnm";
        FileWriter fw = new FileWriter("D:/java/Y_File_IO/a_myfile.txt");

        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        System.out.println("Data has been uploaded:");
        fw.close();
    }
}
