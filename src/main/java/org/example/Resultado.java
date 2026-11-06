package org.example;

public class Resultado {
    private final long valor;
    private final int contador;
    private final double tiempoMilisegundos;

    public Resultado(long valor, int contador, double tiempoMilisegundos) {
        this.valor = valor;
        this.contador = contador;
        this.tiempoMilisegundos = tiempoMilisegundos;
    }

    public long getValor() {
        return valor;
    }

    public int getContador() {
        return contador;
    }

    public double getTiempoMilisegundos() {
        return tiempoMilisegundos;
    }
}
