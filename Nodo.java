package com.mycompany.edlistasligadas;
public class Nodo{
    int dato;
    Nodo sig;

    public Nodo (int data){
        this.dato=dato;
        sig=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
}