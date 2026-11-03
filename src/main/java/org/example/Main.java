package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de Fibonacci a calcular: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("El número debe ser mayor o igual que 0.");
            return;
        }
        long[] valores = new long[Math.max(n + 1, 2)];
        valores[0] = 0;
        valores[1] = 1;

        HebraFibonacci[] hebras = new HebraFibonacci[Math.max(n - 1, 0)];
        for (int i = 2; i <= n; i++) {
            hebras[i - 2] = new HebraFibonacci(i, valores);
            hebras[i - 2].start();
        }

        for (HebraFibonacci h : hebras) {
            try {
                h.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Interrumpido mientras se esperaba a una hebra.");
            }
        }

        System.out.println("**************");
        System.out.println("FIBONACCI " + n + ": " + valores[n]);
    }
}
