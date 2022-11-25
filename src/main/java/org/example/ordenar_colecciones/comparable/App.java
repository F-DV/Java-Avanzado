package org.example.ordenar_colecciones.comparable;

import org.example.ordenar_colecciones.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /*
        * Utilizando la interface comparable en la clase y dandole una logica al metodo
        * CompareTo. Si es mayor a 1, menor a 1 o 0.
        * */
        List<Persona1> personList = new ArrayList<>();

        personList.add(new Persona1(1,"Jaime",25));
        personList.add(new Persona1(2,"Mito",15));
        personList.add(new Persona1(3,"Felipe",28));

        Collections.sort(personList);

        for (Persona1 p : personList){
            System.out.println(p.getEdad() + "-" + p.getNombre());
        }

    }
}
