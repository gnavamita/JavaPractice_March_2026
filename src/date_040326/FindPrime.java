package date_040326;

import org.w3c.dom.ls.LSOutput;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;

        num=14;
        for (int i=2; i<=num/i;i++){
            if (num%i ==0){
                isPrime = false;
                break;
            }

        }
        if (isPrime) System.out.println("prime");
        else System.out.println("not prime");
    }
}
