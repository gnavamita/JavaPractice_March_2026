package date_040326;

public class SampleSwitch {
    public static void main(String[] args) {
        int i;
        for ( i=0; i<6;i++){
            switch (i){
                case 0:
                    System.out.println("is is zero");

                case 1:
                    System.out.println("i is one");

                case 2:
                    System.out.println("i is two");

                default:
                    System.out.println("bogus month");

            }

        }
        System.out.println("value of i: "+ i);
    }
}
