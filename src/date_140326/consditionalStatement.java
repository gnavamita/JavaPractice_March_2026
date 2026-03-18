package date_140326;

public class consditionalStatement {
    public static void main(String[] args) {

        int i = 0;
        System.out.println("while loop started");
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("value if i outside loop : " + i);


        System.out.println("reverse while loop started");
       while (i>0){

           System.out.println("value of i: "+i);
           i--;
       }
        System.out.println("value of i outside loop: "+i);


       for (int j=0; j<3; j++){
           System.out.println(j);
       }

       for (int j=3; j>0; j--){
           System.out.println(j);
       }

int y = 10;
       if(y==0){
            System.out.println("y is 20");
        }
       else if(y==4){
            System.out.println(" y is 10");
        }
       else if(y==10){
           System.out.println(" y is 10");
       }
       else {
           System.out.println("y is 30");
       }


       int k = 4;
       switch (k){
           case 0:
               System.out.println("value of k: "+ k);
               break;
           case 4:
               System.out.println("value of k: "+ k);
               break;
           default:
               System.out.println("no value found");
               break;
       }

       String s1 = "january";
       if (s1.equals("feb")){
           System.out.println("s1 is "+s1);
       }
       else if (s1.equals("january")){
           System.out.println("s1 is "+s1);
       }
       else {
           System.out.println("s1 is march");
       }


       String s ="chrome";
       switch (s){
           case "browser":
               System.out.println("value of s: "+ s);
               break;

           case "chrome":
               System.out.println("value of s : "+ s);
               break;
           default:
               System.out.println("value of s : "+ s);
               break;
       }

    }


}
