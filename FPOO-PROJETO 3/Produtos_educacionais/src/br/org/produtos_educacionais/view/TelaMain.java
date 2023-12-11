package br.org.produtos_educacionais.view;

import javax.swing.JOptionPane;

import br.org.produtos_educacionais.dao.CrudDAO;
import br.org.produtos_educacionais.model.Produto;

import java.util.Scanner;

public class TelaMain {

    public static void main(String[] args) {
        CrudDAO inserir_produto = new CrudDAO();
        Scanner entrada = new Scanner(System.in);

        int numero;
        do {
            Produto produto1 = new Produto();
            String opcao = JOptionPane.showInputDialog("Seja bem-vindo!\n"
                    + "Para iniciar o programa escolha uma das opções abaixo!\n"
                    + "Criar um produto - 1\n"
                    + "Atualizar valores e informações - 2\n"
                    + "Ler a tabela de produtos - 3\n"
                    + "Excluir um produto da lista - 4\n"
                    + "Sair do programa - 5");

            numero = Integer.parseInt(opcao);

            switch (numero) {
            case 1:
            	System.out.println("Informe a categoria do produto");
            	produto1.setCategoria(entrada.next());
                System.out.println("Informe o nome do produto: ");
                produto1.setNome(entrada.next());
                System.out.println("Informe o valor: ");
                produto1.setValor(entrada.nextFloat());
                inserir_produto.create(produto1);
                System.out.println("Categoria: " + produto1.getCategoria());
                System.out.println("Nome: " + produto1.getNome());
                System.out.println("Valor: " + produto1.getValor());
                break;

            case 2:
            	System.out.println("Informe o número de identificação do produto: ");
                produto1.setNi(entrada.nextInt());
                System.out.println("Informe o nome do produto: ");
                produto1.setNome(entrada.next());
                System.out.println("informe o valor que sera salvo: ");
                produto1.setValor(entrada.nextFloat());
                inserir_produto.update(produto1);
                System.out.println("Número de identificacao: " + produto1.getNi());
                System.out.println("Nome: " + produto1.getNome());
                System.out.println("Valor: " + produto1.getValor());
                break;

            case 3:
                System.out.println("lendo a lista de produtos...");
                for (Produto olho : inserir_produto.read()) {
                    System.out.println("Dados do produto: " + olho.getNi() + " " + olho.getNome() + " "
                            + olho.getValor());
                }
                break;

            case 4:
                System.out.println("Informe o número de identificação do produto que será excluido: ");
                inserir_produto.delete(entrada.nextInt());
                break;

            case 5:
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    } while (numero != 5);
    }
}






/*public class ExemploArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }

        System.out.println(soma);
    }
}*/

