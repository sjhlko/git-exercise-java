package month10.week3.hospital.com.line.parser;

import month10.week3.hospital.com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0]);
    }
}
