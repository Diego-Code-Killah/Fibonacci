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

        }
    }
