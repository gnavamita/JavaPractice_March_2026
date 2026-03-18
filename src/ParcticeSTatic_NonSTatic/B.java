package ParcticeSTatic_NonSTatic;

public class B {
    static public void meth1() {
        A obj = new A();
        System.out.println(obj.a);
        obj.meth();
        A.meth2();
        System.out.println(A.s);
        A.meth1();
    }

    public void meth2() {
        A obj = new A();
        System.out.println(obj.a);
        obj.meth();
        A.meth2();
        System.out.println(A.s);
        A.meth1();
    }


}
