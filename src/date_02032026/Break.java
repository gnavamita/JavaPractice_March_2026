package date_02032026;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
            third: {
                System.out.println("Before the break.");
                if (t) break second;
                System.out.println("1 This wont execute");
            }
                System.out.println("2 This wont execute");
            }
            System.out.println("This is after second block");
        }
    }
}
