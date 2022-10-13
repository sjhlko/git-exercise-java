package month10.week3.hospital.com.line.parser;

import month10.week3.hospital.com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    private  String replaceAllQuot(String str){
        return str.replaceAll("\"","");
    }
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(replaceAllQuot(splitted[0]),replaceAllQuot(splitted[1]));
    }
}
