package revision_date280326;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;

        if (month== 12)
            System.out.println("december");
        else if(month== 3)
            System.out.println("march");
        else
            System.out.println("bogus month");

        System.out.println(month);
    }
}
