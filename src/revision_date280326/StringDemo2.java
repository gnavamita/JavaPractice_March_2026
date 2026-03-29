package revision_date280326;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First String";
        String strOb2 = "second String";
        String strOb3 = strOb1;
        System.out.println("length of strOb1: "+ strOb1.length());
        System.out.println(strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("==");
        else
            System.out.println("!=");

        if (strOb1.equals(strOb3))
            System.out.println("==");
        else
            System.out.println("!=");
    }
}
