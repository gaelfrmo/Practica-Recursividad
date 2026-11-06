package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println();
            System.out.println("========================================");
            System.out.println("                 MENU                   ");
            System.out.println("========================================");
            System.out.println("1) Factorial");
            System.out.println("2) Fibonacci");
            System.out.println("3) MCD (Algoritmo de Euclides)");
            System.out.println("4) Creditos");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opcion: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero valido");
                scanner.next();
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.print("Ingrese un numero entero positivo para el Factorial: ");
                    int nFact = scanner.nextInt();
                    if (nFact < 0) {
                        System.out.println("El numero debe ser entero positivo.");
                        break;
                    }
                    Resultado resFactIt = Factorial.calcularIterativo(nFact);
                    Resultado resFactRec = Factorial.calcularRecursivo(nFact);

                    System.out.println();
                    System.out.println("--- RESULTADOS FACTORIAL (" + nFact + ") ---");
                    System.out.println("METODO ITERATIVO:");
                    System.out.println("  Resultado : " + resFactIt.getValor());
                    System.out.println("  Vueltas   : " + resFactIt.getContador());
                    System.out.println("  Tiempo    : " + resFactIt.getTiempoMilisegundos() + " ms");

                    System.out.println();
                    System.out.println("METODO RECURSIVO:");
                    System.out.println("  Resultado : " + resFactRec.getValor());
                    System.out.println("  Llamadas  : " + resFactRec.getContador());
                    System.out.println("  Tiempo    : " + resFactRec.getTiempoMilisegundos() + " ms");
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Ingrese el termino de la serie Fibonacci a calcular: ");
                    int nFib = scanner.nextInt();
                    if (nFib < 0) {
                        System.out.println("El termino debe ser entero positivo.");
                        break;
                    }
                    Resultado resFibIt = Fibonacci.calcularIterativo(nFib);
                    Resultado resFibRec = Fibonacci.calcularRecursivo(nFib);

                    System.out.println();
                    System.out.println("--- RESULTADOS FIBONACCI (Termino " + nFib + ") ---");
                    System.out.println("METODO ITERATIVO:");
                    System.out.println("  Resultado : " + resFibIt.getValor());
                    System.out.println("  Vueltas   : " + resFibIt.getContador());
                    System.out.println("  Tiempo    : " + resFibIt.getTiempoMilisegundos() + " ms");

                    System.out.println();
                    System.out.println("METODO RECURSIVO:");
                    System.out.println("  Resultado : " + resFibRec.getValor());
                    System.out.println("  Llamadas  : " + resFibRec.getContador());
                    System.out.println("  Tiempo    : " + resFibRec.getTiempoMilisegundos() + " ms");
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Ingrese el primer numero para el MCD: ");
                    int aMcd = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero para el MCD: ");
                    int bMcd = scanner.nextInt();

                    Resultado resMcdIt = MCD.calcularIterativo(aMcd, bMcd);
                    Resultado resMcdRec = MCD.calcularRecursivo(aMcd, bMcd);

                    System.out.println();
                    System.out.println("--- RESULTADOS MCD (Euclides) ---");
                    System.out.println("METODO ITERATIVO:");
                    System.out.println("  Resultado : " + resMcdIt.getValor());
                    System.out.println("  Vueltas   : " + resMcdIt.getContador());
                    System.out.println("  Tiempo    : " + resMcdIt.getTiempoMilisegundos() + " ms");

                    System.out.println();
                    System.out.println("METODO RECURSIVO:");
                    System.out.println("  Resultado : " + resMcdRec.getValor());
                    System.out.println("  Llamadas  : " + resMcdRec.getContador());
                    System.out.println("  Tiempo    : " + resMcdRec.getTiempoMilisegundos() + " ms");
                    break;

                case 4:
                    System.out.println();
                    System.out.println("========================================");
                    System.out.println("               CREDITOS                 ");
                    System.out.println("========================================");
                    System.out.println("Materia   : Estructuras de Datos");
                    System.out.println("Alumno    : Gael Adriel Alvarado de Avila");
                    System.out.println("Matricula : 25420169");
                    System.out.println("========================================");
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Saliedo");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 5);
    }
}