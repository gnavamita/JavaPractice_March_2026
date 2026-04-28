package date_120426;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,6,8,3,4,9,1,2};
        int val = 4;
        boolean found = false;

        for (int x : nums){
            if (x==val){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("value found");
    }
}
