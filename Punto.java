/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plano;

/**
 *
 * @author ESTUDIANTE
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(){
        x=y=0;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(p.getX()-x,2)+Math.pow(p.getY()-y,2));
    }
    public Punto puntoMedio(Punto p){
        double xm;
        double ym;
        xm=(x+p.getX())/2;
        ym=(y+p.getY())/2;
        return new Punto(xm,ym);
    }
        public String toString(){
            return "("+x+","+y+")"; 
        }
}
