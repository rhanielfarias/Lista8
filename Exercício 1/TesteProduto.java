import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class TesteProduto {
    public static void main(String[] args) {
        List<Produto> listaDeProdutos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Bem-vindo ao gerenciador de produtos. Digite uma opção");
            System.out.println("1 - Adicionar um produto");
            System.out.println("2 - Ver a lista de produtos já adicionados");
            System.out.println("3 - Excluir um produto pelo nome");
            System.out.println("4 - Sair do gerenciador de produtos");
            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do produto");
                    String nome = input.nextLine();
                    System.out.println("Informe o valor do produto");
                    double preco = input.nextDouble();
                    Produto produto = new Produto(nome, preco);
                    listaDeProdutos.add(produto);
                    break;
                case 2:
                    System.out.println("Produtos cadastrados: ");
                    for (int i = 0; i < listaDeProdutos.size(); i++) {
                        Produto verProduto = listaDeProdutos.get(i);
                        System.out.println(verProduto.getNome() + " " + "r$ " + verProduto.getPreco());
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome do produto a remover");
                    String nomeRemover = input.nextLine();
                    for (int i = 0; i < listaDeProdutos.size(); i++) {
                        Produto verProduto = listaDeProdutos.get(i);
                        if (nomeRemover.equals(verProduto.getNome())) {
                            listaDeProdutos.remove(verProduto);
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

    }
}