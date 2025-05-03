public class Retangulo implements Forma{
    private double largura;
    private double altura;

    Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void setRetangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura(){
        return this.largura;
    }

    public  double getAltura(){
        return this.altura;
    }

    @Override
    public double calcularArea(){
        return (this.altura * this.largura);
    }

    @Override
    public void imprimirForma(){
        System.out.println("Forma:  Retângulo");
        System.out.println("Largura:  " + this.largura + "uc");
        System.out.println("Altura:  " + this.altura + "uc");
        System.out.println("Área:  " + String.format("%.4f",  this.calcularArea()) + "ua");
    }
}
