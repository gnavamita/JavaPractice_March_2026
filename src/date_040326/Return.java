package date_040326;

public class Return {
    public static void main(String[] args) {
        try {
            boolean t = true;
            System.out.println("before the return");

            return;

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am finally");
        }
    }
}
