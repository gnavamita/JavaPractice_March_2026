package date_02032026;

public class ForEach2 {
    public static void main(String[] args) {
        int sum =0;
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        for (int x: num){
            System.out.println("value is: "+ x);
            sum = sum+x;
            if (x==5) break;
        }
        System.out.println("summation of first 5 elements: "+ sum);
    }
}
