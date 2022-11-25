package org.example.instaciastatic;

public class Persona {

    //Suma con 1 ya que la sub clase sobrescribe el metodo padre
    /*
    Si son Static, el metodo de la subclase, oculta el metodo de la super clase
     */
    public int sumar(int numero){
        return numero + 1;
    }
}
