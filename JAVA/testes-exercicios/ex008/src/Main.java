import java.util.Timer;
import java.util.TimerTask;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        ContaPoupanca minhaContaPoupanca = new ContaPoupanca("Vinicius");
        minhaContaPoupanca.depositar(100);

        TimerTask incremento = new TimerTask() {
            int n = 0;
            @Override
            public void run() {
                System.out.println( this.n +" meses se passaram");
                minhaContaPoupanca.exibirSaldo();
                System.out.println("Rendeu R$" +   String.format( "%.2f", minhaContaPoupanca.getSaldo() - 50*this.n - 100) + "\n");
                minhaContaPoupanca.aplicarjuros();
                minhaContaPoupanca.depositar(50);
                this.n++;
            }
        };

        timer.scheduleAtFixedRate(incremento, 0, 1500);
    }
}