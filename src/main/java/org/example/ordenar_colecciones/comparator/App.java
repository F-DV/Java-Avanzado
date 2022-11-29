package org.example.ordenar_colecciones.comparator;

import org.example.ordenar_colecciones.comparator.NombreComparator;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(25);
        lista.add(10000);
        lista.add(1);

        /*
        Para ordenar, hacemos uso de la Api Collections
        -> Tambien ordena de orden alfabetico
         */
        Collections.sort(lista); //De menor a mayor
        Collections.reverse(lista); //de mayor a menor

        System.out.println(lista);

        //-----------------------------------------------------
        /*
           - Ordenar un objeto de acuerdo a un criterio o atributo en particular de este.
           - Para esto debemos hacer uso de la interfaz Comparator
        */
        List<Persona> personList = new ArrayList<>();
        personList.add(new Persona(1,"Jaime",25));
        personList.add(new Persona(2,"Mito",15));
        personList.add(new Persona(3,"Felipe",28));

        //Podemos hacerlo en una clase aparte que implemente la interfaz
        Collections.sort(personList, new NombreComparator());
        for (Persona p: personList){
            System.out.println(p.getNombre());
        }
        //----------------------------------------------------------------
        List<Persona> personList2 = new ArrayList<>();
        personList2.add(new Persona(1,"Jaime",25));
        personList2.add(new Persona(2,"Mito",15));
        personList2.add(new Persona(3,"Felipe",28));

        //Podemos implementar la interfaz directamente
        Collections.sort(personList2, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                int rpta = 0;
                Persona per1 = (Persona)o1;
                Persona per2 = (Persona)o2;
                if(per1.getEdad() > per2.getEdad()){
                    rpta = 1;
                }else if(per1.getEdad() < per2.getEdad()){
                    rpta = -1;
                }else {
                    rpta = 0;
                }
                return rpta;
            }
        });
        for(Persona p1: personList2){
            System.out.println(p1.getEdad());
        }


    }
}
