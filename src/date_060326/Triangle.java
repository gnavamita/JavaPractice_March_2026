package date_060326;

public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("inside of area of triangle");
        return dim1 * dim2 /2;
    }
}
