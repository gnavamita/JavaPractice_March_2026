package revision_date290326;

public class ConstructorsDemo {
    int x;
    int y;

    ConstructorsDemo() {
        try {
            System.out.println("This is constrcutor ");
        } catch (
                Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("this will run in class type ");
        }

    }

    ConstructorsDemo(int a) {
        try {
            x = a;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("second finally");
        }
    }

    ConstructorsDemo(int a, int b) {
        try {

            x = a;
            y = b;
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("third finally");
        }


    }


    public static void main(String[] args) {
        try {
            ConstructorsDemo ob1 = new ConstructorsDemo();
            // This is constrcutor
            // this will run in class type
            ConstructorsDemo ob2 = new ConstructorsDemo(5);
            //second finally
            ConstructorsDemo ob3 = new ConstructorsDemo(6, 7);
            //"third finally
            System.out.println("value of x in ob2: " + ob2.x);
            //value of x in ob2: 5
            System.out.println("value of ob3.x : " + ob3.x + " ob3.y : " + ob3.y);
            //"value of ob3.x 6 ob3.y 7
            // This will run in main method
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This will run in main method");
        }
    }
}

