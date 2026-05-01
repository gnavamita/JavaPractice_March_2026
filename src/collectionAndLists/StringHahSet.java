package collectionAndLists;

import java.util.HashSet;
import java.util.Set;

class Student{

    int Rollno;

    String name;

    public Student(int rollno, String name){
        this.Rollno = rollno;
        this.name = name;
    }


}

public class StringHahSet {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();

        set.add(new Student(1, "Anuj"));
        set.add(new Student(1, "Anuj"));
        set.add(new Student(1, "Anuj"));
        System.out.println(set);

//        Set<String> set = new HashSet<>();
//        set.add("Ram");
//        set.add("sRam");
//        set.add("sham");
//        set.add("dham");
//        System.out.println(set);
    }
}
