public class Main {
    public static void main(String[] args){
        Teste myObj = new Teste(10);
        String valor;
        System.out.println(myObj.valor1);
        System.out.println(myObj.valor2);
        System.out.println(myObj.valor3);
        System.out.println(0xf);
        System.out.println(Teste.toString());
    }
}

class Teste{
    public int valor1;
    public float valor2;
    public String valor3;

    Teste(int value){
        ;
    }
}
