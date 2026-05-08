/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;
import javax.swing.JOptionPane;

public class Banco {
    
public static void main(String[] args) {

    Cuenta cuenta = new Cuenta();

    BancoIO.leerArchivo("cuentas.txt", cuenta);

    while (true) {

        String op = JOptionPane.showInputDialog(
                "=== SISTEMA BANCARIO ===\n"
                + "1. Agregar cuenta\n"
                + "2. Depositar dinero\n"
                + "3. Retirar dinero\n"
                + "4. Mostrar cuentas\n"
                + "5. Salir\n\n"
                + "Seleccione una opción:"
        );

        try {

            switch (op) {

                case "1":

                    String num = JOptionPane.showInputDialog(
                            "Número de cuenta:"
                    );

                    String nom = JOptionPane.showInputDialog(
                            "Nombre del titular:"
                    );

                    double saldo = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Saldo inicial:"
                            )
                    );

                    cuenta.agregarCuenta(
                            new CuentaBancaria(num, nom, saldo)
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Cuenta agregada correctamente"
                    );

                    break;

                case "2":

                    num = JOptionPane.showInputDialog(
                            "Número de cuenta:"
                    );

                    double dep = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Monto a depositar:"
                            )
                    );

                    cuenta.buscar(num).depositar(dep);

                    JOptionPane.showMessageDialog(
                            null,
                            "Depósito realizado"
                    );

                    break;

                case "3":

                    num = JOptionPane.showInputDialog(
                            "Número de cuenta:"
                    );

                    double ret = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Monto a retirar:"
                            )
                    );

                    cuenta.buscar(num).retirar(ret);

                    JOptionPane.showMessageDialog(
                            null,
                            "Retiro realizado"
                    );

                    break;

                case "4":

                    String lista = "";

                    for (CuentaBancaria c : cuenta.getCuentas()) {

                        lista += c + "\n";
                    }

                    JOptionPane.showMessageDialog(
                            null,
                            lista
                    );

                    break;

                case "5":

                    BancoIO.escribirArchivo(
                            "cuentas.txt",
                            cuenta
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Datos guardados"
                    );

                    System.exit(0);

                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida"
                    );
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage()
            );
        }
    }
}
}
