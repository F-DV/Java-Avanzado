package org.example.map;

import java.util.Iterator;
import java.util.Map;

public class TreeMap {

    /*
        TREEMAP GUARDA CLAVE VALOR, SE LLAMA AL VALOR POR LA CLAVE

        - NO SE SE PERMITEN ELEMENTOS DUPLICADOS
        - TIENE ORDEN ASCENDENTE
        - NO PERMITE ALMACENAR 2 VALORES CON LA MISMA LLAVE
     */
    public static void main(String[] args) {
        Map<String,String> map = new java.util.TreeMap<>();

        map.put("3","MitoCode");
        map.put("4","Mito");
        map.put("1","Code");
        map.put("2","Jaime");
        map.put("5",null);
        map.put("5","ABC");

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }
}

