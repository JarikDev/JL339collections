package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudent{
    public static void main(String[] args) {
        Set<Student> hashSet=new HashSet<>();
        Set<Student> linkedHashSet=new LinkedHashSet<>();
        Set<Student> treeSet=new TreeSet<>();
        hashSet.add(new Student(3));
        hashSet.add(new Student(2));
        hashSet.add(new Student(1));

        for (Student student:hashSet) {
            System.out.println(student.id);
        }

        treeSet.add(new Student(3));
        treeSet.add(new Student(2));
        treeSet.add(new Student(1));

        for (Student student:treeSet) {
            System.out.println(student.id);
        }


    }
    static class Student implements Comparable{
        int id;

        public Student(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            return id == student.id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public int compareTo(Object o) {
            return id-((Student)o).id;
        }
    }
}
