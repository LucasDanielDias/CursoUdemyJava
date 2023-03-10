package FundamentosJava;

import java.util.Locale;
import java.util.Scanner;

public class TesteTernario {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        System.out.println("Digite as tres notas do aluno");
        Scanner Ler = new Scanner(System.in);
        System.out.println("Nota 1");
        double nota1 = Ler.nextDouble();

        System.out.println("Nota 2");
        double  nota2 = Ler.nextDouble();

        System.out.println("Nota 3");
        double nota3 = Ler.nextDouble();
        
        double media = (nota1+nota2+nota3) / 3;
        
        String resultado = media>= 7.0 ? "aprovado" : "reprovado";
        if (resultado == "aprovado"){
            System.out.println("Parabens você foi aprovado");
        } else if (resultado == "reprovado" && media >= 5.0) {
            System.out.println("Você não foi "+ resultado +", mas está de recuperação");
        } else
            System.out.println("É você foi reprovado");

    }
}
