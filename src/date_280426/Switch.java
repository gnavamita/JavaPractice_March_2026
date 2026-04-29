package date_280426;

public class Switch {
    public static void main(String[] args) {
        int month =4;
        String season;
        switch (month){
            case 1:
            case 2:
            case 3:
                season="winter";
                break;

            case 4:
            case 5:
            case 6:
                season="Spring";
                break;

            case 7:
            case 8:
            case 9:
                season="summer";
                break;
            case 10:
            case 11:
            case 12:
                season="autumn";
                break;
            default:
                season="Bogus month";

        }
        System.out.println("april is in the "+season+".");
    }
}
