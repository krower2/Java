package operaciones;

public class Fraccion {

    private float numerador;
    private float denominador;

    public Fraccion(float numerador, float denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            this.denominador = 1; // Evitar división por cero
        }
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

    public Fraccion sumar(Fraccion f) {
        float n, d;
        if (this.denominador == f.denominador) {
            n = this.numerador + f.numerador;
            d = this.denominador;
        } else {
            n = this.numerador * f.denominador + 
                    this.denominador * f.numerador;
            d = this.denominador * f.denominador;
        }
        return new Fraccion(n, d);
    }

    public Fraccion restar(Fraccion f) {
        float n, d;
        if (this.denominador == f.denominador) {
            n = this.numerador - f.numerador;
            d = this.denominador;
        } else {
            n = this.numerador * f.denominador - 
                    this.denominador * f.numerador;
            d = this.denominador * f.denominador;
        }
        return new Fraccion(n, d);
    }

    public Fraccion multiplicar(Fraccion f) {
        return new Fraccion(this.numerador * f.numerador,
                this.denominador * f.denominador);
    }

    public Fraccion dividir(Fraccion f) {
        return new Fraccion(this.numerador * f.denominador, 
                this.denominador * f.numerador);
    }

    // Método para mostrar todas las operaciones con otra fracción
    public String operacionesCon(Fraccion f) {
        Fraccion suma = this.sumar(f);
        Fraccion resta = this.restar(f);
        Fraccion mult = this.multiplicar(f);
        Fraccion div = this.dividir(f);

        return "Fraccion 1: " + this + "\n" +
               "Fraccion 2: " + f + "\n" +
               "Suma: " + suma + "\n" +
               "Resta: " + resta + "\n" +
               "Multiplicacion: " + mult + "\n" +
               "Division: " + div;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}

}
