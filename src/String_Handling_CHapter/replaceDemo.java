package String_Handling_CHapter;

public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a Test.");
        sb.replace(5,7,"was");
        System.out.println("After replace: "+ sb);
    }
}
