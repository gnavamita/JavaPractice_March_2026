package date_280426;

public class DynInit {
    public static void main(String[] args) {
        double a = 4, b = 4;
        // c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse is "+ c);
    }
}
