import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File myFile = new File("D:\\Vini\\Tech\\JAVA\\testes-exercicios\\testeChatGPT\\out\\artifacts\\testeChatGPT_jar\\testeChatGPT.jar");
        System.out.println(myFile);

        System.out.println(myFile.canExecute());
        if (myFile.canExecute()){
            Desktop.getDesktop().open(myFile);
        }
    }
}