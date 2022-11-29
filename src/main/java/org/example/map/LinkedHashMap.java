package org.example.map;

import org.example.ordenar_colecciones.comparator.Persona;

import java.util.Iterator;
import java.util.Map;

public class LinkedHashMap {

    /*
       TREEMAP GUARDA CLAVE VALOR, SE LLAMA AL VALOR POR LA CLAVE

       - NO SE SE PERMITEN ELEMENTOS DUPLICADOS
       - EL ORDEN ES EL QUE YO VOY AGREGANDO LOS DATOS
       - NO PERMITE ALMACENAR 2 VALORES CON LA MISMA LLAVE
    */
    public static void main(String[] args) {
        Map<PersonaMap,String> map = new java.util.LinkedHashMap<>();

        //Datos primitivos
        /*
        map.put("3","MitoCode");
        map.put("4","Mito");
        map.put("1","Code");
        map.put("2","Jaime");
        map.put("5",null);
        map.put("5","ABC");
        */

        //Datos con objeto
        map.put(new PersonaMap(6,"MitoCode",28),"MitoCode");
        map.put(new PersonaMap(2,"MitoCode",28),"Mito");
        map.put(new PersonaMap(5,"MitoCode",28),"ABC");
        map.put(new PersonaMap(4,"MitoCode",28),"Jaime");
        map.put(new PersonaMap(3,"MitoCode",28),null);
        map.put(new PersonaMap(1,"MitoCode",28),"ABC");

        //Iterar con iterator
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            PersonaMap key = (PersonaMap) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

        //Iterar con foreach
        for (Map.Entry<PersonaMap,String> ent : map.entrySet() ){
            System.out.println("Clave: " + ent.getKey() + " -> Valor: " + ent.getValue());
        }


    }
}
