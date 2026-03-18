package date_02032026;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i=0; i<12; i++)
            switch (i){
                case 0:
                case 1:
                case 2:
                    System.out.println("i is less than 3");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("i is less than 6");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }

    }
}
