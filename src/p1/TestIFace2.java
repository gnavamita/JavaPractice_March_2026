package p1;

public class TestIFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        ANotherClient ob = new ANotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
