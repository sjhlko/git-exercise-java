package algorithmInClass.dp;

public class Lcs {
    public int[][] makeArr(String first, String second){
        int firLen = first.length();
        int secLen = second.length();
        return new int[firLen][secLen];
    }
}
