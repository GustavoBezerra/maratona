package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        float salario = Float.parseFloat(scanner.next());
        float vendas = Float.parseFloat(scanner.next());
        System.out.printf("TOTAL = R$ %.2f\n", (salario + (vendas * 0.15)));
    }
}
