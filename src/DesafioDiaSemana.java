import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o dia");
        String Dia = Ler.nextLine();

        if (Dia.equalsIgnoreCase("Domingo")){
            System.out.println("Domingo 1");
        } else if (Dia.equalsIgnoreCase("Segunda")) {
            System.out.println("Segunda 2");
        } else if (Dia.equalsIgnoreCase("Terça")) {
            System.out.println("Terça 3");
        } else if (Dia.equalsIgnoreCase("Quarta")) {
            System.out.println("Quarta 4");
        } else if (Dia.equalsIgnoreCase("Quinta")) {
            System.out.println("Quinta 5");
        } else if (Dia.equalsIgnoreCase("Sexta")){
            System.out.println("Sexta 6");
        } else if (Dia.equalsIgnoreCase("Sabado")) {
            System.out.println("Sabado 7");
        } else
            System.out.println("Dia não encontrado");
        Ler.close();
    }
}