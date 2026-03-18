package date_04032026;

public class Box {
    double width;
    double height;
    double depth;
//
//    void volume(){
//        System.out.print("volume is ");
//        System.out.println(width* height* depth);
////}
//        double volume(){
//            return width* height* depth;
//        }
//
//        void setDim(double w, double h, double d){
//            width = w;
//            height = h;
//            depth =d;
//
//        }

    Box(){
        System.out.println("constructing box");
        width =10;
        height = 20;
        depth = 15;

    }
    double volume(){
    return width * height* depth;
    }

    }




