/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author SALON202
 */

    public class Fracción {

    private float numerador;
    private float denominador;
    
    public Fracción(float numerador, float denominador) {
        this.numerador = numerador;
        this.denominador = denominador;  
    }
    
    public float getNumerador() {
        return numerador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public float getDenominador() {
        return denominador;
    }

    public void setDenominador(float denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        }
    }
    
    public Fracción sumar(Fracción f) {

    float nuevoNumerador;
    float nuevoDenominador;

    // Caso 1: denominadores iguales
    if (this.denominador == f.denominador) {
        nuevoNumerador = this.numerador + f.numerador;
        nuevoDenominador = this.denominador;
    }
    // Caso 2: denominadores diferentes
    else {
        nuevoNumerador =
                this.numerador * f.denominador +
                this.denominador * f.numerador;

        nuevoDenominador =
                this.denominador * f.denominador;
    }

    return new Fracción(nuevoNumerador, nuevoDenominador);
}

    
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
