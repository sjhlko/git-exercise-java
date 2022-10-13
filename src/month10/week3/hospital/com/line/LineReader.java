package month10.week3.hospital.com.line;

import month10.week3.hospital.com.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    Parser<T> parser;
    List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        while((str=br.readLine())!=null){
            result.add(parser.parse(str));
        }
        return  result;
    }

    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\User\\Downloads\\seoul_hospital_infos.csv";
        LineReader lr = new LineReader();
        List<String> lines = lr.readLines(filename);
        System.out.println(lines.size());
    }
}
