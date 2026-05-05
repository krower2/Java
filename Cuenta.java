/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author pakoe
 */
import java.util.ArrayList;

public class Cuenta {
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    public void agregarCuenta(CuentaBancaria c) {
        cuentas.add(c);
    }

    public CuentaBancaria buscar(String numero) {
        for (CuentaBancaria c : cuentas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}