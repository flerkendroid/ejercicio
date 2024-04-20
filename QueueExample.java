package mx.com.codegym.friday.lesson18;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("uno");
        queue.add("dos");
        queue.add("tres");
        queue.add("cuatro");

        queue.offer("elemento insertado");
        boolean insertoElementoDuplicado = queue.offer("uno");

        System.out.println("insertoElementoDuplicado: " + insertoElementoDuplicado );

        boolean eliminado =  queue.remove("dos");
        System.out.println("eliminado: " + eliminado);

        System.out.println(queue);
    }

}
