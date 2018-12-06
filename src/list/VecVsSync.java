package list;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VecVsSync {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        Vector v = new Vector();
        ArrayList al = new ArrayList();
        Test t2 = new Test(v);
        Test t1 = new Test(al);
    }
}

class Test {
    public Test(List l) {
        long start = System.currentTimeMillis();
        addLargeNumOfItems(l, 500000);
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start));
    }

    void addLargeNumOfItems(List l, int n) {
        BigInteger bi = BigInteger.ONE;
        BigInteger increment = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            l.add(i);
            bi = bi.add(increment);
        }
    }
}