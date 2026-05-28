package Problemas;

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeDoVendedor = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double comissao = (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", (salarioFixo + comissao));
        sc.close();
    }
}
