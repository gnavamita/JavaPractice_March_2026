package date_060326;

public class Rectangle2 extends Figure2{
    Rectangle2(double a, double b) {
        super(a, b);
    }
        double area(){
            System.out.println("inside rectangle");
        return dim1*dim2;
    }
}
