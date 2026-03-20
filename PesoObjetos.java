/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contarcosas;

/**
 *
 * @author pakoe
 */
public class PesoObjetos extends EscogerObjeto{
    
    private double peso;

    public PesoObjetos(String name, double PrecioUnidad, double peso) {
        super(name, PrecioUnidad);
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * peso;
    }

    @Override
    public String toString() {
        return super.toString() + " " + peso + "Kg " + getPrecio() + " SR";
    }
}
