package date_280426;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,8,9,4,5,3,2,1};
        int val =5;
        boolean found = false;

        for (int x:nums){
            if (x==val) {
                found =true;
            }
        }
        if (found)
            System.out.println("value found");
    }
}
