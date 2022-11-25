package org.example.set.treeset;

import java.util.Objects;

public class PersonaTreeSet implements Comparable<PersonaTreeSet>{

    private int id;
    private String nombre;
    private int edad;

    public PersonaTreeSet(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaTreeSet that = (PersonaTreeSet) o;
        return id == that.id && edad == that.edad && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad);
    }

    @Override
    public int compareTo(PersonaTreeSet o) {
        return this.edad - o.getEdad();
    }
}
