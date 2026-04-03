package date_040326;

public class Test3 {
    int a;

    Test3(int i){
        a=1;
    }

    Test3 incrByTen(){
        Test3 temp = new Test3(a+10);
        return  temp;
    }
}
