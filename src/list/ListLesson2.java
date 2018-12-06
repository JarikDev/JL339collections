package list;

import java.util.*;

public class ListLesson2 {
    public static void main(String[] args) {
        List<Integer> arrayList    = new ArrayList<>();
        List<Integer>vectorr=new Vector<>();
        List<Integer>syncList=Collections.synchronizedList(new ArrayList<>());

//        arrayList.add("A");
//        arrayList.add("C");
//        arrayList.add("B");
//        Collections.sort(arrayList);
//        System.out.println(arrayList.get(Collections.binarySearch(arrayList,"B")));
//        String[] strings= new String[arrayList.size()];
//        strings=arrayList.toArray(strings);
//        List<String> stringList= Arrays.asList(strings);
//        System.out.println(arrayList.equals(stringList));

//        HashMap<List<String>,String>  hashMap=new HashMap<>();
    /*    for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            new Integer(arrayList.get(i));
        }
        System.out.println(System.currentTimeMillis()-start);
//4692 3022 2915       20  233   228*/
        for (int i = 0; i < 2000000000; i++) {
            arrayList.add(i);
        }

    }
}
