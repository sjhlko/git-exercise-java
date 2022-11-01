package algorithmInClass.primeNumber;

public class PrimeNumber {
    public boolean isPrimeNum(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrimeNum(13));
        System.out.println(primeNumber.isPrimeNum(17));
        System.out.println(primeNumber.isPrimeNum(19));
        System.out.println(primeNumber.isPrimeNum(23));

    }

}
