package month10.week3.hospital.com.line;

import month10.week3.hospital.com.line.parser.HospitalParser;
import month10.week3.hospital.com.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    Parser<T> parser;
    boolean isRemoveColumnName = true;

    public LineReader(Parser<T> parser ) {
        this.parser = parser;
    }
    public LineReader(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        while((str=br.readLine())!=null){
            result.add(parser.parse(str));
        }
        return  result;
    }


}
