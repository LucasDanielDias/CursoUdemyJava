package CursoUdemy_Metodos;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        var data1 = new DataOB();
        var data2 = new  DataOB();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a data");
        data1.ano = ler.nextInt();
        data1.mes = ler.nextInt();
        data1.dia = ler.nextInt();

        System.out.printf("A data é : ano %d o mes é %d e o dia é %d \n",data1.ano, data1.mes, data1.dia);

        System.out.println("Digite a data");
        data2.ano = ler.nextInt();
        data2.mes = ler.nextInt();
        data2.dia = ler.nextInt();

        System.out.printf("A data é : ano %d o mes é %d e o dia é %d",data2.ano, data2.mes, data2.dia);
    }
}
