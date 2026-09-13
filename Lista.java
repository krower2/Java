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
    
    // Insertar al inicio
    public void insertar(int dato){
        
        Nodo nuevo = new Nodo(dato);
        
        if(isEmpty() == true)
            ini = nuevo;
        else {
            nuevo.setSig(ini);
            ini = nuevo;
        }
        
    }
    
    // Insertar al final
    public void insertarUlt(int dato){
        
        Nodo nuevo = new Nodo(dato);

        if(isEmpty() == true)
            ini = nuevo;
        else {
            Nodo aux = ini;
            while(aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        
    }
    
    // Insertar por posición
    public void insertarPos(int dato, int pos){
        
        Nodo nuevo = new Nodo(dato);
        
        if(pos == 0) {
            nuevo.setSig(ini);
            ini = nuevo;
        }
        else {
            Nodo aux = ini;
            
            for(int i = 0; i < pos - 1 && aux != null; i++) {
                aux = aux.getSig();
            }
            
            if(aux != null) {
                nuevo.setSig(aux.getSig());
                aux.setSig(nuevo);
            }
        }
    }
    
    // Eliminar último
    public void eliminarUlt(){
        
        if(isEmpty() == true)
            System.out.println("Lista vacia");
        else if(ini.getSig() == null)
            ini = null;
        else {
            Nodo aux = ini;
            
            while(aux.getSig().getSig() != null) {
                aux = aux.getSig();
            }
            
            aux.setSig(null);
        }
    }
    
    // Eliminar por posición
    public void eliminarPos(int pos){
        
        if(isEmpty() == true)
            System.out.println("Lista vacia");
        else if(pos == 0)
            ini = ini.getSig();
        else {
            Nodo aux = ini;
            
            for(int i = 0; i < pos - 1 && aux != null; i++) {
                aux = aux.getSig();
            }
            
            if(aux != null && aux.getSig() != null)
                aux.setSig(aux.getSig().getSig());
        }
    }
    
    // Eliminar por dato
    public void eliminarDato(int dato){
        
        if(isEmpty() == true)
            System.out.println("Lista vacia");
        else if(ini.getDato() == dato)
            ini = ini.getSig();
        else {
            Nodo aux = ini;
            
            while(aux.getSig() != null && aux.getSig().getDato() != dato) {
                aux = aux.getSig();
            }
            
            if(aux.getSig() != null)
                aux.setSig(aux.getSig().getSig());
        }
    }
    
    // Mostrar
    public void mostrar(){
        
        if(isEmpty() == true)
            System.out.println("Lista vacia");
        else {
            Nodo aux = ini;
            
            while(aux != null) {
                System.out.println("Mostrar dato: " + aux.getDato());
                aux = aux.getSig();
            }
        }
    }
    
    // Buscar dato
    public boolean buscarDato(int dato){
        
        Nodo aux = ini;
        
        while(aux != null) {
            if(aux.getDato() == dato)
                return true;
            
            aux = aux.getSig();
        }
        
        return false;
    }
    
    // Número de elementos
    public int numElementos(){
        
        int cont = 0;
        Nodo aux = ini;
        
        while(aux != null) {
            cont++;
            aux = aux.getSig();
        }
        
        return cont;
    }
    
    // Ordenar
    public void ordenar(){
        
        Nodo aux = ini;
        
        while(aux != null) {
            Nodo aux2 = aux.getSig();
            
            while(aux2 != null) {
                if(aux.getDato() > aux2.getDato()) {
                    int temp = aux.getDato();
                    aux.setDato(aux2.getDato());
                    aux2.setDato(temp);
                }
                
                aux2 = aux2.getSig();
            }
            
            aux = aux.getSig();
        }
    }
    
    // Invertir
    public void invertir(){
        
        Nodo anterior = null;
        Nodo actual = ini;
        Nodo siguiente;
        
        while(actual != null) {
            siguiente = actual.getSig();
            actual.setSig(anterior);
            anterior = actual;
            actual = siguiente;
        }
        
        ini = anterior;
    }
    
    // Combinar
    public void combinar(Lista lista2){
        
        if(lista2.isEmpty() == true)
            return;
        
        if(isEmpty() == true) {
            ini = lista2.ini;
        }
        else {
            Nodo aux = ini;
            
            while(aux.getSig() != null) {
                aux = aux.getSig();
            }
            
            aux.setSig(lista2.ini);
        }
    }
}

