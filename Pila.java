import java.util.ArrayList;

public class Pila {

    private ArrayList<Integer> datos;

    public Pila() {
        datos = new ArrayList<>();
    }

    public void agregar(int dato) {
        datos.add(dato);
            System.out.println("Dato agregado: " + dato);
    }


    public void eliminar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            int dato = datos.remove(datos.size() - 1);
            System.out.println("Dato eliminado: " + dato);
        }
    }


    public void vaciar() {
        datos.clear();
        System.out.println("La pila ha sido vaciada.");
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos de la pila:");

            for (int i = datos.size() - 1; i >= 0; i--) {
                System.out.println(datos.get(i));
            }
        }
    }

    public boolean estaVacia() {
        return datos.isEmpty();
    }

    public int obtenerTope() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return -1;
        }

        return datos.get(datos.size() - 1);
    }

    public static void copiarPila(Pila origen, Pila destino) {
        Pila respaldo = new Pila();


        while (!origen.estaVacia()) {
            respaldo.agregar(origen.obtenerTope());
            origen.eliminar();
        }

        while (!respaldo.estaVacia()) {
            int dato = respaldo.obtenerTope();

            origen.agregar(dato);
            destino.agregar(    dato);

            respaldo.eliminar();
        }
    }

}