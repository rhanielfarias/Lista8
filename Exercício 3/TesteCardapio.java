import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class TesteCardapio {
    public static void main(String[] args) {
        List<Cardapio> listaDePratos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bem-vindo ao gerenciador de pratos. Por favor, escolha uma das opções a baixo: ");
        while (continuar) {
            System.out.println("1 - Adicionar um prato");
            System.out.println("2 - Exibir pratos cadastrados");
            System.out.println("3 - Excluir um prato");
            System.out.println("4 - Sair do programa");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do prato");
                    String prato = input.nextLine();
                    System.out.println("Por favor, informe os ingredientes do prato. Utilize vírgula para separar");
                    String ingredientes = input.nextLine();
                    Cardapio cardapio = new Cardapio(prato, ingredientes);
                    listaDePratos.add(cardapio);
                    break;
                case 2:
                    System.out.println("Abaixo segue o prato e seus ingredientes");
                    for (int i = 0; i < listaDePratos.size(); i++) {
                        Cardapio verPrato = listaDePratos.get(i);
                        System.out.println("Prato: " + verPrato.getPrato());

                        System.out.println(" - Ingredientes: " + verPrato.getIngredientes());
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome do prato a remover, por favor");
                    String pratoRemover = input.nextLine();
                    for (int i = 0; i < listaDePratos.size(); i++) {
                        Cardapio verPrato = listaDePratos.get(i);
                        if (pratoRemover.equals(verPrato.getPrato())) {
                            listaDePratos.remove(verPrato);
                        }
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }}
