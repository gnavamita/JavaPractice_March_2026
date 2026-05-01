package collectionAndLists;

import java.util.HashSet;
import java.util.Set;

public class HashSetsDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(70);
        set.add(70);
        System.out.println("hashSet gives random numbers");

        System.out.println(set);
    }
}
