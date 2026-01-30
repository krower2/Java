/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numerador 1: ");
        float n1 = teclado.nextFloat();

        System.out.print("Ingrese denominador 1: ");
        float d1 = teclado.nextFloat();

        Fraccion f1 = new Fraccion(n1, d1);

        System.out.print("Ingrese numerador 2: ");
        float n2 = teclado.nextFloat();

        System.out.print("Ingrese denominador 2: ");
        float d2 = teclado.nextFloat();

        Fraccion f2 = new Fraccion(n2, d2);
        
        System.out.println(f1.operacionesCon(f2));
    }
}
