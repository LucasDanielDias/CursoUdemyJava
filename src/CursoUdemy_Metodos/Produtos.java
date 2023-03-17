package CursoUdemy_Metodos;

public class Produtos {
    public static void main(String[] args) {
        Produto teste = new Produto();
        var teste2 = new Produto();
        teste.nome = "jogos";
        teste.valor = 7000.0;
        teste.desconto = 0.2;

        teste2.nome = "caneta";
        teste2.valor = 15.6;
        teste2.desconto = 0.56;

        System.out.println(teste.desconto +" " + teste2.nome);
    }
}
