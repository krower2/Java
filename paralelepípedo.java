/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

public class Paralelepipedo {

    private Vector u;
    private Vector v;
    private Vector w;

    public Paralelepipedo(Vector u, Vector v, Vector w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public Vector getU() {
        return u;
    }

    public void setU(Vector u) {
        this.u = u;
    }

    public Vector getV() {
        return v;
    }

    public void setV(Vector v) {
        this.v = v;
    }

    public Vector getW() {
        return w;
    }

    public void setW(Vector w) {
        this.w = w;
    }

    public double calcularVolumen() {
        Vector cruz = u.productoCruz(v);
        double triple = w.productoPunto(cruz);
        return Math.abs(triple);
    }

    @Override
    public String toString() {
        return "Vector U: " + u +
               "\nVector V: " + v +
               "\nVector W: " + w;
    }
}
