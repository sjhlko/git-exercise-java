package month10.week3.hospital.com.line.parser;

import month10.week3.hospital.com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    private  String replaceAllQuot(String str){
        return str.replaceAll("\"","");
    }
    @Override
    public Hospital parse(String str) {
        str = replaceAllQuot(str);
        String[] splitted = str.split(",");
        return new Hospital(splitted[0],splitted[1],splitted[2],Integer.parseInt(splitted[6]),splitted[4],splitted[5]);
    }
}
