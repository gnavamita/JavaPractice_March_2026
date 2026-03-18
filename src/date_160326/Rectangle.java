package date_160326;

import date_060326.Rectangle2;

public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside area of Rectangle");
        return dim1*dim2;
    }
}
