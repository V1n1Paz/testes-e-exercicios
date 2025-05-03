public class Funcionario {
    String nome;
    double salarioBase;

    public double calcularSalario(){
        return (this.salarioBase);
    }

    public void exibirSalario(){
        System.out.println("O nome do(a) funcionário(a) é " + this.nome + " e seu salário é " + this.calcularSalario());
    }
}

class Gerente extends Funcionario{
    @Override
    public double calcularSalario() {
        return (super.salarioBase * 1.2);
    }
}

class Estagiario extends Funcionario{
    @Override
    public double calcularSalario() {
        return (super.salarioBase * 0.8);
    }
}
