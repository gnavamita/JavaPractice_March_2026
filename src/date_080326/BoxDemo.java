package date_080326;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 10;
        mybox.width =20;
        mybox.height = 30;

        vol = mybox.width* mybox.depth+ mybox.height;
        System.out.println(vol);
    }
}
