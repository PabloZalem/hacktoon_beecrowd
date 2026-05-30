

import java.io.*;

public class Esfera {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double raio = Double.parseDouble(reader.readLine()); // Exemplo de raio
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("O volume da esfera é: " + volume);

        reader.close();
    }
}
