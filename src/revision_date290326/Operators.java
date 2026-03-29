package revision_date290326;

public class Operators {

    void DifferentOperators(int a, int b) {

        System.out.println("a : " + a + " b : " + b);
        System.out.println("++a :" + (++a));
        System.out.println("b++ :" + (b++));
        System.out.println("a!=b " + (a != b));
        System.out.println("a % b " + (a % b));
        System.out.println("a-- " + (a--));
        System.out.println("--b " + (--b));
    }

    public static void main(String[] args) {
        Operators ob = new Operators();
ob.DifferentOperators(2,3);


    }
}
