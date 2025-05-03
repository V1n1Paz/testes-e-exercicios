public class Administrador extends Usuario{

    Administrador(String nome, String senha){
        super(nome, senha);
    }

    public void alterarConfiguracoes(String nome, String senha){
        if (this.autenticar(nome, senha)){
            System.out.println("Permissão de administrador concedida ao ADM  " + this.nome );
        }
    }
}
