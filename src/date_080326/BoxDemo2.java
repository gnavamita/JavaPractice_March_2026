package date_080326;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width =1;
        mybox1.depth =2;
        mybox1.height = 3;

        System.out.println(mybox1.width * mybox1.height * mybox1.depth);
        mybox2.width = 4;
        mybox2.height = 6;
        mybox2.depth = 8;
        System.out.println(mybox2.width* mybox2.depth*mybox2.height) ;




    }

}
