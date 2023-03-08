package FundamentosJava;

public class DesafioAritimetico02 {
    public static void main(String[] args) {

        //Variaveis
        Double var1 = 1.0;
        Double var2 = 2.0;
        Double var3 = 3.0;
        Double var5 = 5.0;
        Double var6 = 6.0;
        Double var7 = 7.0;
        Double var10 = 10.0;

        //Lado A da operação
        Double calc1 = var6 * (var3+var2);
        Double pot1 = Math.pow(calc1,var2);
        Double DivA = pot1 / (var2*var3);

        //Lado B da operação
        Double calc2 =(var1-var5)*(var2-var7);
        Double pot2 = Math.pow(calc2/2,var2);

        //Final
        Double calcF= (DivA - pot2);
        Double pot3= Math.pow(calcF,var3);
        Double pot4= Math.pow(var10,var3);
        Double DivF= pot3 / pot4;




        System.out.println(DivF);


    }
}
