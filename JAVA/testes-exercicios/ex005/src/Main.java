import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//Mais um exercício de ArrayLists e Scanner.

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<String> numsList = new ArrayList<>();  //ArrayList<tipo-classe> nome = new ArraysList<>();   Tudo vazio depois do =
        //Nesse caso é melhor salvar os números como strings, pois não será realizado operações com eles.
        //Além disso, posso usar os números como parâmetros de métodos que poderiam interpretar os valores como índices

        boolean loop = true;

        while(loop){
            System.out.println("Adicionar número. [1]");
            System.out.println("Remover número. [2]");
            System.out.println("Ver lista. [3]");
            System.out.println("Sair [4]");

            switch (reader.nextByte()){     //Posso usar entradas diretamente numa condição ou como parâmetros!!
                case 1:
                    System.out.println("Insira o número a ser adicionado.");
                    reader.nextLine();
                    numsList.add(reader.nextLine());
                    System.out.println("Número adicionado");
                    break;
                case 2:
                    System.out.println("Insira o número a ser removido.");
                    reader.nextLine();
                    numsList.remove(reader.nextLine());
                    System.out.println("Número removido");
                    break;
                case 3:
                    System.out.println("A lista ordenada é:");
                    Collections.sort(numsList);
                    System.out.println(numsList);
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Entrada inválida. Tente novamente");
                    break;
            }
        }
        reader.close();
        System.out.println("Programa finalizado.");
    }
}