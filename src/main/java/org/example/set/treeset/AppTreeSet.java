package org.example.set.treeset;

import org.example.set.hashset.PersonaHashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

    public static void main(String[] args) {

        /*
            - NO ACEPTA ELEMENTOS DUPLICADOS
            - ORDENA LOS ELEMENTOS ASCENDENTE
            - En HashCode y equals, puede ser elegido el criterio de evaluacion
            - Para agregar objetos, se necesita ademas implementar la interface comparable
         */
        Set<String> lista = new TreeSet<>();
        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("ode");
        lista.add("Mito");
        lista.add("Felipe");

        for (String elemento:lista){
            System.out.println(elemento);
        }

        //Agregando objetos
        Set<PersonaTreeSet> list = new TreeSet<>();
        list.add(new PersonaTreeSet(1,"MitoCode",22));
        list.add(new PersonaTreeSet(2,"Mito",23));
        list.add(new PersonaTreeSet(3,"Code",24));
        list.add(new PersonaTreeSet(4,"Code",25));
        list.add(new PersonaTreeSet(5,"AAA",20));
        list.add(new PersonaTreeSet(6,"Code",20));
        System.out.println("-------------------------------------");

        for(PersonaTreeSet per:list){
            System.out.println(per.getId() + "- " +per.getNombre() + "-"+ per.getEdad());
        }
    }
}
