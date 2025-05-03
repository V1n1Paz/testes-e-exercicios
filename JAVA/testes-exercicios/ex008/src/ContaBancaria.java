public class ContaBancaria {

    protected String titular;
    protected double saldo = 0;

    ContaBancaria(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if ( this.saldo >= valor){
            this.saldo -=valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo(){
        return saldo;
    }
    public void exibirSaldo(){
        System.out.println("O saldo da conta de " + this.titular + " é de  R$" + String.format("%.2f", this.saldo) );
    }
}

class ContaPoupanca extends ContaBancaria {

    private double taxaDeJuros = 1.0005;

    ContaPoupanca(String titular){
        super(titular);
    }

    public void aplicarjuros(){
        this.saldo*=taxaDeJuros;
    }
}

