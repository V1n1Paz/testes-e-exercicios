public class Usuario implements Autenticavel {
    protected String nome;
    private String senha;

    Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String nome, String senha) {
        return (nome.equals(this.nome) && senha.equals(this.senha));
    }
}
