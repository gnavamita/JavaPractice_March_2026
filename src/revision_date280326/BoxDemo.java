package revision_date280326;

import MyPack.B;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);

        double vol;
        System.out.println(mybox1.volume());
        System.out.println(mybox1.volume());
    }
}
