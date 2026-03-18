package date_140326;

public class ObjectsAndMethodsAndConstructors {
    int i = 1;
    int j = 2;

    public ObjectsAndMethodsAndConstructors(){
        System.out.println("This is a constructor");
        System.out.println("value of i:"+ this.i + " value of j : "+this.j);
    }

    public ObjectsAndMethodsAndConstructors(int a, int b, String s) {
        if (s.equals("add"))
            System.out.println("Addition :"+(a + b));
        else if (s.equals("substract"))
            System.out.println("substraction :"+(a - b));
        else if (s.equals("multiply"))
            System.out.println("multiply :"+(a * b));
        else if (s.equals("divide"))
            System.out.println("divide :"+(a / b));
        else
            System.out.println("incorrect function called");
    }


    public void Add_NonReturn(int x, int y) {
        System.out.println(x + y);
    }

    public int Add_Return(int x, int y) {
        return (x + y);
    }

    public int calculator_Ef_else(int a, int b, String s) {
        if (s.equals("add"))
            return a + b;
        else if (s.equals("substract"))
            return a - b;
        else if (s.equals("multiply"))
            return a * b;
        else if (s.equals("divide"))
            return a / b;
        else
            return 0;
    }

    public double calculator_Switch(double a, double b, String s) {
        switch (s) {
            case "add" :
                return a + b;

            case "substract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide" :
                return a / b;

            default:
                return 0;

        }
    }



    public static void main(String[] args) {
        ObjectsAndMethodsAndConstructors ob = new ObjectsAndMethodsAndConstructors();
        ObjectsAndMethodsAndConstructors ob1 = new ObjectsAndMethodsAndConstructors(2,4,"add");


        System.out.println(ob1.i);
        ob.Add_NonReturn(10, 20);
        System.out.println(ob.Add_Return(5, 4));

        int a = 4;
        int b = 5;
        int c = b + a;

        if (c == 1) {
        }

        if (ob.Add_Return(1, 2) > 50) {
            System.out.println("fi is true");
        } else
            System.out.println("else");


        System.out.println(ob.calculator_Switch(10,20,"add"));
        System.out.println(ob.calculator_Switch(10,20,"substract"));
        System.out.println(ob.calculator_Switch(10,20,"multiply"));
        System.out.println(ob.calculator_Switch(10,20,"divide"));
    }
}
