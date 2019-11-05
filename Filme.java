public class Filme {
    int id_filme;
    String nomeF;
    String dtlancamento;
    String Sinopse;
    double vl;
    int estoque;

    void dadosfilmes() {
        System.out.println("\n");
        System.out.println("====== Dados do filme =====");
        System.out.println("\n");
        System.out.println("Nome do filme:" + this.nomeF);
        System.out.println("Id do filme:" + this.id_filme);
        System.out.println("Sinopse:" + this.Sinopse);
        System.out.println("Quantidades d filmes em esotque:" + this.estoque);
        System.out.println(" Valor:" + this.vl + " reais");
    }
}
