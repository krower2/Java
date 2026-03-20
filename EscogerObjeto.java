/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contarcosas;

/**
 *
 * @author pakoe
 */
public class EscogerObjeto {
        private String name;
        private double PrecioUnidad;

    public EscogerObjeto(String name, double PrecioUnidad) {
        this.name = name;
        this.PrecioUnidad = PrecioUnidad;
    }

    public EscogerObjeto() {
        this("no item", 0);
    }

    public double getPrecio() {
        return PrecioUnidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return PrecioUnidad;
    }

    public void setUnitPrice(double PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }

    @Override
    public String toString() {
        return name + " @ " + PrecioUnidad;
    }
}
