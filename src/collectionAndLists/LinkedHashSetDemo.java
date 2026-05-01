package collectionAndLists;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(17);
        set.add(14);
        set.add(14);
        set.add(11);
        System.out.println("linkedHashet gives straight elemts and not random");
        System.out.println(set);

    }
}
