package org.example.stack;


import java.util.Stack;

public class StackApp {
    /*
        ES UNA PILA QUE DESARROLLA EL ALGORITMO LIFO
        (EL ULTIMO EN ENTRAR ES EL PRIMERO EN SALIR)
        - PARA OBJETOS NO ES NECESARIO EL COMPARABLE
        - ES NECESARIO PARA OBJETOS EQUALS Y HASHCODE
        - PARA BUSCAR SOLO POR NOMBRE UN OBJETO, USAR COMPARETO
     */
    public static void main(String[] args) throws InterruptedException {

        // VALORES PRIMITIVOS

        Stack<String> pila = new Stack<String>();
        pila.push("1-MitoCode");
        pila.push("2-Mito");
        pila.push("3-Code");
        pila.push("4-Jaime");

        for (String elemento: pila){
            System.out.println(elemento);
        }
        System.out.println("Elemento que esta en el tope, el primero en salir:" + pila.peek());

        //Busca elemento, devuelve la posicion si lo encuentra o -1 si no lo encuentra
        System.out.println("Search:" + pila.search("1-MitoCod"));

        while(!pila.isEmpty()){
            System.out.println("Atendiendo a " + pila.pop()); //Sacar cada elemento, removiendo
            Thread.sleep(1000);
        }






        //  PARA OBJETOS

        Stack<PersonaStack> pila1 = new Stack<PersonaStack>();

        pila1.push(new PersonaStack(1,"MitoCode",28));
        pila1.push(new PersonaStack(2,"Mito",28));
        pila1.push(new PersonaStack(3,"Code",28));
        pila1.push(new PersonaStack(4,"Felipe",28));

        for (PersonaStack elemento: pila1){
            System.out.println(elemento);
        }
        System.out.println("Elemento que esta en el tope, el primero en salir:" + pila1.peek());

        //Busca elemento, devuelve la posicion si lo encuentra o -1 si no lo encuentra
        System.out.println("Search:" + pila1.search(new PersonaStack(4,"Felipe",28)));

        while(!pila.isEmpty()){
            System.out.println("Atendiendo a " + pila1.pop()); //Sacar cada elemento, removiendo
            Thread.sleep(1000);
        }
    }
}
