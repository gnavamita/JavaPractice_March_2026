package collectionAndLists;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //   List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1);

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1, 200);
        System.out.println(list);
        list.add(2, 1000);
        System.out.println(list);
        list.remove(Integer.valueOf(200));
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list);
        System.out.println(list.indexOf(100));
        System.out.println(list.lastIndexOf(1));


//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(200));
//        System.out.println(list.remove(0));
//        System.out.println(list);


//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//
//
//       // list.addAll(list2);
//        System.out.println(list);
//       // System.out.println(list.removeAll(list2));
//        System.out.println(list.retainAll(list2));
//      //  list.clear();
//
//        Object a[] = list.toArray();
//
//        for (Object e:a){
//            Integer temp = (Integer) e;
//            System.out.println(temp);


    }

}
