package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLesson {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        Set<String> linkedHashSet=new LinkedHashSet<>();
        Set<String> treeSet=new TreeSet<>();
//        hashSet.add("One");
//        hashSet.add("One");
//        hashSet.add("One");
//        System.out.println(hashSet.size());//1
//        hashSet.add(null);
//        System.out.println(hashSet.size());
//        System.out.println(hashSet.contains(null));

        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");
        for (String s:treeSet) {
            System.out.println(s);
        }

        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        for (String s:hashSet) {
            System.out.println(s);
        }

        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        linkedHashSet.add("five");
        for (String s:linkedHashSet) {
            System.out.println(s);
        }




    }

}
