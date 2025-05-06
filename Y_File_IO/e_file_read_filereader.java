package Y_File_IO;

// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class e_file_read_filereader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:/java/Y_File_IO/a_myfile.txt");
        int a;

        while ((a = fr.read()) != -1) {
        System.out.print((char) a);
        }
        // try {
        //     while ((a = fr.read()) != -1) {
        //         System.out.print((char) a);
        //     }

        // } catch (FileNotFoundException e) {
        //     System.out.println(e);
        // }
        fr.close();
    }
}
