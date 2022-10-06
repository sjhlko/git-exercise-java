package month10.week2.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    char readByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );

        return (char)br.read();


    }
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("");
        try{
            char c = readFile.readByte("./a_file.txt");
            System.out.println(c);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
