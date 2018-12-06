package list;

import java.util.*;

public class ListLesson {
    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();
        List<String> stack = new Stack<>();
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());

        arrayList.add(new Student(3));
        arrayList.add(new Student(2));
        arrayList.add(new Student(1));
        for (Student  s : arrayList) {
            System.out.println(s.id);
        }
        Collections.sort(arrayList);

        for (Student s : arrayList) {
            System.out.println(s.id);
        }

    }
    static class Student implements Comparable{
        int id;
        String name;

        public Student(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(Object o) {
            return id -((Student)o).id ;
        }
    }
}
