package month10.week3.hospital.com.line.domain;

public class Hospital {
    private  String id;
    private  String address;

    public Hospital parse;

    public Hospital(String s) {
        this.id=s.replaceAll("\"","");
    }

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return this.id;
    }
}
