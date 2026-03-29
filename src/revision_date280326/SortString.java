package revision_date280326;

public class SortString {
    static String arr[] = {"Now", "is", "the", "time"};

    public static void main(String[] args) {
        int j;
        for ( j = 0; j< args.length; j++) {
            for (int i = j; i < arr.length; i++) {
                String t = arr[j];
                System.out.println(t);
            }
        }
        System.out.println(arr[j]);
    }
}
