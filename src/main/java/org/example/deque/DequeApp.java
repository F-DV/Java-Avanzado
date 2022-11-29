package org.example.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
    /*
        PROVIENE DE LA PALABRA DOUBLE-ENDED QUEUE(MEZCLA EN STACK Y QUEUE)
        - NO ACEPTA VALORES NULL
        - PERMITE AGREGAR ELEMENTOS AL PRINCIPO O AL FINAL
     */
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();
        dq.add("1-MitoCode");
        dq.add("2-Mito");
        dq.add("3-Code");
        dq.add("4-Felipe");

        String x = dq.peek();
        System.out.println("Peek: " + x);

        x = dq.poll();
        System.out.println("Poll: " + x);

        x = dq.pop();
        System.out.println("Pop: " + x);

        dq.addFirst("0-Fernando");
        dq.addLast("5-Andres");

        for(String elemento: dq){
            System.out.println(elemento);
        }
    }
}
