package collectionAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {

        List<String> fruit = new LinkedList<>();

        fruit.add("kiwi");
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("mango");

        for (int i=0; i<fruit.size();i++){
            System.out.println(fruit.get(i));
        }

        for (String fruits : fruit){
            System.out.println("for each fruits :"+ fruits);
        }


        Iterator<String> fe = fruit.iterator();

        while (fe.hasNext()){
            System.out.println("iterator "+fe.next());
        }

        List<String> smallList = fruit.subList(1,2);
        System.out.println(smallList);

    }
}
