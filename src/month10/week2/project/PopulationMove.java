package month10.week2.project;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public PopulationMove(String toSido, String fromsido) {
        this.toSido = Integer.parseInt(toSido);
        this.fromSido = Integer.parseInt(fromsido);

    }

    public PopulationMove parse(String data){
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0],splittedLine[1]); //전입 to 전출 from
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
