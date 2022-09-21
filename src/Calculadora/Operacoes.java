package Calculadora;


import java.util.Scanner;

public class Operacoes {
    Scanner scan = new Scanner(System.in);
    double resultado;

    public void soma(double numero1, double numero2) {

        resultado = numero1 + numero2;
        System.out.println("O resultado da soma é: " + resultado);
    }

    public void subtracao(double numero1, double numero2) {
        resultado = numero1 - numero2;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    public void multiplicacao(double numero1, double numero2) {
        resultado = numero1 * numero2;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public void divisao(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Não existe divisão por zero");
        } else
            resultado = numero1 / numero2;
        System.out.println("O resultado da divisão é: " + resultado);
    }

    public void menu() {
        System.out.println("Qual operação deseja realizar? Informe um número:\n"
                + " 1 - SOMA\n"
                + " 2 - SUBTRAÇÃO\n"
                + " 3 - MULTIPLICAÇÃO\n"
                + " 4 - DIVISÃO\n"
                + " 0 - ENCERRAR O PROGRAMA\n");
        int opcaoSelecionada = scan.nextInt();
        if (opcaoSelecionada == 0) System.exit(0); // encerra a aplicação

        System.out.println("Digite o primeiro número:");
        double numero1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scan.nextDouble();

        System.out.println(opcaoSelecionada);
        if (opcaoSelecionada == 1) soma(numero1, numero2);
        if (opcaoSelecionada == 2) subtracao(numero1, numero2);
        if (opcaoSelecionada == 3) multiplicacao(numero1, numero2);
        if (opcaoSelecionada == 4) divisao(numero1, numero2);

        System.out.println("Deseja fazer uma nova operação? [S/N]:");
        String decisao = scan.next();

        if ("S".equals(decisao)) {
            menu();
        } else {
            System.out.println("Obrigado! Fim do programa");
        }
    }
}