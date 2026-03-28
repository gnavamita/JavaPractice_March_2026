package String_Handling_CHapter;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public String toString(){
        return "dimensions are "+ width + " by "+ depth + " by "+ height + ".";
    }
}
