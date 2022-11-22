package algorithmInClass.recursive;

public class Print100Times {
    public void print(int n){
        if(n>100)
            return;
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        Print100Times p = new Print100Times();
        p.print(1);
    }
}
