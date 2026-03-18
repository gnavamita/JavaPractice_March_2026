package date_04032026;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        System.out.println(mybox1.width* mybox1.depth* mybox1.height);
        System.out.println(mybox2.width* mybox2.height* mybox2.depth);
    }
}
