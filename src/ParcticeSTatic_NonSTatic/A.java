package ParcticeSTatic_NonSTatic;

public class A {
    public int a = 1;

    public void meth() {
        System.out.println("this is a test");
    }

    static public void meth2() {

    }

    public static String s = "Hello";

    public static void   meth1() {
        System.out.println("Hello world");
        A obj = new A();
        System.out.println(obj.a);
        meth2();
        System.out.println(s);
        obj.meth();

    }

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);
        obj.meth();
        meth2();
        System.out.println(s);

    }

}

