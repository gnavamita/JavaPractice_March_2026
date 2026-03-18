package GIT_Practice_date_180326;

public class Substraction {
    Substraction(int a, int b){
        System.out.println("constrcutor ");
        System.out.println("Multiplication of a and b : "+a*b);
    }

    public void sub(int a, int b){
        System.out.println("substraction of a-b : "+(a-b));
    }

    public static void main(String[] args) {
        Substraction ob = new Substraction(4,7);
        ob.sub(4,1);
    }
}
