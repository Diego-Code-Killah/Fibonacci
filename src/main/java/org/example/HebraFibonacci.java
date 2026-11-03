package org.example;



public class HebraFibonacci extends Thread {

    private static volatile int ultimoCalculado = 1;

    private final int i;
    private final long[] valores;

    public HebraFibonacci(int i, long[] valores) {
        this.i = i;
        this.valores = valores;
    }
    @Override
    public void run() {
        while (ultimoCalculado < i - 1) {
            Thread.onSpinWait();
        }

        valores[i] = valores[i - 1] + valores[i - 2];
        System.out.println("Fibonacci " + i + ": " + valores[i]);

        ultimoCalculado = i;
    }
}
