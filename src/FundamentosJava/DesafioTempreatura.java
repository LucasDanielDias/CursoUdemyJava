package FundamentosJava;

import java.util.Scanner;

public class DesafioTempreatura {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite a temperatura em C°.");
        final double ConstanteF = 32;
        final double ConstanteDif = 9.0/5.0;//Divisão por numeros inteiros dara o resultado inteiro.coloque o ponto para ter a casa decimal.
        double C = ler.nextDouble();
        double F = (C * ConstanteDif) + ConstanteF;
        String J = "A temperatura em F° é";

        System.out.println(J.toUpperCase() + F);
        ler.close();
    }
}
