package date_120426;

public class NoChange {
    public static void main(String[] args) {
        int nume[] = {1,2,3,4,5,6,7,8,9,10};
        for (int x: nume){
            System.out.println(x+"");
            x= x*10;
        }
        System.out.println();

        for (int x : nume)
            System.out.print(x+" ");
        System.out.println();
    }
}
