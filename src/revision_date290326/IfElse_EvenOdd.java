package revision_date290326;

public class IfElse_EvenOdd {

    void findEvenNumber(int number) {
        if (number % 2 == 0)
            System.out.println("number " + number + " is even");
        else
            System.out.println("number " + number + " is odd");
    }


    void findOddNumber(int number) {
        if (number % 2 == 1)
            System.out.println("number " + number + " is odd");
        else
            System.out.println("number " + number + " is even");
    }

    public static void main(String[] args) {
        IfElse_EvenOdd ob = new IfElse_EvenOdd();
        ob.findEvenNumber(5);
        ob.findEvenNumber(4);

        ob.findOddNumber(6);
        ob.findOddNumber(7);

    }

}
