package date_02032026;

public class Switch {
    public static void main(String[] args) {
        int month =4;
        String season;
        switch (month){
            case 0:
            case 1:
            case 2:
            season = "winter";
            break;
            case 3:
            case 4:
            case 6:
                season = "spring";
                break;
            default:
                season= "bogus month";

        }
        System.out.println("April is in the "+ month + ".");
    }
}
