package p1;

public class Client implements CallBack{
    public void callback(int p){
        System.out.println("callback called with "+ p);
    }

    void nonIfaceMeth(){
        System.out.println("classes that implement interfaces "+ "may also define other members too.");
    }
}
