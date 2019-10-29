public class Locadora {
    public static void main(String[] args) {

        // Atribuindo caracteristicas ao clientes

        Cliente cl1 = new Cliente();
        cl1.id_cliente = 1;
        cl1.nome = "José da silva";
        cl1.cpf = "123.546.987-45";
        cl1.dtnascimento = "22/02/198";
        cl1.diasdevolver = 2;
        cl1.dadoscliente();

        Cliente cl2 = new Cliente();
        cl2.id_cliente = 2;
        cl2.nome = "Alencar Boracio";
        cl2.cpf = "145.546.487-45";
        cl2.dtnascimento = "08/03/1991";
        cl2.diasdevolver = 3;
        cl2.dadoscliente();

        Cliente cl3 = new Cliente();
        cl3.id_cliente = 3;
        cl3.nome = "Neotom Cor da Vida";
        cl3.cpf = "322.546.876-25";
        cl3.dtnascimento = "08/08/2002";
        cl3.diasdevolver = 2;
        cl3.dadoscliente();

        Cliente cl4 = new Cliente();
        cl4.id_cliente = 2;
        cl4.nome = "Bala Cu baco";
        cl4.cpf = "246.536.874-45";
        cl4.dtnascimento = "28/12/1981";
        cl4.diasdevolver = 4;
        cl4.dadoscliente();

        Cliente cl5 = new Cliente();
        cl5.id_cliente = 2;
        cl5.nome = "Judas de Jesus";
        cl5.cpf = "216.985.145-28";
        cl5.dtnascimento = "09/10/2010";
        cl5.diasdevolver = 1;
        cl5.dadoscliente();

        // Atribuindo caracteristicas para cada filme ****

        Filme f1 = new Filme();
        f1.id_filme = 1;
        f1.nomeF = "Faço o possível";
        f1.Sinopse = "Esdudante de tecnologia se esforça para poder pensar de forma logica e entra no mundo cibernetico.";
        f1.dtlancamento = "15/02/2019";
        f1.vl = 5;
        f1.estoque = 2;
        f1.dadosfilmes();

        Filme f2 = new Filme();
        f2.id_filme = 2;
        f2.nomeF = "E agora?";
        f2.Sinopse = "Allan se esforça para aprender conteudo da sua aula porem nao consegue entender o que vai fazer?.";
        f2.dtlancamento = "05/11/2000";
        f2.estoque = 3;
        f2.vl = 3;
        f2.dadosfilmes();

        Filme f3 = new Filme();
        f3.id_filme = 3;
        f3.nomeF = "O terceiro";
        f3.Sinopse = "Garota esta namorando um rapa do bairro e no trabalho sempre dao emcima dela, oque ela faz?.";
        f3.dtlancamento = "31/12/1988";
        f3.estoque = 2;
        f3.vl = 3;
        f3.dadosfilmes();

        Filme f4 = new Filme();
        f4.id_filme = 4;
        f4.nomeF = "Duro de roer";
        f4.Sinopse = "Jessy comprou na feira uma rapadura, e para nao estragar deixou no freezer.";
        f4.dtlancamento = "28/07/2019";
        f4.estoque = 1;
        f4.vl = 5;
        f4.dadosfilmes();

        Filme f5 = new Filme();
        f5.id_filme = 5;
        f5.nomeF = "Edredom";
        f5.Sinopse = "Dia chuvoso e a vontade de sair da cama e zero.";
        f5.dtlancamento = "22/07/1988";
        f5.estoque = 2;
        f5.vl = 1;
        f5.dadosfilmes();

        Filme f6 = new Filme();
        f6.id_filme = 6;
        f6.nomeF = "Pira pura";
        f6.Sinopse = "A fraternidade recebe um mandato de despejo e esta com os dias contatos, mas so querem curtir..";
        f6.dtlancamento = "09/05/1999";
        f6.vl = 2;
        f6.estoque = 4;
        f6.dadosfilmes();

        Filme f7 = new Filme();
        f7.id_filme = 7;
        f7.nomeF = "O Eco";
        f7.Sinopse = "Uma aventureira esta pronta a se deperar com vozes que sao ecooam em sua cabeça";
        f7.dtlancamento = "04/08/2010";
        f7.estoque = 1;
        f7.vl = 4;
        f7.dadosfilmes();

        Filme f8 = new Filme();
        f8.id_filme = 8;
        f8.nomeF = "Penteado do careca";
        f8.Sinopse = "Apos perder o cabelo um rapaz que era louco por penteado tenta achar um jeito de mostrar seu topete ";
        f8.dtlancamento = "02/06/2013";
        f8.estoque = 2;
        f8.vl = 6;
        f8.dadosfilmes();

        Filme f9 = new Filme();
        f9.id_filme = 9;
        f9.nomeF = "Ri agora depois chora";
        f9.Sinopse = "Nada é melhor do que sexo orgia e rebeldia na adolescencia, mal sbia eles oque pode acontecer... ";
        f9.dtlancamento = "09/05/2018";
        f9.estoque = 5;
        f9.vl = 3;
        f9.dadosfilmes();

        Filme f10 = new Filme();
        f10.id_filme = 10;
        f10.nomeF = "Bulling";
        f10.Sinopse = "Um jove se muda para uma ciadade nova e seu estilo de vida e totalmente diferente da cidade em que est atualmente..";
        f10.dtlancamento = "21/12/2011";
        f10.estoque = 1;
        f10.vl = 5;
        f10.dadosfilmes();

        // Atribuindo Caracteristicas para Locação.

        Locacao loca1 = new Locacao();
        loca1.id_cliente = 1;
        loca1.id_locacao = 5;
        loca1.dtlocacao = "25/05/2019";
        loca1.dtdevolucao = "27/05/2019";
        loca1.locar();

        Locacao loca2 = new Locacao();
        loca2.id_cliente = 4;
        loca2.id_locacao = 4;
        loca2.dtlocacao = "05/05/2019";
        loca2.dtdevolucao = "07/05/2019";
        loca2.locar();

        Locacao loca3 = new Locacao();
        loca3.id_cliente = 2;
        loca3.id_locacao = 1;
        loca3.dtlocacao = "30/01/2017";
        loca3.dtdevolucao = "02/02/2017";
        loca3.locar();

        Locacao loca4 = new Locacao();
        loca4.id_cliente = 2;
        loca4.id_locacao = 3;
        loca4.dtlocacao = "28/11/2017";
        loca4.dtdevolucao = "30/11/2017";
        loca4.locar();

        Locacao loca5 = new Locacao();
        loca5.id_cliente = 1;
        loca5.id_locacao = 8;
        loca5.dtlocacao = "28/11/2017";
        loca5.dtdevolucao = "30/11/2017";
        loca5.locar();
    }
}