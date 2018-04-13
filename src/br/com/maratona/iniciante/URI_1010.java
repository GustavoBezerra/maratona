package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigoPeca1 = scanner.next();
        String quantidadePeca1 = scanner.next();
        String valorPeca1 = scanner.next();
        String codigoPeca2 = scanner.next();
        String quantidadePeca2 = scanner.next();
        String valorPeca2 = scanner.next();
        float valorTotalPeca1 = Float.parseFloat(quantidadePeca1) * Float.parseFloat(valorPeca1);
        float valorTotalPeca2 = Float.parseFloat(quantidadePeca2) * Float.parseFloat(valorPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotalPeca1+valorTotalPeca2);
    }
}
