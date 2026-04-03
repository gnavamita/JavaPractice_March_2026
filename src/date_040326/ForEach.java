package date_040326;

public class ForEach {
    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int x: nums){
            System.out.println("value of x: "+ x);
            sum += x;
        }
        System.out.println("summation : "+ sum);

    }

}
