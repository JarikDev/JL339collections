package concurrent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ConcurrentLesson {
    public static void main(String[] args) {
        List<String>list=new CopyOnWriteArrayList<>();
        Set<String> set=new CopyOnWriteArraySet<>();
        BlockingQueue<String>blockingQueue=new LinkedBlockingQueue<>();
        BlockingQueue<String>blockingQueue2=new ArrayBlockingQueue<String>(10);
        BlockingQueue<String>blockingQueue3=new PriorityBlockingQueue<>(10);

        BlockingQueue<String>delayQueue=new DelayQueue ( );
        BlockingQueue<String>synchronousQueue3=new SynchronousQueue<>( );
        BlockingQueue<String>transferQueue3=new LinkedTransferQueue<>();
        BlockingQueue<String>blockingDeque=new LinkedBlockingDeque<>( );


    }
}













