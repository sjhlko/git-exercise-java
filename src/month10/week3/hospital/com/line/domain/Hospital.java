package month10.week3.hospital.com.line.domain;

public class Hospital {
    private  String id;
    private  String address;
    private  String district;
    private String category;
    private int emergencyRoom;
    private  String name;
    private String subdivision;



    public String getDistrict() {
        return this.district;
    }

    public String setDistrict() {
        String[ ] splitted = this.address.split(" ");
        return String.format("%s %s", splitted[0],splitted[1]);
    }

    public Hospital(String id, String address, String category, int emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.district= setDistrict();
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return this.id;
    }

    public String getCategory() {
        return category;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public String getSqlInsertQuery(){
        String sql = "INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`,\n" +
                "`address`,\n" +
                "`district`,\n" +
                "`category`,\n" +
                "`emergency_room`,\n" +
                "`name`,\n" +
                "`subdivision`)\n" +
                "VALUES\n" +
                "('A1120837',\n" +
                "'서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)',\n" +
                "'서울특별시 금천구',\n" +
                "'C',\n" +
                "2,\n" +
                "'가산기대찬의원',\n" +
                "null);\n";

        return sql;
    }

}
