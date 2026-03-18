package date_050326;

public class StrinDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First String";
        String strOn2 = "Second String";
        String strOb3 = strOb1;

        System.out.println("length of strOb1: "+ strOb1.length());
        System.out.println("Char at index 3 in strOb1: " + strOb1.charAt(3));
        System.out.println("Char at index 3 in strOb1: " + strOb1.charAt(3));

        if (strOb1.equals(strOn2))
            System.out.println("strOb1 == strOb2");

        else
            System.out.println("strOb1 != strOb2");


        if (strOb1.equals(strOb3))
            System.out.println("strOb1 ==  strOb3");

        else
            System.out.println("strOb1 != strOb3");
    }
}
