import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File path = new File("D:\\diretorioTeste\\dados.txt");
        int countWords = 0;
        try (Scanner reader = new Scanner(path)){
            while (reader.hasNext()){
                countWords++;
                System.out.println(countWords + "ª palavra:  " + reader.next());
            }
        }catch (Exception e){
            System.out.println("ERRO: " + e);
        }
    }
}