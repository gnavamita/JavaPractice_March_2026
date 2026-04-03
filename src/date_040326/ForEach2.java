package date_040326;

public class ForEach2 {
    public static void main(String[] args) {
        int sum =0;
        int nums[] = {1,2,3,4,5};

        for (int x: nums){
            System.out.println("value of x: "+ x);
            sum = sum+x;
            System.out.println(sum);
            if (x==5) break;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
