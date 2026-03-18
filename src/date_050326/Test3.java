package date_050326;

public class Test3 {
    int a,b;

    Test3(int i, int j){
        a =i;
        b = j;
    }
    void meth(Test3 o){
        o.a = o.a*2;
        o.b = o.b/2;
    }
}
