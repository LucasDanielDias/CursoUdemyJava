package FundamentosJava;
import  java.math.MathContext;
public class DesafiosArritimeticos {
    public static void main(String[] args) {
        double var3;
        double var2;
        double var1;
        double var5;
        double var7;
        double var10;
        double var6;

        var3 = 3;
        var2 = 2;
        var1 = 1;
        var5 = 5;
        var7 = 7;
        var10 = 10;
        var6 = 6;

        Double Resultado1;
        Double Resultado2;

        Double Potencia1;
        Double Potencia2;
        Double Potencia3;
        Double Potencia4;

        Double Divisão1;
        Double Divisão2;
        Double Resolução;

        Resultado1 = ((var6*(var3 + var2)));

        Potencia1 = Math.pow(Resultado1, var2);

        Resultado2 = (var5 - var1)*(var7 - var2);

        Potencia2 = Math.pow(Resultado2, var2);

        Divisão1 = Potencia1 / (var2*var3);
        Divisão2 = Potencia2 / var2;
        Potencia3 = Math.pow(Divisão2,var3);
        Potencia4 = Math.pow(var10, var3);
        Resolução = (Divisão1 - Potencia3)/Potencia4;
        System.out.println(Resolução);


    }
}
