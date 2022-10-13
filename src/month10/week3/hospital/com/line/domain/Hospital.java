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
}
