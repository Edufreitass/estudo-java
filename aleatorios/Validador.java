package aleatorios;

import java.util.Scanner;

public class Validador {

    /**
     * 3) Faça um programa que leia e valide as seguintes informações:
     *      a. Nome: maior que 3 caracteres;
     *      b. Idade: entre 0 e 150;
     *      c. Salário: maior que zero;
     *      d. Sexo: 'f' ou 'm';
     *      e. Estado Civil: 's', 'c', 'v', 'd';
     */
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);

        boolean validador = false;

        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        // a. Nome: maior que 3 caracteres;
        do {
            System.out.println("Entre com o nome:");
            nome = scan.nextLine();

            if (nome.length() >= 3) {
                validador = true;
            } else {
                System.out.println("O nome precisa ter no mínimo 3 caracteres.");
            }
        } while (!validador);

        validador = false;
        // b. Idade: entre 0 e 150;
        do {
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                validador = true;
            } else {
                System.out.println("A idade precisa estar entre 0 e 150.");
            }
        } while (!validador);

        validador = false;
        // c. Salário: maior que zero;
        do {
            System.out.println("Entre com o salario:");
            salario = scan.nextDouble();

            if (salario > 0) {
                validador = true;
            } else {
                System.out.println("O salario precisa ser maior que zero.");
            }
        } while (!validador);

        validador = false;
        // d. Sexo: 'f' ou 'm';
        do {
            System.out.println("Entre com o sexo (f - m):");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                validador = true;
            } else {
                System.out.println("O sexo precisa ser 'f' ou 'm'");
            }
        } while (!validador);

        validador = false;
        // e. Estado Civil: 's', 'c', 'v', 'd';
        do {
            System.out.println("Entre com o estado civil:");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                validador = true;
            } else {
                System.out.println("O estado civil precisar ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!validador);

        System.out.println("Os dados coletados foram:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scan.close();
    }

}
