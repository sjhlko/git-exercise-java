package month10.week2.fileIO;



import java.io.*;

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
    String read2Byte(String filename) throws IOException{
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );
        String s="";
        s=s+(char)br.read()+(char)br.read();
        return s;
    }
    String readNByte(String filename,int n) throws IOException{
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );
        String s="";
        for(int i=0;i<n;i++){
            s= s+(char)br.read();
        }

        return s;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File dir= new File("./");
        //file 목록 읽기
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        ReadFile readFile = new ReadFile("");
        try{
            char c = readFile.readByte("./a_file.txt");
            String s = readFile.read2Byte("./a_file.txt");
            String s2 = readFile.readNByte("./a_file.txt",4);
            System.out.println(c);
            System.out.println(s);
            System.out.println(s2);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
