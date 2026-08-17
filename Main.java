
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pila pila = new Pila();
        Pila pila1 = new Pila();
        Pila pila2 = new Pila();

    
        int opcion;

        do {
            System.out.println("\n===== MENU DE PILA =====");
            System.out.println("1.Agregar dato");
            System.out.println("2.Eliminar dato");
            System.out.println("3.Vaciar pila");
            System.out.println("4.Mostrar pila");
            System.out.println("5.Verificar si esta vacia");
            System.out.println("6.Obtener tope");
            System.out.println("0.Salir");
            System.out.print("Elige una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa un dato: ");
                    int dato = scanner.nextInt();
                    pila.agregar(dato);
                    break;

                case 2:
                    pila.eliminar();
                    break;

                case 3:
                    pila.vaciar();
                    break;

                case 4:
                    pila.mostrar();
                    break;

                case 5:
                    if (pila.estaVacia()) {
                        System.out.println("La pila esta vacia.");
                    } else {
                        System.out.println("La pila NO esta vacia.");
                    }
                    break;
                case 6:
                    Pila.copiarPila(pila1,pila2);
                    break;
                case 7:
                    System.out.println("El tope es: " + pila.obtenerTope());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}

