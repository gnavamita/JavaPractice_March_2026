package p1;

public class ANotherClient implements CallBack{
    public void callback(int p){
        System.out.println("ANother version of callback");
        System.out.println("p squared is "+ (p*p));
    }
}
