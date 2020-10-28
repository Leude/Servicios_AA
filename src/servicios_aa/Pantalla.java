package servicios_aa;

import java.util.Scanner;

public class Pantalla {

    void menu() {
       
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
