/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plano;

/**
 *
 * @author ESTUDIANTE
 */
public class Recta {
    private Punto p1;
    private Punto p2;
    
    public Recta(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
        
    }
    
    public Punto getp1() {
        return p1;
    }
    
    public Punto getp2() {
        return p2;
    }
    
    public void setp1(Punto P) {
        p1 = P;
    }
    
    public void setp2(Punto P){
        p2 = P;
    }
    
    public double pendiente(){
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }
    
    public double distancia(Punto p){
        double m = pendiente();
        return Math.abs((m * p.getX() - 1 * p.getY() - 1 * m * p1.getX() + p1.getY()/ (Math.sqrt(Math.pow(m,2) + 1))));
    }    
    
    public String toString(){
        return "`y` "+ p2.getY() + " y `x` es " + p2.getX() + " y la pendiente es: " + pendiente();
    }
    
}
