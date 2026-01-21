/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author ESTUDIANTE
 */
public class Libro {
    private String titulo;
    private String autor;
    private int id;
    private boolean estado;
    
    public Libro(String t, String a, int i){
        titulo = t;
        autor = a;
        id = i;
        estado = false;
    }
    
    public Libro(){
        titulo = "Wigetta";
        autor = "Willyrex y Vegetta777";
        id = 777;
        estado = false;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String t){
        titulo=t;
    }
    
    public String getautor(){
        return autor;
    }
    
    public void setautor(String a){
        autor=a;
    }
    
    public int getid(){
        return id;
    }
    
    public void setid(int i){
     id=i;
    }
   
    public void prestado(){
        estado = true;
    }
    public void devolver(){
        estado = false;
    }
    public String toString(){
        return "Titulo: " + titulo + " Autor: " + autor + "Id: " + id;
                        
    }
    
        
}
