package map;

import java.util.*;

public class MapLesson {
    public static void main(String[] args) {
        Map<String ,String > hashMap=new HashMap<>();
        Map<String ,String > linkedHashMap=new LinkedHashMap<>();
        Map<String ,String > treeMap=new TreeMap<>();
        Map<String ,String > hashTable=new Hashtable<>();
        Map<String ,String > syncHashMap=Collections.synchronizedMap(new HashMap ());

        TreeMap<String,String>treeMap1=new TreeMap<>();
        treeMap1.put("a","1");
        treeMap1.put("b","2");
        treeMap1.put("d","4");
        treeMap1.put("c","3");
        System.out.println(treeMap1.subMap("a","b").lastKey());
        System.out.println(treeMap1.subMap("c","d").firstKey());
        System.out.println(treeMap1.tailMap("c"));
        System.out.println(treeMap1.headMap("c").lastKey());


    }
}
