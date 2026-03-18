package date_160326;

public class AbstractAreas {
    public static void main(String[] args) {
       // Figure f = new Figure();
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figuref;

        figuref = r;
        System.out.println(figuref.area());
        figuref = t;
        System.out.println(figuref.area());
    }
}
