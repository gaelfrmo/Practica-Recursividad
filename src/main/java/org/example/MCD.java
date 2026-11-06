package org.example;

public class MCD {

    public static Resultado calcularIterativo(int a, int b) {
        long inicio = System.nanoTime();
        int iteraciones = 0;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            iteraciones++;
        }

        long fin = System.nanoTime();
        double tiempoMs = (fin - inicio) / 1_000_000.0;
        return new Resultado(a, iteraciones, tiempoMs);
    }

    private static int contadorRec = 0;

    public static Resultado calcularRecursivo(int a, int b) {
        contadorRec = 0;
        long inicio = System.nanoTime();
        long res = mcdRecHelper(a, b);
        long fin = System.nanoTime();
        double tiempoMs = (fin - inicio) / 1_000_000.0;
        return new Resultado(res, contadorRec, tiempoMs);
    }

    private static int mcdRecHelper(int a, int b) {
        contadorRec++;
        if (b == 0) {
            return a;
        }
        return mcdRecHelper(b, a % b);
    }
}