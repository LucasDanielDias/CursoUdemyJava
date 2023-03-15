package EstruturaDeControle;

import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        System.out.println("Digite as notas para a somatoria.");
        Scanner ler = new Scanner(System.in);
        Integer operacao = 1, alunos =0;
        Double nota =0.0, notasoma = 0.0;
        while (operacao != 0){
            System.out.println("Digite a nota");
            nota = ler.nextDouble();
            if (nota <=10 && nota >= 0) {
                notasoma += nota;
                alunos++;
            }else
                System.out.println("Nota invalida");
            System.out.println("Digite a operção 1 para continuar");
            System.out.println("Digite a operação 0 para sair");
            operacao = ler.nextInt();
        }
        Double Media = notasoma / alunos;
        System.out.printf("A media da tuma de %d alunos foi de %.2f",alunos,Media);
    }
}
