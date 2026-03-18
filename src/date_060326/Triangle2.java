package date_060326;

public class Triangle2 extends Figure2{
    Triangle2(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("Inside area of Triangle");
        return dim1* dim2/2;
    }
}
