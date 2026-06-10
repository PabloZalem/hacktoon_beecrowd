package Problemas;

import java.io.*;

public class GastoDeCombustivel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tempo = Integer.parseInt(br.readLine());
        int velocidade = Integer.parseInt(br.readLine());

        double distancia = tempo * velocidade;

        double gasto = distancia / 12;

        System.out.printf("%.3f\n", gasto);

        br.close();
    }
}
