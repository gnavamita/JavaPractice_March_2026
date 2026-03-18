package MyPack;

public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
         current[1] = new Balance("a,j", 123.2);
         current[2] = new Balance("will tell", 157.02);
         current[3] = new Balance("Tom Jackson", -12.33);

         for (int i=0; i<3; i++)
             current[i].show();

    }
}
