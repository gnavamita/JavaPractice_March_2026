package revision_date280326;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,5,7,3,8,1,2};
        int val = 8;
        boolean found = false;

        for (int x: nums){
            if (x==val){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found");
    }
}
