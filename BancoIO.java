/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;
import java.io.*;
import java.util.Scanner;

public class BancoIO {

    public static void leerArchivo(String nombreArchivo, Cuenta banco) {
        try {
            Scanner sc = new Scanner(new File(nombreArchivo));

            while (sc.hasNextLine()) {
                CuentaBancaria c = leerCuenta(sc);
                banco.agregarCuenta(c);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }

    public static CuentaBancaria leerCuenta(Scanner sc) {
        String linea = sc.nextLine();
        String[] datos = linea.split(",");

        String numero = datos[0];
        String titular = datos[1];
        double saldo = Double.parseDouble(datos[2]);

        return new CuentaBancaria(numero, titular, saldo);
    }

    public static void escribirArchivo(String nombreArchivo, Cuenta banco) {
        try {
            PrintWriter out = new PrintWriter(nombreArchivo);

            for (CuentaBancaria c : banco.getCuentas()) {
                out.println(c.toString());
            }

            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir archivo");
        }
    }
}