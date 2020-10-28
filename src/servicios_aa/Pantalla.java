package servicios_aa;

import java.util.Scanner;

public class Pantalla {

    void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("\t\t**Menu Principal**");
        System.out.println("-----------------------------------------");
        System.out.println("\t\tElije una opcion:");
        System.out.println("- 1)Dar de Alta Articulos");
        System.out.println("- 2)Modificar Articulos");
        System.out.println("- 3)Eliminar Articulos");
        System.out.println("- 4)Consultar Articulos Individualmente");
        System.out.println("- 5)Generar Reporte");
        System.out.println("- 6)Salir");
        System.out.println("-------------------------------");
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public int leerNumEntero(String msg) {
        System.out.print(msg);
        Scanner leer = new Scanner(System.in);
        int entero = leer.nextInt();
        return entero;
    }

    public String leerCadena(String msg) {
        System.out.print(msg);
        Scanner leer = new Scanner(System.in);
        String cadena = leer.nextLine();
        return cadena;
    }

    public double leerNumReal(String msg) {
        System.out.print(msg);
        Scanner leer = new Scanner(System.in);
        double real = leer.nextDouble();
        return real;
    }

    public void esperarEnter() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Presiona [Enter] para continuar...");
        leer.nextLine();

    }

}
