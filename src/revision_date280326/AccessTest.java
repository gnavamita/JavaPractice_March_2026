package revision_date280326;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        //ob.c =20;
        ob.b = 20;
        ob.setc(100);
        System.out.println(ob.a+ob.b + ob.getc());
    }
}
