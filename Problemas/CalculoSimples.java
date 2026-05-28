package Problemas;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulador = 0.0;

        for (int i = 0; i < 2; i++) {
            int codigoDaPeca = sc.nextInt();
            int quantidadeDePeca = sc.nextInt();
            double valorUnitario = sc.nextDouble();

            acumulador += quantidadeDePeca * valorUnitario;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", acumulador);

        sc.close();
    }
}
