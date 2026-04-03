package date_040326;

public class Test2 {
    int a, b;

    Test2(int i, int j){
        a=i;
        b = j;
    }
    void meth(Test2 o){
        o.a = o.a*2;
        o.b = o.b/2;
    }
}
