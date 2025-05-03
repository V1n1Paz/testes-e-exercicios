import java.util.Scanner;       //Importa a classe Scanner
import java.util.Arrays;        //Importa a classe Arrays

/*
Primeiro programa em JAVA. Feito para exercicitar o básico da sintaxe, operadores, tipos primitivos e arrays.
 */

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);        //Define reader como novo objeto da classe Scanner(leitor de entrada).
        // O parâmetro System.in indica a entrada padrão do sistema.

        byte arraySize = 2;                     //Define o tamanho do array. Tipo byte para economizar memória.
        long nums[] = new long[arraySize];      //Define o array. Cria um novo objeto da classe Array, do tipo long para alcance maior.
        long soma = 0L;                         //Inicializa a variável que irá guardar os valores da soma dos números.
                //O L indica o tipo long do número. O tipo padrão é int
        for (int i = 0; i < arraySize; i++){
            System.out.println("Insira o " + (i + 1) + "º número. ");
            nums[i] = reader.nextLong();        //reader >> objeto;     nextLong >> método que inicializa a leitura de um long no teclado.
            soma += nums[i];                    //Soma o número lido.
        }

        reader.close();     //Aparentemente é necessário fechar o scanner para liberar memória e por ser boa prática.

        Arrays.sort(nums);      //Arrays >> classe;    sort >> método que ordena os valores do array.
        double media = (double) soma / arraySize;       //(double) >> realiza a conversão de um tipo numérico(long) para double.

        System.out.println("Aqui estão os números em ordem crescente:  " + Arrays.toString(nums));      //Arrays >> classe; toString >> método que converte o array para uma string.
        System.out.println("Esse é o maior número da sequência:  " + nums[arraySize - 1]);
        System.out.println("Esse é o menor número da sequência:  " + nums[0]);
        System.out.println("Esse é o valor médio da sequência:  " + String.format("%.2f", media));      //String >> classe incluída em java.lang que contem os métodos e operações com string;    .format >> formata números.
    }
}