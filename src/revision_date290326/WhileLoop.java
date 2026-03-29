package revision_date290326;

public class WhileLoop {

    void factorial(int number) { //1*2*3 5*4*3*2*1;
        int temp = 1;
        System.out.print("factorial of " + number + " is " );
        while (number > 0) {


            temp = temp * number;
            number--;
        }
        System.out.println( temp);

    }

    public static void main(String[] args) {
        WhileLoop ob = new WhileLoop();
        ob.factorial(5);
    }

}
