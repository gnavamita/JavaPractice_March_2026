package date_060326;

public class AbstractAreas {
    public static void main(String[] args) {
      //  Figure2 f = new Figure2(10,10);
        Triangle2 t = new Triangle2(10,8);
        Rectangle2 r = new Rectangle2(9,5);
    Figure2 figuref;
        figuref = r;
        System.out.println(figuref.area());
figuref = t;
        System.out.println(figuref.area());

    }
}
