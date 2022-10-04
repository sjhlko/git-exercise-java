public class ArrayTest {
    public static void main(String[] args) {
        //System.out.println("hello"); //alt shift f10 ==build 실행 단축키
        //10칸의 int array를 만들고 1부터 10까지 채우고 출력하기
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }

    }
}
