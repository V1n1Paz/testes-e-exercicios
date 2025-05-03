
import java.util.Scanner;
//Exercitando arrays
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        boolean inArray = false;

        byte arraySize = 10;
        long numberArray[] = new long[arraySize];       //new + tipo[tamanho]

        for (int i = 0; i < arraySize; i++){
            System.out.println("Insira o " + (1+i) + "º número do array.");
            numberArray[i] = reader.nextLong();
        }

        System.out.println("\nInsira um número para verificar se existe no array.");

        long n = reader.nextLong();

        reader.close();

        for (int i = 0; i < arraySize; i++){
            if (numberArray[i] == n){
                System.out.println("\nO número indicado está no array no índice " + i);
                inArray = true;
            }
        }
        if (!inArray) {
            System.out.println("\nO número indicado não está no array.");
        }
    }
}