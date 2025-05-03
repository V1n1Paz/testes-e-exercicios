import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        String path = "D:\\diretorioTeste\\arquivoCriado.txt";
        String[] lines = new String[]{
            "A",
            "Beat do Nekklace",
            "Bling no Nekklace",
            "Número sobe",
            "Mantém o pique"
        };

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.newLine();
                bw.write(line);
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }

    }
}