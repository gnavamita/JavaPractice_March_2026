package date_120426;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                break;
            default:
                season = "Bogus month";
                System.out.println("April is month of "+ season+ ".");
        }
        System.out.println("April is month of "+ season+ ".");

    }
}
