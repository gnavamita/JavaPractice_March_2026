package date_040326;

public class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);
        System.out.println("before : "+ ob.a + " " +ob.b);

        ob.meth(ob);

        System.out.println("after : "+ ob.a + " "+ ob.b);
    }
}
