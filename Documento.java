/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencia;

/**
 *
 * @author ESTUDIANTE
 */
public class Documento {
    private String titulo;
    private String cuerpo;
    
    public Documento(String t){
    titulo = t;
    }
    
    public Documento(String t, String c){
    titulo = t;
    cuerpo = c;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getCuerpo(){
        return cuerpo;
    }
    
    public void setTitulo(String t){
        titulo=t;
    }   
    
    public void setCuerpo(String c){
        cuerpo = c;
    }
    
    
    public String toString(){
        return "Titulo: " + titulo + " Cuerpo: " + cuerpo;
                        
    }
    
}
    
