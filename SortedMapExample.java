package mx.com.codegym.friday.lesson18;

import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        Map<Integer, String>  sm = new TreeMap<Integer, String>();

        sm.put(2, "practice");
        sm.put(3, "code");
        sm.put(3, "quiz");

        sm.put(4, "contribute");
        sm.put(1, "geeksforgeeks");
        Set entradas = sm.entrySet();

        //Mnemonico

        // Using iterator in SortedMap
        Iterator iterator = entradas.iterator();

        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();

            int key = (Integer) entry.getKey();
            String value = (String) entry.getValue();

            System.out.println("Key : " + key + "  value : " + value);
        }
    }
}


/*interface Map{
    interface Entry{

    }
}

 */