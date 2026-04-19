package date_15042026;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i=0; i<6; i++){
            switch (i){
                case 0:
                    System.out.println("i is zero. ");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                default:
                    System.out.println("bogus month");
                    break;
            }
        }
    }
}
