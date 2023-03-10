package FundamentosJava;

import java.util.Scanner;

public class DesafioLogico {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Responda com true ou false");
        System.out.println("trabalho1");
        boolean trabalho1 = Ler.nextBoolean();
        System.out.println("trabalho2");
        boolean trabalho2 = Ler.nextBoolean();

        if (trabalho1== true && trabalho2 ==true){
            System.out.println("A tv é de 50 polegadas");
        }else if (trabalho1 == true && trabalho2 == false || trabalho1 == false && trabalho2 == true) {
            System.out.println("A tv é de 32 polegadas");
        } else{
            System.out.println("Sem tv");
        }
        if (trabalho1 == true || trabalho2 == true){
            System.out.println("Olha o sorvete");
        }else {
            System.out.println("Sem sorvete");
        }
    }
}
