package org.example;



public class HebraFibonacci extends Thread {

    private static volatile int ultimoCalculado = 1;

    private final int i;
    private final long[] valores;

    public HebraFibonacci(int i, long[] valores) {
        this.i = i;
        this.valores = valores;
    }
}
