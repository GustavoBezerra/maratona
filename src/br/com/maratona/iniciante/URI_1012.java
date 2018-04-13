package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = Float.parseFloat(scanner.next());
        float b = Float.parseFloat(scanner.next());
        float c = Float.parseFloat(scanner.next());

        System.out.printf("TRIANGULO: %.3f\n", ((a*c)/2));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", ((a+b) * c)/2);
        System.out.printf("QUADRADO: %.3f\n", Math.pow(b, 2));
        System.out.printf("RETANGULO: %.3f\n", a*b);
    }
}
