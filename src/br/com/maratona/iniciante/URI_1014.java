package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        float combustivel = Float.parseFloat(scanner.next());
        System.out.printf("%.3f km/l\n", distancia/combustivel);
    }
}
