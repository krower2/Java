/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;
import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();

        BancoIO.leerArchivo("cuentas.txt", cuenta);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("      SISTEMA BANCARIO");
            System.out.println("==============================");
            System.out.println("1. Agregar cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar cuentas");
            System.out.println("5. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opción: ");

            String op = sc.nextLine();

            try {

                switch (op) {

                    case "1":
                        System.out.println("\n--- AGREGAR CUENTA ---");

                        System.out.print("Número de cuenta: ");
                        String num = sc.nextLine();

                        System.out.print("Nombre del titular: ");
                        String nom = sc.nextLine();

                        System.out.print("Saldo inicial: ");
                        double saldo = Double.parseDouble(sc.nextLine());

                        cuenta.agregarCuenta(new CuentaBancaria(num, nom, saldo));

                        System.out.println("✔ Cuenta agregada correctamente");
                        break;

                    case "2":
                        System.out.println("\n--- DEPÓSITO ---");

                        System.out.print("Número de cuenta: ");
                        num = sc.nextLine();

                        System.out.print("Monto a depositar: ");
                        double dep = Double.parseDouble(sc.nextLine());

                        cuenta.buscar(num).depositar(dep);

                        System.out.println("✔ Depósito realizado");
                        break;

                    case "3":
                        System.out.println("\n--- RETIRO ---");

                        System.out.print("Número de cuenta: ");
                        num = sc.nextLine();

                        System.out.print("Monto a retirar: ");
                        double ret = Double.parseDouble(sc.nextLine());

                        cuenta.buscar(num).retirar(ret);

                        System.out.println("✔ Retiro realizado");
                        break;

                    case "4":
                        System.out.println("\n--- LISTA DE CUENTAS ---");

                        for (CuentaBancaria c : cuenta.getCuentas()) {
                            System.out.println("• " + c);
                        }

                        break;

                    case "5":
                        BancoIO.escribirArchivo("cuentas.txt", cuenta);
                        System.out.println("\n✔ Datos guardados correctamente");
                        System.out.println("Saliendo del sistema...");
                        sc.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("⚠ Opción no válida");
                }

            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }
}