import java.sql.Array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte arraySize = 2;
        byte entrada = 0;
        Funcionario funcionarios[] = new Funcionario[arraySize];        //tipo nome[] = new tipo[tamanho];

        System.out.print("Insira o salario base da empresa:  ");
        double salarioBase = scanner.nextDouble();

        for (int i = 0; i < arraySize; i++){
            System.out.print("\nInsira o tipo do " + (i + 1) + "º funcionario.\nGerente [1]\nEstagiario [2]\n\nResposta:");
            entrada = scanner.nextByte();
            scanner.nextLine();

            switch (entrada){
                case 1:
                    funcionarios[i] = new Gerente();
                    break;
                case 2:
                    funcionarios[i] = new Estagiario();
                    break;
            }
            System.out.print("Insira o nome do " + (i + 1) + "º funcionario: ");
            funcionarios[i].nome = scanner.nextLine();
            funcionarios[i].salarioBase = salarioBase;
        }

        System.out.println("\nFinalizado!");
        for (int i = 0;i < arraySize; i++){
            funcionarios[i].exibirSalario();
        }
    }
}