package br.org.sesisp.view;

import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;
import java.util.Scanner;

public class TelaMain {

    public static void main(String[] args) {
        CrudDAO inserir_aluno = new CrudDAO();

        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            do {
                Aluno aluno1 = new Aluno();
                System.out.println("Seja bem-vindo!" + "\nPara iniciar o programa escolha uma das opções abaixo!"
                        + "\n Criar um aluno - 1" + "\n Atualizar valores e informacoes - 2"
                        + "\n Ler a tabela de alunos no Banco de Dados - 3" + "\n excluir um aluno da lista - 4"
                        + "\n Sair do programa - 5");

                numero = entrada.nextInt();
                switch (numero) {
                    case 1:
                        System.out.println("Informe o nome: ");
                        aluno1.setNome(entrada.next());
                        System.out.println("Informe a idade: ");
                        aluno1.setIdade(entrada.nextInt());
                        inserir_aluno.create(aluno1);
                        System.out.println("Nome: " + aluno1.getNome());
                        System.out.println("Idade: " + aluno1.getIdade());
                        break;

                    case 2:
                        System.out.println("Informe o nome que será salvo: ");
                        aluno1.setNome(entrada.next());
                        System.out.println("informe a idade que será salva: ");
                        aluno1.setIdade(entrada.nextInt());
                        System.out.println("Informe o RA: ");
                        aluno1.setRa(entrada.nextInt());
                        inserir_aluno.update(aluno1);
                        System.out.println("Nome: " + aluno1.getNome());
                        System.out.println("Idade: " + aluno1.getIdade());
                        break;

                    case 3:
                        System.out.println("lendo a lista...");
                        for (Aluno olho : inserir_aluno.read()) {
                            System.out.println("Dados do aluno: " + olho.getRa() + " " + olho.getNome() + " "
                                    + olho.getIdade());
                        }
                        break;

                    case 4:
                        System.out.println("Informe o RA do aluno que será excluído: ");
                        inserir_aluno.delete(entrada.nextInt());
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
}
