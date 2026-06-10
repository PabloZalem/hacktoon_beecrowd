package Problemas;

import java.io.*;

public class Cedulas {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int valor = Integer.parseInt(br.readLine());
        int cedulas[] = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        for (int nota : cedulas) {
            int quantidade = valor / nota;
            System.out.println(quantidade + " nota(s) de R$ " + String.format("%.2f", (double) nota));
            valor = valor % nota;
        }

        br.close();
    }
}
