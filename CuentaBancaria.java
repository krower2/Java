/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author pakoe
 */
public class CuentaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception("Fondos insuficientes");
        }
        saldo -= cantidad;
    }

    @Override
    public String toString() {
        return numero + "," + titular + "," + saldo;
    }
}