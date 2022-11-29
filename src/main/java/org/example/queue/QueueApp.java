package org.example.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    /*
        UTILIZA EL ALGORITMO FIFO
        (PRIMERO EN ENTRAR, PRIMERO EN SALIR)
        - NO SE PUEDE ITERAR CON UN FOR UNA LISTA QUE SE ESTA REMOVIENDO
        - .peek NOS MUESTRA EL PROXIMO EN SALIR
        - .poll() : REMUEVE CADA ELEMENTO
        - EN OBJETOS DEBEMOS INDICAR LA PRIORIDAD IMPLEMENTANDO LA INTERFAC COMPARABLE EN EL OBJETO
            O ORDEN DE ATENCION, POR EDAD, POR ID O NOMBRE ALFABETICO. EN ESTE EJEMPLO, ATENDERÁ POR EDAD

     */
    public static void main(String[] args) throws InterruptedException {
/*
        //VALORES PRIMITIVOS
        Queue<String> cola = new PriorityQueue<>();
        cola.offer("1-MitoCode");
        cola.offer("2-Code");
        cola.offer("3-Mito");
        cola.offer("4-Felipe");
        System.out.println("Se procede a atender a " + cola.peek());

        while(!cola.isEmpty()){
            System.out.println("Atendiendo a: " + cola.poll());
            Thread.sleep(1000);
        }
*/
        //OBJETOS
        Queue<PersonaQueue> cola1 = new PriorityQueue<>();
        cola1.offer(new PersonaQueue(1,"1-MitoCode",22));
        cola1.offer(new PersonaQueue(2,"1-MitoCode",23));
        cola1.offer(new PersonaQueue(3,"1-MitoCode",24));
        cola1.offer(new PersonaQueue(4,"1-MitoCode",25));
        System.out.println("Se procede a atender a " + cola1.peek());

        while(!cola1.isEmpty()){
            System.out.println("Atendiendo a: " + cola1.poll());
            Thread.sleep(1000);
        }
    }
}
