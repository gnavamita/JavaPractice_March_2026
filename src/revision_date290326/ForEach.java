package revision_date290326;

public class ForEach {


    /*
     * int [] no = {3,5,8,4};
     *
     * for(int x : no)
     * // x = 3, x= 5, x= 8, x=4
     *
     * for(int j = 0; j<no.lenth ; j++)
     * j =0, to get  3 --> no[j] --> no[0] --> 3
     * */
    void additionOfArray(int[] number) {

        try {
            int temp = 0;
            for (int x : number) {
                temp = temp + x;
            }
            System.out.println("sum of array: " + temp);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally will always run.");
        }

    }

    public static void main(String[] args) {
        try {
            ForEach ob = new ForEach();
            ob.additionOfArray(new int[]{4, 5, 2, 1});
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally running in main method");
        }
    }
}
