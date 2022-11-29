package org.example.ordenar_colecciones.comparator;

import java.util.Comparator;

public class NombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {


        Persona per1 = (Persona)o1;
        Persona per2 = (Persona)o2;
        return per1.getNombre().compareTo(per2.getNombre());
    }
}
