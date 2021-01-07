package patternts.adapter.iteratorEnumeration;

import java.util.*;

public class IteratorEnumerationTest {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "ddd"));
        Enumeration enumeration = new IteratorEnumeration(testList.iterator());

        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
}
