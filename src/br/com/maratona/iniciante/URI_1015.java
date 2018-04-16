package br.com.maratona.iniciante;

import java.util.Scanner;

public class URI_1015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = Float.parseFloat(scanner.next());
        float y1 = Float.parseFloat(scanner.next());
        float x2 = Float.parseFloat(scanner.next());
        float y2 = Float.parseFloat(scanner.next());

        System.out.printf("%.4f\n", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}
