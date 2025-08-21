import Biblioteca.Livro;
import Biblioteca.Revista;
import contaBancaria.ContaBancaria;
import contaBancaria.OperacoesConta;
import produto.Exibivel;
import produto.Produto;
import tarefa.Concluivel;
import tarefa.Tarefa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Lita 5 - Fundamentos do POO, Herança, encapsulamento, abstração e polimorfismo
        /*Herança é quando uma classe herda atributos de uma classe pai.
        * Encapsulamento, é quando definimos o acesso a partes do código, usamos principalmente
        * as palavras reservadas, public(Pode acessar de todos os lugares), private(só pode ser acessado na classe de
        * origen, protected(pode ser acessado na propria classe ou nas classes filhas)
        * abstração, é a forma de separar trechos do código de forma que mudanças em determinadas partes não afetem outros
        * componentes, é criado uma interface para um acesso comum de métodos em classes diferentes,
        * polimorfismo, é a forma de um mesmo método fazer coisas diferentes, comum em conjunto com a abstração onde varias classes compartilharam um
        * método*/
        //exercicios
        //Produto
//        Exibivel prod1 = new Produto("Caneta", 2.25, "teste");
//        prod1.exibirDetalhes();
//
//        //Conta Bancaria
//        OperacoesConta conta1 = new ContaBancaria("1", 0);
//        OperacoesConta conta2 = new ContaBancaria("2", 0);
//        conta1.depositar(100);
//        conta1.sacar(3);
//        conta1.transferir((ContaBancaria) conta2, 7);
//        System.out.println("Saldo: " + conta1.consultarSaldo());
//        System.out.println("Saldo: " + conta2.consultarSaldo());

//         //Tarefas
//        Tarefa tar1 = new Tarefa("Criar API");
//        tar1.exibirStatus();
//        tar1.concluir();
//        tar1.exibirStatus();
//        tar1.adicionarPrioridade(1);
//        tar1.exibirStatus();
//        tar1.concluir();
//        tar1.exibirStatus();

        //Catalogo de Biblioteca

        Revista novo = new Revista("Sun Tzu", "Arte da Guerra", 1460);


    }
}