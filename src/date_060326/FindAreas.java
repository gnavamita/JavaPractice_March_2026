package date_060326;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure figuref;

        figuref = r;
        System.out.println( figuref.area());

        figuref = t;
        System.out.println(figuref.area());

        figuref = f;
        System.out.println(figuref.area());
    }
}
