package org.example;

public class Factorial {

    public static Resultado calcularIterativo(int n) {
        long inicio = System.nanoTime();
        long res = 1;
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            res *= i;
            contador++;
        }

        long fin = System.nanoTime();
        double tiempoMs = (fin - inicio) / 1_000_000.0;
        return new Resultado(res, contador, tiempoMs);
    }

    private static int contadorRec = 0;

    public static Resultado calcularRecursivo(int n) {
        contadorRec = 0;
        long inicio = System.nanoTime();
        long res = factorialRecHelper(n);
        long fin = System.nanoTime();
        double tiempoMs = (fin - inicio) / 1_000_000.0;
        return new Resultado(res, contadorRec, tiempoMs);
    }

    private static long factorialRecHelper(int n) {
        contadorRec++;
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecHelper(n - 1);
    }
}