//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Vini", "2550");
        admin.alterarConfiguracoes("Vini", "2550");

        Usuario user = new Usuario("Lebron James", "2323");

        if (user.autenticar("Lebron James", "2323")){
            System.out.println("Este usuário é o Papai Lebrão");
        } else {
            System.out.println("Este usuário não é o Papai Lebrão");
        }

    }
}