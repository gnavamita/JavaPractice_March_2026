package date_060326;

import date_04032026.Box;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10,20,15,34.4);
        BoxWeight1 mybox2 = new BoxWeight1(2,3,4,0.076);
        BoxWeight1 mybox3 = new BoxWeight1();
        BoxWeight1 mycube = new BoxWeight1(3,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println(vol);
        System.out.println(mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println(vol);
        System.out.println(mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println(vol);
        System.out.println(myclone.weight);
        System.out.println();

    }
}
