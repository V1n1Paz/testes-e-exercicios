import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insira o nome da pasta a ser criada:  ");
        String newDirName = reader.next();
        System.out.println("Insira o nome do arquivo a ser criado:  ");
        String newFileName = reader.next();
        System.out.println("D:\\diretorioTeste\\" + newDirName);
        File newDir = new File("D:\\diretorioTeste\\" + newDirName);
        System.out.println(newDir.mkdirs());
        File newFile = new File( newDir.getPath() + "\\" + newFileName);
        System.out.println(newFile.createNewFile());
        FileWriter fw = new FileWriter(newFile);
        fw.write("Arquivo criado com sucesso.");
        fw.close();
        reader.close();
    }
}