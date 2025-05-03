public class Main {
    public static void main(String[] args){
        int valor = (15 > 20) ? 10 : 20;
        System.out.println(valor);

        int chikaCounter = 2;
        String myNameIs = (chikaCounter == 2) ? "Slim Shady" : "M&M";
        System.out.println(myNameIs);

        valor/= (20 > 10) ? 10 : 1;
        System.out.println(valor);
    }
}
