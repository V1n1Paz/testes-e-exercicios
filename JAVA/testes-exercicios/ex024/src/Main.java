import java.io.File;

public class Main {
    public static void main(String[] args) {
        File path = new File("D:\\diretorioTeste");
        File[] files = path.listFiles();
        if (files != null){
            for (File file : files){
                System.out.println(file.isFile() ? ("File: " + file.getName()) : ("Dir: " + file.getName()) );
            }
        }else {
            System.out.println("ERRO: Diretório inválido");
        }

    }
}