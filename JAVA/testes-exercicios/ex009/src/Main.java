import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("WW", "Voyage", 2006, 4));
        veiculos.add(new Moto("Honda", "Sakura", 2010, 999));
        veiculos.add(new Carro("Fiat", "Uno", 2004, 2));
        veiculos.add(new Moto("Yamaha", "Sla", 2020, 1500));
        veiculos.add(new Carro("McLaren", "P1", 2013, 2));

        for (int i = 0; i < 5; i++){
            veiculos.get(i).exibirInfo();
            System.out.println("\n");
        }
    }
}