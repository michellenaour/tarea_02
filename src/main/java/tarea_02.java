import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class tarea_02 {

    static Random azar = new Random();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int l = recibirNro("Ingrese el número de días que incluirá este registro.", 1, 31);
        double[][] registro = crearMatriz(l);
        llenarMatriz(registro);
        mostrarMatriz(registro);
        menu(registro);
    }

    public static void menu(double[][] registro) {
        int opcion = 0;
        while (opcion != 3) {
            mostrarmenu();
            opcion = recibirNro("Ingrese una opción:", 1, 3);
            ejecutarOpcion(opcion, registro);
        }

    }

    public static void ejecutarOpcion(int op, double[][] matriz) {
        if (op == 1) {
            System.out.println("------Sismo de mayor intensidad------");
            mayorSismo(matriz);
        }
        if (op == 2) {
            System.out.println("----Numero de sismos mayores a 4.0 grados----");
            contarSismos(matriz);
        }
        if (op == 3) {
            System.out.println("-------Salir del programa-------");
        }

    }


    public static double[][] crearMatriz(int dias) {
        double[][] registro = new double[dias][24];
        return registro;
    }

    public static void llenarMatriz(double[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = 1 + (8.5) * azar.nextDouble();
            }
        }
    }

    public static double mayorSismo(double[][] matriz) {
        double mayor = 0;
        int dia = 0, hora = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] > mayor) {
                    mayor = matriz[x][y];
                    dia = x;
                    hora = y;
                }
            }
        }
        System.out.println("El mayor sismo se registró el dia "+dia+" a las "+hora+"horas y corresponde a "+String.format("%.1f",mayor)+" grados Richter.");
        return mayor;
    }

    public static int contarSismos(double[][] matriz) {
        int sis = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] >= 4.0) {
                    sis++;
                }
            }
        }
        System.out.println("Hubieron "+ sis +" sismos mayores a 4.0 grados Richter.");
        return sis;
    }



    public static int leerNro(String txt) {
        System.out.println(txt);
        while (!teclado.hasNextInt()) {
            System.out.println("Error! debe ingresar un número");
            teclado.nextLine();
        }
        int number = teclado.nextInt();
        return number;

    }

    public static boolean validarNro(int n, int min, int max) {
        boolean valido = false;
        if (n >= min && n <= max) {
            valido = true;
        }
        return valido;
    }

    public static int recibirNro(String txt, int min, int max) {
        int nro = 0;
        boolean flag = false;
        while (flag == false) {
            nro = leerNro("    " + txt);
            flag = validarNro(nro, min, max);
            if (flag == false) {
                System.out.println("Error, ingrese un número entre " + min + " y " + max);
            }
        }
        return nro;
    }

    public static void mostrarmenu() {
        System.out.println("---------------Menú---------------");
        System.out.println(" ( 1 )  Mostrar sismo mas intenso.");
        System.out.println(" ( 2 )  Mostrar número de sismos mayores a 4.0 grados Richter");
        System.out.println(" ( 3 )  Salir. ");

    }

    public static void mostrarMatriz(double[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(" [" + String.format("%.1f",matriz[x][y]) + "] ");
            }
            System.out.println(" ");
        }
    }

}
