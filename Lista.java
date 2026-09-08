/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edlistasligadas;

/**
 *
 * @author EMA 4 - 207
 */
public class Lista {
    Nodo ini;
    
    public boolean isEmpty() {
        
        if(ini == null)
            return true;
        return false;
        
    }
    
    public void insertar(int dato){
        
    Nodo nuevo = new Nodo(dato);
    
    if(isEmpty() == true)
        ini = nuevo;
    else {
        nuevo.setSig(ini);
        ini = nuevo;
    }
    
}
    
    public void insertarUlt(int dato){
        
        Nodo nuevo = new Nodo(dato);

        if(isEmpty() == true)
            ini = nuevo;
        else {
            Nodo aux = ini;
            while(aux.getSig()!= null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);

        }
    }
    
    public void mostrar(){
        if(isEmpty() == true)
            System.out.println("Lista vacia");
        Nodo aux = ini;
        while(aux != null);
            System.out.println("Mostrar dato" + aux.getDato());
            aux = aux.getSig();
            
       }
}

