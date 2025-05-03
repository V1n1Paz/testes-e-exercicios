import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        byte arraySize = 5;
        Forma formas[] = new Forma[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.println("Insira a " + (i + 1) + "ª forma");
            System.out.println("Cir [1]");
            System.out.println("Ret [2]");

            switch (reader.nextByte()){
                case 1:
                    System.out.println("Insira o raio do circulo");
                    double raio = reader.nextDouble();
                    formas[i] = new Circulo(raio);
                    break;
                case 2:
                    System.out.println("Insira a largura(x) e a altura(y) do retângulo.");
                    double largura = reader.nextDouble();
                    double altura = reader.nextDouble();
                    formas[i] = new Retangulo(largura, altura);
                    break;
                default:
                    System.out.println("Entrada inválida. Tente novamente");
            }
            reader.nextLine();
        }
        System.out.println("Lista de formas:");
        for (int i = 0; i < arraySize; i++){
            System.out.println("\nForma " + (1+i));
            formas[i].imprimirForma();
        }

    }
}