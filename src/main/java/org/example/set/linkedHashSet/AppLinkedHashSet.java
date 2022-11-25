package org.example.set.linkedHashSet;

import org.example.set.hashset.PersonaLinkedHashSet;
import org.example.set.treeset.PersonaTreeSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppLinkedHashSet {
    public static void main(String[] args) {
        /*
            - VALORES UNICOS NO ACEPTA VALORES DUPLICADOS
            - EL ORDEN ES A MEDIDA DE QUE SE AGREGA A LA COLECCION
            - La clase del objeto a agregar No debe tener implementado Comparable
         */

        //Agregando objetos
        Set<PersonaLinkedHashSet> list = new LinkedHashSet<>();
        list.add(new PersonaLinkedHashSet(1,"MitoCode",22));
        list.add(new PersonaLinkedHashSet(2,"Mito",23));
        list.add(new PersonaLinkedHashSet(3,"Code",24));
        list.add(new PersonaLinkedHashSet(4,"Code",25));
        list.add(new PersonaLinkedHashSet(5,"AAA",20));
        list.add(new PersonaLinkedHashSet(6,"Code",20));
        System.out.println("-------------------------------------");

        for(PersonaLinkedHashSet per:list){
            System.out.println(per.getId() + "- " +per.getNombre() + "-"+ per.getEdad());
        }
    }
}
