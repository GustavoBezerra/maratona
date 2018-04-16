package br.com.maratona.iniciante;

import java.util.Scanner;
import java.util.TreeSet;

public class URI_1013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Number> lista = new TreeSet<>();
        lista.add(scanner.nextInt());
        lista.add(scanner.nextInt());
        lista.add(scanner.nextInt());

        System.out.println(lista.last()+" eh o maior");
    }
}
