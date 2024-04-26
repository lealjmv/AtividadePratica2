import java.util.Scanner;

public class SistemaPosto {

    public static void exibirMenu() {
        System.out.println("\n*** MENU ***");
        System.out.println("1) Cadastro de Veículo");
        System.out.println("2) Busca de Veículo");
        System.out.println("3) Exclusão de Veículo");
        System.out.println("4) Listagem de Todos os Veículos");
        System.out.println("5) Exclusão Total de Veículos");
        System.out.println("0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    buscarVeiculo();
                    break;
                case 3:
                    excluirVeiculo();
                    break;
                case 4:
                    listarTodosVeiculos();
                    break;
                case 5:
                    excluirTodosVeiculos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarVeiculo() {
    }

    private static void buscarVeiculo() {
    }

    private static void excluirVeiculo() {
    }

    private static void listarTodosVeiculos() {
    }

    private static void excluirTodosVeiculos() {
    }
}
