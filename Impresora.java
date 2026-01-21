/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencia;

/**
 *
 * @author ESTUDIANTE
 */

public class Impresora {
    private String marca;
    private boolean encendida;
    
    
    public Impresora(String m) {
    marca = m;
    encendida = false;
    
    }
    
    public String getMarca(){
    return marca;
    }
    
    public void setMarca(String m){
    marca = m;
    }
    
    public void Encender(){
    encendida = true;
    }
    
    public void Apagar(){
    encendida = false;
    
    } 
    public String toString(){
        return "\nImpresora: " + marca;
    }
    
    public void imprimir(Documento d){
        if (encendida == true){
            System.out.println(d);
        } else {
            System.out.println("La impresora está apagada");
        }
    }
}
