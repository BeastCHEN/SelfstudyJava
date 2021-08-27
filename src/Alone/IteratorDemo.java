package Alone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("World");
        c.add("Java");
        c.add("Javaee");
        Iterator<String> it =c.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

    }
}
