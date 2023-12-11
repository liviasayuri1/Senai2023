package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class TesteVoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do cliente
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o sobrenome do cliente:");
        String sobrenomeCliente = scanner.nextLine();

        System.out.println("Digite o email do cliente:");
        String emailCliente = scanner.nextLine();

        Passageiro cliente = new Passageiro(nomeCliente, sobrenomeCliente, emailCliente);

        // Criação de três voos
        Voo voo1 = criarVoo(scanner, 1);
        Voo voo2 = criarVoo(scanner, 2);
        Voo voo3 = criarVoo(scanner, 3);

        // Compra de passagem pelo cliente
        System.out.println("Digite o número do voo desejado (1, 2 ou 3):");
        int numeroVooEscolhido = scanner.nextInt();

        Voo vooEscolhido = null;
        switch (numeroVooEscolhido) {
            case 1:
                vooEscolhido = voo1;
                break;
            case 2:
                vooEscolhido = voo2;
                break;
            case 3:
                vooEscolhido = voo3;
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        System.out.println("Digite o preço total da passagem:");
        double precoTotal = scanner.nextDouble();

        Passagem passagem = new Passagem(vooEscolhido, cliente, precoTotal);

        // Exibição das informações
        System.out.println("Informações da Passagem:");
        passagem.toStringParaguai();

        // Fechar o scanner
        scanner.close();
    }

    // Método para criar um voo com entrada do usuário
    private static Voo criarVoo(Scanner scanner, int numeroVoo) {
        System.out.println("Digite a origem do voo " + numeroVoo + ":");
        String origem = scanner.next();

        System.out.println("Digite o destino do voo " + numeroVoo + ":");
        String destino = scanner.next();

        System.out.println("Digite o preço do voo " + numeroVoo + ":");
        double preco = scanner.nextDouble();

        System.out.println("Digite a data de ida do voo " + numeroVoo + " (formato: YYYY-MM-DD):");
        String dataIda = scanner.next();

        System.out.println("Digite a data de volta do voo " + numeroVoo + " (formato: YYYY-MM-DD):");
        String dataVolta = scanner.next();

        return new Voo(numeroVoo, origem, destino, preco, dataIda, dataVolta);
    }
}
