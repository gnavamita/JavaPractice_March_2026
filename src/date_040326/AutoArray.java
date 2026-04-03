package date_040326;

public class AutoArray {
    public static void main(String[] args) {
        try {
            int month_days[] = {31, 28, 31, 30};
            System.out.println(month_days[4]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("i will run any way");
        }
    }
}
