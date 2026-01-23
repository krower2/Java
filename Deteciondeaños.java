package deteciondeaños;
import java.util.Scanner;

public class DetecionDeAños {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese dia: ");
        int d = sc.nextInt();
        System.out.print("Ingrese mes: ");
        int m = sc.nextInt();
        System.out.print("Ingrese año: ");
        int a = sc.nextInt();

        Fechas f = new Fechas(d, m, a);

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\nMenu:");
            System.out.println("1 - Mostrar fecha corta");
            System.out.println("2 - Año bisiesto?");
            System.out.println("3 - Dias del mes");
            System.out.println("4 - Dia siguiente");
            System.out.println("5 - Dia anterior");
            System.out.println("0 - Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Fecha corta: " + f.corta());
                    break;
                case 2:
                    System.out.println("¿Es bisiesto? " + (f.esBisiesto() ? "Si" : "No"));
                    break;
                case 3:
                    System.out.println("Días del mes: " + f.diasMes());
                    break;
                case 4:
                    f.siguiente();
                    System.out.println("Dia siguiente: " + f.corta());
                    break;
                case 5:
                    f.anterior();
                    System.out.println("Dia anterior: " + f.corta());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }

        sc.close();
    }
}
