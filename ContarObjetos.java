/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contarcosas;

/**
 *
 * @author pakoe
 */
public class ContarObjetos extends EscogerObjeto {
    private int cantidad;

    public ContarObjetos(String name, double PrecioUnidad, int cantidad) {
        super(name, PrecioUnidad);
        this.cantidad = cantidad;
    }

    
    public double getPrecio() {
        return super.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return super.toString() + " " + cantidad + " units " + getPrecio() + " SR";
    }
}
