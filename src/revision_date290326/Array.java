package revision_date290326;

public class Array {
    int[] arr = {1, 2, 3, 4, 5};


    public static void main(String[] args) {
        int temp = 0;
        Array ob = new Array();
        for (int x = ob.arr.length - 1; x >= 0; x--) {

            temp = temp + ob.arr[x];

        }
        System.out.println("sum of arr: "+temp);


    }
}