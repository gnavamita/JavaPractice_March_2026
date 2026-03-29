package revision_date290326;

public class SwitchCase {

    void Weather(String season){
        try{
            switch (season){
                case "summer":
                    System.out.println("this is "+ season);
                    break;
                case "winter":
                    System.out.println("this is "+ season);
                    break;
                case "Rainy":
                    System.out.println("this is "+ season);
                    break;
                default:
                    System.out.println("bogus season");
                    break;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }


    }

    public static void main(String[] args) {

        try {
            SwitchCase ob = new SwitchCase();
            ob.Weather("summer");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
