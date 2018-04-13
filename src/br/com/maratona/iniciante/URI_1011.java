package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("VOLUME = %.3f\n", ((4/3.0) * 3.14159 * Math.pow(scanner.nextInt(), 3)));
    }
}
