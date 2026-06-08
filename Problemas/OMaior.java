package Problemas;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Processamento
        int maiorAb = (a > b) ? a : b;
        int maior = (maiorAb > c) ? maiorAb : c;

        // Saída
        System.out.println(maior + " eh o maior");

        sc.close();
    }
}
