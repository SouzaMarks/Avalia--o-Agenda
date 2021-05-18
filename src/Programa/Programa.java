package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classe.Contato;

public class Programa extends Contato {
        public Programa(String nome2, String numero2, int codigo2) {
        super(numero2, codigo2, numero2);
        }
            public static void main(String[] args) {
                List<Contato> contatos = new ArrayList<>();
                int opcao, totalcontatos = 0;
                boolean founded;
                Scanner ler = new Scanner(System.in);
        
                do {
                    //#region
                    System.out.println("\n ============================================================");
                    System.out.println("\n          Inhaiin! Digite a opção de sua preferência ");
                    System.out.println("\n ============================================================");
                    System.out.println("\n 1 -  adicionar um contato");
                    System.out.println("\n 2 -  listar os contatos adicionados por código");
                    System.out.println("\n 3 -  listar os contatos adicionados por ordem alfabética");
                    System.out.println("\n 4 -  procurar um contato por código");
                    System.out.println("\n 5 -  procurar um contato por nome");
                    System.out.println("\n 6 - deletar um contato");
                    System.out.println("\n 0 -  Sair");
                    System.out.println("\n ============================================================");
                    opcao = ler.nextInt();
                    ler.nextLine();
        
                    //#endregion
                    switch (opcao) {
                        case 1:
                            int codigo;
                            do {
                                System.out.println("\n Digite 1 para cadastrar um novo contato ou 2 para retornar");
                                opcao = ler.nextInt();
                                ler.nextLine();
        
                                if (opcao == 1) {
                                    System.out.println("Insira o Nome do contato:");
                                    String nome = ler.nextLine();
                                    System.out.println("Insira o Numero de telefone do contato");
                                    String numero = ler.nextLine();
                                    System.out.println("Insira o Código do contato");
                                    codigo = ler.nextInt();
        
                                    contatos.add(new Contato (nome, codigo, numero));
                                    System.out.println("Seu contato foi salvo! Yupee!");
        
                                }
                                
                            } while (opcao == 2);
                            break;
                        case 2:
                                contatos.sort(null);
                                System.out.println("\n========== Contatos ========== ");
                            for (Contato contato : contatos) {
                                System.out.println(">" + contato);     
                            }
                        break;
                        case 3: 
                            contatos.sort(null);
                            System.out.println("\n======== Contatos ======== ");
                            for (Contato contato: contatos) {
                                System.out.println(">" + contato);     
                        }
                        break;
                        case 4:
                        System.out.println("Digite o código do contato que deseja procurar: ");
                        codigo = ler.nextInt();
                        founded = false;
                        ler.nextLine();
                        for(Contato contato : contatos) {
                            if (contato.getCodigo() == codigo) {
                            System.out.printf("\nCódigo: %d", ((Contato) contatos).getCodigo()); 
                            System.out.printf("\nNome: %s", ((Contato) contatos).getNome()); 
                            System.out.printf("\nNúmero: %s", ((Contato) contatos).getNumero());
                            founded = true;
                            break;
                            }
                            if (founded == false);
                            System.out.println("O código que voce digitou não consta no cadastro. Tente novamente!! :)");
                        }
                        break;
                        case 5:
                        System.out.println("Digite o nome do contato que deseja procurar: ");
                        String nome = ler.nextLine();
                        founded = false;
                        for(int i=0; i<totalcontatos; i++) {
                            if (((Contato) contatos).getNome().equals(nome)) {
                            System.out.printf("\nCódigo: %d", ((Contato) contatos).getCodigo()); 
                            System.out.printf("\nNome: %s", ((Contato) contatos).getNome()); 
                            System.out.printf("\nNúmero: %s", ((Contato) contatos).getNumero());
                            founded = true;
                            break;
                            }
                            if (founded == false);
                            System.out.println("O nome que voce digitou não consta no cadastro, sorry. :(");
                        }
                        break;
                        case 6: 
                            System.out.println("\nOkay! Digite o contato que deseja remover: ");
                            String contRemover = ler.nextLine();
                            contatos.removeIf(p -> p.getNome().equalsIgnoreCase(contRemover));
                            break;
                        case 0:
                        System.out.println("Okay, encerrando... Até mais verrr!!");
                        break;
                        default:
                        System.out.println("Essa opção não está válido Sr(a)");
                        break;
                    }
                } while (opcao != 0);
        
                ler.close();
                
            }
        }
