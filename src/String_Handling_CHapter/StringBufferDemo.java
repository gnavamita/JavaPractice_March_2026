package String_Handling_CHapter;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer = "+ sb);
        System.out.println("length = "+sb.length());
        System.out.println("capacity = "+sb.capacity());

    }
}
