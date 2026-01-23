/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package television;

/**
 *
 * @author SALON202
 */

public class Canales {

    private String marca;
    private int pulgadas;
    private boolean encendida;
    private int canal;
    private int volumen;
    private boolean mute;

    public Canales(String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        encendida = false;
        canal = 1;
        volumen = 5;
        mute = false;
    }

    public void encender() {
        encendida = true;
        System.out.println("Television encendida");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Television apagada");
    }

    public void subirVolumen() {
        if (encendida && volumen < 10) {
            volumen++;
        }
    }

    public void bajarVolumen() {
        if (encendida && volumen > 0) {
            volumen--;
        }
    }

    public void avanzarCanal() {
        if (encendida) {
            canal++;
            if (canal > 5) {
                canal = 1;
            }
        }
    }

    public void retrocederCanal() {
        if (encendida) {
            canal--;
            if (canal < 1) {
                canal = 5;
            }
        }
    }

    public void cambiarCanal(int c) {
        if (encendida && c >= 1 && c <= 5) {
            canal = c;
        }
    }

    public void mute() {
        if (encendida) {
            mute = !mute;
        }
    }

    @Override
    public String toString() {
        return "\nTelevision " + marca + " (" + pulgadas + " pulgadas)" +
               "\nEncendida: " + encendida +
               "\nCanal: " + canal +
               "\nVolumen: " + (mute ? "Mute" : volumen);
    }
}

