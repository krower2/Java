/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores del primer vector:");
        Vector u = leerVector(sc);

        System.out.println("Ingrese los valores del segundo vector:");
        Vector v = leerVector(sc);

        System.out.println("Ingrese los valores del tercer vector:");
        Vector w = leerVector(sc);

        Paralelepipedo p = new Paralelepipedo(u, v, w);

        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Mostrar informacion");
            System.out.println("2. Calcular volumen");
            System.out.println("3. Modificar vectores");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(p);
                    break;

                case 2:
                    System.out.println("Volumen: " + p.calcularVolumen());
                    break;

                case 3:
                    modificarVectores(sc, p);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);

        sc.close();
    }

    public static Vector leerVector(Scanner sc) {
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        System.out.print("z: ");
        double z = sc.nextDouble();
        return new Vector(x, y, z);
    }

    public static void modificarVectores(Scanner sc, Paralelepipedo p) {

        int op;

        do {
            System.out.println("\nSUBMENU");
            System.out.println("1. Modificar primer vector");
            System.out.println("2. Modificar segundo vector");
            System.out.println("3. Modificar tercer vector");
            System.out.println("4. Regresar");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    p.setU(leerVector(sc));
                    break;

                case 2:
                    p.setV(leerVector(sc));
                    break;

                case 3:
                    p.setW(leerVector(sc));
                    break;

            }

        } while (op != 4);
    }
}
