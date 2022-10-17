package month10.week3.hospital.com.line;

import month10.week3.hospital.com.line.domain.Hospital;
import month10.week3.hospital.com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class HospitalMain {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\User\\Downloads\\seoul_hospital_infos.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);
        System.out.println(hospitals.get(0).getSqlInsertQuery());
        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.printf("%s,%s,%s,%s,%d,%s,%s\n",
                    hospital.getId(),hospital.getAddress(), hospital.getDistrict()
                    ,hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(),
                    hospital.getSubdivision());
        }
    }
}
