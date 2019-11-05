
public class Locacao {
    int id_locacao;
    int id_cliente;
    String dtlocacao;
    String dtdevolucao;

    void locar() {
        System.out.println("O id da locação:" + this.id_locacao);
        System.out.println("O id do cliente:" + this.id_cliente);
        System.out.println("Data de alocação:" + this.dtlocacao);
        System.out.println("Data para devolução:" + this.dtdevolucao);
        System.out.println("\n");
    }

}
