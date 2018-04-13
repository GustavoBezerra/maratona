package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();
        System.out.println("DIFERENCA = "+(valorA * valorB - valorC * valorD));
    }
}
