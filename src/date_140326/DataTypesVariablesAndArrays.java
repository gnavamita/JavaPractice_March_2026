package date_140326;

public class DataTypesVariablesAndArrays {
    public static void main(String[] args) {
        int a =1;
        byte b = 3;
        char c = 'x';
        double d = 1.233;
        long l = 4543535;
        float f = 454654f;
        boolean bool = false;
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
        System.out.println("d: "+ d);
        System.out.println("l: "+ l);
        System.out.println("f: "+ f);
        System.out.println("bool: "+ bool);
//

        int [] arr = new int[14];

int [] arr1 = {4,5,8,9,7,1,6};
char[] c1 = {'x','y'};
boolean[] bool1 = {true, false,true};

        System.out.println("arr: "+ arr1);

        // init, condi, itera

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

        for (int x = 0; x<arr.length;x++){ // x<arr.lenth // 4

            System.out.println("Arr : "+arr1[x]);
        }


    }
}
