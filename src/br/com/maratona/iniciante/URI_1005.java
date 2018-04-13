package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float notaA = Float.parseFloat(scanner.next());
        float notaB = Float.parseFloat(scanner.next());
        System.out.printf("MEDIA = %.5f\n", (((notaA *3.5) + (notaB*7.5)) / 11));
    }
}
