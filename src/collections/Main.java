package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<String> set=new HashSet<>();
        Queue<String> queue=new LinkedList<>();
        Map<String, String> map=new HashMap<>();

        collection.add("one");
        collection.add("two");
        collection.size();
        collection.remove("one");
        collection.size();
        System.out.println(collection.size());
        System.out.println(collection.contains("one"));
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s : collection) {
            System.out.println(s);
        }

        list.add("zero");
        list.add("one");
        list.add("two");
        System.out.println(list.get(1));
        System.out.println(list.size());

        set.add("one");
        set.add("two");
        System.out.println(set.size());

        queue.add("one");
        queue.add("two");
        System.out.println(queue.element());
        System.out.println(queue.offer("three"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        map.put("1","one");
        map.put("2","two");
        map.remove(1);
        System.out.println(map.get(1));











    }
}







































