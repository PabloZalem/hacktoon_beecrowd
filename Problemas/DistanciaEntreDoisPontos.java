package Problemas;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Cálculo
        double dx = x2 - x1;
        double dy = y2 - y1;

        double distancia = Math.sqrt(dx * dx + dy * dy);

        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}
