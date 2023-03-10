package FundamentosJava;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        Double resultado;
        String calc;
        System.out.println("Digite o primeiro numero");
        Double num1 = Ler.nextDouble();
        System.out.println("Digite o segundo numero");
        Double num2 = Ler.nextDouble();
        System.out.println("Digite qual operação");
        System.out.println("1 para adição");
        System.out.println("2 para subtração");
        System.out.println("3 para multiplicação");
        System.out.println("4 para divisão");
        System.out.println("5 para modulo");
        calc = Ler.next();
        if (calc.equals("1")){
            resultado = num1 + num2;
            System.out.printf("O rsultado e %.2f", resultado);
        } else if (calc.equals("2")) {
            resultado = num1 - num2;
            System.out.printf("O rsultado e %.2f", resultado);
        } else if (calc.equals("3")) {
            resultado = num1 * num2;
            System.out.printf("O rsultado e %.2f", resultado);
        } else if (calc.equals("4")) {
            resultado = num1 / num2;
            System.out.printf("O rsultado e %.2f", resultado);
        } else if (calc.equals("5")) {
            resultado = num1 % num2;
            System.out.printf("O rsultado e %.2f", resultado);
        } else
            System.out.println("Operasão invalida!!!");
    }
}
