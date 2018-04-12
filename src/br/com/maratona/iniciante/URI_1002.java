package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = Double.parseDouble(scanner.next());
        System.out.printf("A=%.4f", (3.14159*(Math.pow(raio, 2))));
        System.out.println();
    }
}
