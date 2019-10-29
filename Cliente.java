import java.util.ArrayList;

public class Cliente {
    int id_cliente;
    String nome;
    String dtnascimento;
    String cpf;
    int diasdevolver;
    List<Locacao> locacoes = new ArrayList<>();
    
    Int Locacao(){
            
 }

    void dadoscliente() {
        System.out.println("\n");
        System.out.println("====== Dados do cliente =====");
        System.out.println("Nome :" + this.nome);
        System.out.println("CPF do cliente:" + this.cpf);
        System.out.println("Id do cliente:" + this.id_cliente);
        System.out.println("Dias para devolução: " + this.diasdevolver);
    }

 // fazer filmes locados
    void filmeslocados() {

    }

}
