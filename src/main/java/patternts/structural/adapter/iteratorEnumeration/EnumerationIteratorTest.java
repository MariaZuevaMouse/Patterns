package patternts.structural.adapter.iteratorEnumeration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {
    public static void main(String[] args) {
        Vector v = new Vector(Arrays.asList("aaa", "bbb", "ccc", "ddd"));
        Iterator iterator = new EnumerationIterator(v.elements());

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
