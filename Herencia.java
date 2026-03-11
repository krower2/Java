/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author ESTUDIANTE
 */
public class Herencia {

    public static void main(String[] args) {
        Animal a1 = new Animal("Gato", 5, "Mestizo");
        a1.comer();
        Gato g1 = new Gato("Grisli", 4,"Gris" ,7 );
        g1.Maullar();
        g1.acariciar();
        System.out.println(g1);
  
    }
}
