import java.util.Scanner;
//Programa criado para exercicio básico de casting e formatação de floats.

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Insira um número inteiro.");
        int nInt = reader.nextInt();

        System.out.println("\nInsira um número decimal.");
        float nFloat1 = reader.nextFloat();

        System.out.println("\nFinalmente insira um último número decimal.");
        float nFloat2 = reader.nextFloat();

        reader.close();

        System.out.println("\nA soma dos dois números decimais é " + String.format("%.3f", nFloat1 + nFloat2));

        float produto = (nFloat1 + nFloat2)*nInt;
        System.out.println("O produto entre essa soma e o número inteiro é: " + String.format("%.3f", produto));

        int produtoInteiro = (int)produto;
        System.out.println("A parte inteira desse produto é: " + produtoInteiro);
    }
}