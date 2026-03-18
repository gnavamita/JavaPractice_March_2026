package date_02032026;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        Boolean isPrime = true;
        System.out.println("1 value of isprime:"+ isPrime);
        num =29;
        for (int i=2; i<=num/i;i++){
            if (num%i ==0){
                System.out.println("5value of isprime:"+ isPrime);
                isPrime = false;
                System.out.println("2 value of isprime:"+ isPrime);
                break;
            }
            else {
                isPrime = null;
                break;
            }
        }
        if (isPrime){
            System.out.println("3 value of isprime:"+ isPrime);
        }
        else  System.out.println("4 value of isprime:"+ isPrime);
    }
}
