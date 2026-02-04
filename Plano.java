/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plano;


public class Plano {

    public static void main(String[] args) {
        Punto p1 = new Punto(-1,4);
        Punto p2 = new Punto(2,-3);
        Recta r1 = new Recta(p1,p2);
        p2.setY(4);
        System.out.println(r1);
    }
    
}
