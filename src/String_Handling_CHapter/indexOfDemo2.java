package String_Handling_CHapter;

public class indexOfDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("One Two One");
        int i;
        i = sb.indexOf("One");
        System.out.println("First Index : "+ i);
         i = sb.lastIndexOf("One");
        System.out.println("Last Index : "+ i);
    }
}
