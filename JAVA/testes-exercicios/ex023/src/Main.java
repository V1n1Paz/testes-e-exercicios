import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args){
        File path = new File("D:\\diretorioTeste\\dadoss.txt");
        try (Scanner reader = new Scanner(path)){
            while ( reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        } catch (Exception e){
            System.out.println("ERRO:  " + e);
        }

    }
}