/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependencia;

/**
 *
 * @author ESTUDIANTE
 */
public class Dependencia {

    
    public static void main(String[] args) {
        Impresora il = new Impresora("Hp");
        il.Encender();
        
        Documento d1 = new Documento("El salido", "Hola");
        
        System.out.println(d1);
        
    }
    
}
