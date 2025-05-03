import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        File arch = new File("D:\\diretorioTeste\\ioArch.txt");
        try (Scanner sc = new Scanner(arch)){
            String nextLine;
            while (sc.hasNextLine()){
                nextLine = sc.nextLine();
                System.out.println(nextLine);
            }
        }catch (Exception e){
            System.out.println("ERRO:  " + e.toString());
        }
    }
}