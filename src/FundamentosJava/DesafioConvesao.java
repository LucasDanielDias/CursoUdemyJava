package FundamentosJava;

import java.util.Scanner;
import java.util.Locale;

public class DesafioConvesao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner Ler = new Scanner(System.in);
        System.out.println("Deigite o primeiro salario");
        String S1 = Ler.nextLine().replace(",",".");
        System.out.println("Digite o segundo salario");
        String S2 = Ler.nextLine().replace(",",".");
        System.out.println("Digite o terceiro salario");
        String S3 = Ler.nextLine().replace(",",".");

        Double Salario1 = Double.parseDouble(S1);
        Double Salario2 = Double.parseDouble(S2);
        Double Salario3 = Double.parseDouble(S3);
        Double Media = (Salario1 + Salario2 + Salario3)/3;
        System.out.printf("A media é : %.2f",Media);
        Ler.close();
    }
}
