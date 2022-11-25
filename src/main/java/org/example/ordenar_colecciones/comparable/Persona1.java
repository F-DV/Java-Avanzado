package org.example.ordenar_colecciones.comparable;

public class Persona1 implements Comparable<Persona1>{
    private int id;
    private String nombre;
    private int edad;

    public Persona1(int id, String nombre, int edad) {
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
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Persona1 o) {
        /*
         * CompareTo. Si es mayor a 1, menor a 1 o 0.
         */
        //return this.edad - o.getEdad();

        //Para comparar por nombre o String
        return this.nombre.compareTo(o.getNombre());

    }
}
