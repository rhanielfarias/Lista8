    import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
    public class TesteVestibular {
        public static void main(String[] args) {
            List<Vestibular> listaDeAlunos = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            boolean continuar = true;
            while (continuar) {
                System.out.println("Bem-vindo ao cadastramento do aluno para o vestibular");
                System.out.println("1 - Adicione a matrícula e a nota do aluno");
                System.out.println("2 - Exibir matrícula e nota");
                System.out.println("3 - Remover um aluno pela matrícula");
                System.out.println("4 - Sair do programa");
                int opcao = input.nextInt();
                input.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Informe a matrícula do aluno");
                        String matricula = input.nextLine();
                        System.out.println("Informe a nota do aluno");
                        double nota = input.nextDouble();
                        Vestibular vestibular = new Vestibular(matricula, nota);
                        listaDeAlunos.add(vestibular);
                        break;
                        case 2:
                        System.out.println("Lista de matrícula e nota do aluno: ");
                        for(int i = 0; i < listaDeAlunos.size(); i++) {
                            Vestibular verAluno = listaDeAlunos.get(i);
                                 System.out.println("Matrícula: " + verAluno.getMatricula());
                            System.out.println("Nota: " + verAluno.getNota());
                        }
                        break;
                    case 3:
                        System.out.println("Informe a matrícula do aluno a remover");
                            String  matriculaRemover = input.nextLine();
                        for (int i = 0; i < listaDeAlunos.size(); i++) {
                            Vestibular verAluno = listaDeAlunos.get(i);
                            if(matriculaRemover.equals(verAluno.getMatricula())) {
                                listaDeAlunos.remove(verAluno);
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
