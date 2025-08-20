import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        int opcao;

        do {
            System.out.println("\n--- MENU LISTA ENCADEADA ---");
            System.out.println("1. Adicionar elemento no final");
            System.out.println("2. Adicionar elemento no início");
            System.out.println("3. Adicionar em posição específica");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Remover primeiro elemento");
            System.out.println("6. Remover último elemento");
            System.out.println("7. Remover por posição");
            System.out.println("8. Remover por valor");
            System.out.println("9. Exibir lista");
            System.out.println("10. Limpar lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento: ");
                    String elementoFinal = scanner.nextLine();
                    lista.adicionar(elementoFinal);
                    break;
                case 2:
                    System.out.print("Digite o elemento: ");
                    String elementoInicio = scanner.nextLine();
                    lista.adicionarInicio(elementoInicio);
                    break;
                case 3:
                    System.out.print("Digite a posição: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o elemento: ");
                    String elemPos = scanner.nextLine();
                    lista.adicionarPosicao(pos, elemPos);
                    break;
                case 4:
                    System.out.print("Digite o elemento para buscar: ");
                    String busca = scanner.nextLine();
                    int indice = lista.buscar(busca);
                    if (indice != -1) {
                        System.out.println("Elemento encontrado na posição: " + indice);
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Elemento removido: " + lista.removerPrimeiro());
                    break;
                case 6:
                    System.out.println("Elemento removido: " + lista.removerUltimo());
                    break;
                case 7:
                    System.out.print("Digite a posição para remover: ");
                    int posRemover = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Elemento removido: " + lista.removerPosicao(posRemover));
                    break;
                case 8:
                    System.out.print("Digite o elemento para remover: ");
                    String valorRemover = scanner.nextLine();
                    if (lista.removerElemento(valorRemover)) {
                        System.out.println("Elemento removido com sucesso.");
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
                    break;
                case 9:
                    lista.exibir();
                    break;
                case 10:
                    lista.limpar();
                    System.out.println("Lista limpa.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
