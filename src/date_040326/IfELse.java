package date_040326;

public class IfELse {
    public static void main(String[] args) {
        int month = 4;
        String season;

        if (month==12 || month ==1 || month==2){
            season = "winter";

        }
        else if(month==3 ||month==4 || month==5){
            season="spring";
        }
        else {
            season ="bogus month";
        }
        System.out.println(season);
    }
}
