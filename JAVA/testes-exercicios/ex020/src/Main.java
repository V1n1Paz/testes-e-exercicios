import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main (String[] args ) throws FileNotFoundException, IOException {
        String path = "D:\\diretorioTeste\\ioArch.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while( line != null ){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (Exception e){
            System.out.println("ERRO: " + e);
        }
    }
}