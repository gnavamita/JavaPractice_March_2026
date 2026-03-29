package revision_date280326;

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
                season ="Spring";
                break;
            default:
                season="bogus month";
        }
        System.out.println("April is in the "+ season+".");
    }
}
