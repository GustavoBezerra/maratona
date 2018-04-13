package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float notaA = Float.parseFloat(scanner.next());
        float notaB = Float.parseFloat(scanner.next());
        float notaC = Float.parseFloat(scanner.next());
        System.out.printf("MEDIA = %.1f\n", (((notaA * 2) + (notaB * 3) + (notaC * 5)) / 10));
    }
}
