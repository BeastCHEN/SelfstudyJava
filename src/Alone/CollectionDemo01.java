package Alone;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("Hello");
        c.add("World");
        c.add("Java");
        System.out.println(c);
    }
}
