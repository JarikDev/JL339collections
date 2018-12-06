package queue;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueLesson {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        Deque<String> linkedDeque = new LinkedList<>();
        Deque<String> arrayDeque = new ArrayDeque<>();
        Queue<String> priorityQueue = new PriorityQueue<>();
        Queue<String >blockingDeque=new LinkedBlockingDeque<>();

        arrayDeque.add("a");
        arrayDeque.add("c");
        arrayDeque.add("b");
        for (String s:arrayDeque) {
            System.out.println(s);
        }

        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("b");
        while (priorityQueue.size()!=0){
            System.out.println(priorityQueue.remove());
        }

    }
}
