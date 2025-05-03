import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dirPath = new File("D:\\Downloads");

        File[] directorys = dirPath.listFiles(File::isDirectory);

        System.out.println("Lista de Diretórios:\n");

        for (File directory :  directorys){
            System.out.println(directory.getName());
        }

        File[] files = dirPath.listFiles(File::isFile);

        System.out.println("\n\nLista de arquivos:\n");
        for (File file : files){
            System.out.println(file.getName());
        }

        System.out.println("Sucesso da pasta criada:  " + new File(dirPath + "\\pastaTeste").mkdir() );
    }
}