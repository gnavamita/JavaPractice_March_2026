package date_040326;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,5,7,8,9,3};
        int val =0;
        boolean found = false;

        for (int x: nums){
            if (x==val){
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("value found!");
    }
}
