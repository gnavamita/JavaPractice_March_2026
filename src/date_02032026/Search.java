package date_02032026;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,5,7,8,9,0};
        int value = 5;
        boolean found = false;

        for(int x : nums) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("value found!");
    }
}
