package org.example.set.hashset;

import org.example.set.hashset.PersonaHashSet;

import java.util.HashSet;
import java.util.Set;

public class AppHashSet {

    public static void main(String[] args) {

        /*
                HASHSET
            - NO ACEPTA ELEMENTOS DUPLICADOS
            - No Orden
            - Para objetos, debemos sobrescribir los metodos equals y hashcode
         */
        Set<String> lista = new HashSet<>();
        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("code");
        lista.add("MitoCode");
        for (String s : lista){
            System.out.println(s);
        }

        //Agregando Objetos
        //Debemos implementar los metodos equals y hashcode en la clase del objeto
        Set<PersonaHashSet> list = new HashSet<>();
        list.add(new PersonaHashSet(1,"MitoCode",22));
        list.add(new PersonaHashSet(1,"Mito",22));
        list.add(new PersonaHashSet(1,"Code",22));
        list.add(new PersonaHashSet(1,"Code",22));
        list.add(new PersonaHashSet(1,"AAA",22));
        System.out.println("-------------------------------------");
        for(PersonaHashSet per:list){
            System.out.println(per.getNombre());
        }




    }
}
