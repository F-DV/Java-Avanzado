package org.example.instance_of;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Clases de Java
        String texto = new String("mitoCode");
        if(texto instanceof String){
            System.out.println("Es un string");
        }

        //Clases propias
        Alumno al = new Alumno();
        if(al instanceof Alumno){
            System.out.println("Es un alumno");
        }

        /*
        Se tiene una canasta en donde solo de debe permitir ingresar frutas
         */
        System.out.println("Canasta abierta, porfavor SOLO ingresar frutas");

        Manzana m1 = new Manzana("Roja");
        Manzana m2 = new Manzana("Verde");
        Naranja n1 = new Naranja("Naranja sin pepa");
        Galleta g1 = new Galleta("Chocolate");

        App app = new App();
        app.verificar(m1);
        app.verificar(m2);
        app.verificar(n1);
        app.verificar(g1);

    }

    List canasta = new ArrayList();
    private void verificar(Object objeto){
        if(objeto instanceof Fruta){
            canasta.add(objeto);
            System.out.println("Fruta Agregada: " + objeto);
        }else{
            System.out.println("No agregada, solo frutas porfavor");
        }
    }
}
