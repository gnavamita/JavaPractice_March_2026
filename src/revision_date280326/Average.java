package revision_date280326;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1,11.2,12.3,13.4};
        double result = 0;
        int i;
        for (i =0; i<5; i++)
            result = result+nums[i];

        System.out.println(result/5);
    }
}
