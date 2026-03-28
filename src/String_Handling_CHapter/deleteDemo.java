package String_Handling_CHapter;

public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a Test");
        sb.delete(4,7);
        System.out.println("AFter delete: "+ sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
