package org.example;

public class Fibonacci {

    public static Resultado calcularIterativo(int n) {
        long inicio = System.nanoTime();
        if (n <= 0) {
            long fin = System.nanoTime();
            return new Resultado(0, 0, (fin - inicio) / 1_000_000.0);
        }
        if (n == 1) {
            long fin = System.nanoTime();
            return new Resultado(1, 0, (fin - inicio) / 1_000_000.0);
        }

        long a = 0, b = 1, c = 0;
        int contador = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            contador++;
        }

        long fin = System.nanoTime();
        double tiempoMs = (fin - inicio) / 1_000_000.0;
        return new Resultado(c, contador, tiempoMs);
    }

    private static int contadorRec = 0;

    public static Resultado calcularRecursivo(int n) {
        contadorRec = 0;
        long inicio = System.nanoTime();
        long res = fibonacciRecHelper(n);
        long fin = System.nanoTime();
        double tiempoMs = (fin - inicio) / 1_000_000.0;
        return new Resultado(res, contadorRec, tiempoMs);
    }

    private static long fibonacciRecHelper(int n) {
        contadorRec++;
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecHelper(n - 1) + fibonacciRecHelper(n - 2);
    }
}
