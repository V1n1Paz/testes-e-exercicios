public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public abstract void exibirInfo();
}

class Carro extends Veiculo{

    private int numeroDePortas;

    Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca,  modelo,  ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Marca:  " + this.marca);
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Ano:  " + this.ano);
        System.out.println("Número de portas:  " + this.numeroDePortas);
    }

}

class Moto extends Veiculo{
    private int cilindradas;

    Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Marca:  " + this.marca);
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Ano:  " + this.ano);
        System.out.println("Número de cilindradas:  " + this.cilindradas);
    }

}