package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int funcionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        float valorHora = Float.parseFloat(scanner.next());
        System.out.println("NUMBER = "+funcionario);
        System.out.printf("SALARY = U$ %.2f\n", (valorHora * horasTrabalhadas));
    }
}
