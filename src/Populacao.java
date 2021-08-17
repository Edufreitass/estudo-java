package src;

public class Populacao {

    /**
     * 4) Supondo que a população de um país A seja da ordem de 80000
     *  habitantes com uma taxa anual de crescimento de 3% e que a
     *  população de B seja 200000 habitantes com uma taxa de crescimento
     *  de 1.5%. Faça um programa que calcule e escreva o número de anos
     *  necessários para que a população do país A ultrapasse ou iguale a
     *  população do país B, mantidas as taxas de crescimento.
     */
    public static void main(String[] args) {

        int paisA = 80000; // 3% tx cresc
        int paisB = 200000; // 1.5% tx cresc
        int contador = 0;

        // paisA precisa ultrapassar ou igualar a população do paisB
        while(paisA < paisB) {

            paisA += (paisA / 100) * 3;
            paisB += (paisB / 100) * 1.5;
            contador++;

        }

        System.out.println("paisA: " + paisA);
        System.out.println("paisB: " + paisB);
        System.out.println("Numeros de anos: " + contador);
    }

}
