public class Circulo implements Forma {
    private double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    @Override
    public double calcularArea(){
        return (this.raio*this.raio*3.1415);
    }

    @Override
    public void imprimirForma(){
        System.out.println("Forma:  Círculo");
        System.out.println("Raio:  " + this.raio + "uc");
        System.out.println("Área:  " + String.format("%.4f",  this.calcularArea()) + "ua");
    }

}
