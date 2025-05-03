import java.util.Scanner;
import java.util.ArrayList;


    //Programa escrito para exercitar conceitos JAVA básicos de entrada, loops e de ArrayLists.



public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);        //Definindo um novo scanner

        ArrayList<String> nomes = new ArrayList<>();    //Que notação estranha

        byte input = 0;     //Variavel que vai guardar as entradas para comandos

        String nome;        //Variavel que vai guardar as entradas de nomes

        System.out.println("=========== LISTA DE NOMES ===========");

        while (input != 5){
            System.out.println("Qual a ação desejada?");
            System.out.println("Adiconar nome [1]");
            System.out.println("Remover nome [2]");
            System.out.println("Exibir lista completa [3]");
            System.out.println("Pesquisar nome na lista [4]");
            System.out.println("Sair [5]");
            System.out.print("\nResposta:  ");

            input = reader.nextByte();
            switch (input){
                case 1:
                    System.out.println("\nInsira o nome a ser adicionado.");
                    nome = reader.next();
                    /*
                    reader.next() só lê a primeira palavra, ignora espaços e enters, além de deixar um \n no buffer
                    Isso pode causar conflitos em códigos que alternem .mext() com .nextLine(), pois o segundo
                    lê o \n e acaba "pulando" a leitura
                     */
                    if (nomes.contains(nome)){
                        System.out.println("O nome já foi adicionado à lista anteriormente.");
                    } else{
                        nomes.add(nome);
                        System.out.println("Nome adicionado à lista.");
                    }
                    break;
                case 2:
                    System.out.println("\nInsira o nome a ser removido.");
                    nome = reader.next();
                    for (int i = 0; i < nomes.size(); i++){
                        if (nomes.get(i).equals(nome)){
                            nomes.remove(i);
                            System.out.println("Nome removido com sucesso.");
                            break;
                        } else if (i == nomes.size() - 1) {
                            System.out.println("Esse nome NÃO está na lista.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nLista de completa:");
                    if (nomes.size() != 0){
                        for (int i = 0; i < nomes.size(); i++){
                            System.out.println("> " + nomes.get(i));
                        }
                        System.out.println("Há um total de " +  nomes.size() + " nomes na lista.");
                    } else{
                        System.out.println("\nA lista está vazia");
                    }
                    break;
                case 4:
                    System.out.println("\nInsira o nome a ser verificado.");
                    nome = reader.next();
                    if (nome.contains(nome)){
                        for (int i = 0; i < nomes.size(); i++){
                            if (nomes.get(i).equals(nome)){
                                System.out.println("O nome inserido está na lista no índice " + i);
                                break;
                            }
                        }
                    }else if (nomes.size() == 0){
                        System.out.println("\nA lista está vazia.");
                    }
                    else{
                        System.out.println("\nEsse nome não está na lista.");
                    }
                    break;
                case 5:
                    System.out.println("\nVocê tem certeza?");
                    System.out.println("\nSIM [1]");
                    System.out.println("NÂO [2]");
                    input = reader.nextByte();
                    switch (input){
                        case 1:
                            input = 5;
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("\nResposta inválida");
                            input = 0;
                            break;
                    }
                    break;
                default:
                    System.out.println("\nResposta inválida! Saída cancelada.");
            }
            System.out.println("\nDigite ENTER para prosseguir.");

            reader.nextLine();
            reader.nextLine();
            /*
            reader.nextLine() foi usado pela primeira vez para limpar o \n deixado no buffer pelo .mext() usado anteriormente.
            Apenas a segunda vez foi utilizada para realizar a leitura de fato.
            .next() não pode ser utilizado nesse caso, pois não lê \n puros.
            */
        }
        reader.close();
        System.out.println("FECHANDO!");
        System.out.println("Obrigado por ter me executado, humano! =)");
    }
}