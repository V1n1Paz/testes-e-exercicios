import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println(Locale.getDefault());
        Locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault());

        int myInt = 25;
        int myNewInt = 26;

        System.out.println((float)myInt/myNewInt);

        float myFloat = 30f;
        double a = 0.1, b = 0.2, c = 0.3;

        System.out.printf("Aqui está o número formatado com 3 casas decimais  %.3f %n", myFloat/myInt);

        System.out.println(a + b == c);

        c = a + b;

        System.out.printf("%.17f %n%.17f %n%.17f %n%n", a, b, c);


        String myName = "Vini";
        int myAge = 17;

        System.out.printf("Olá! Meu nome é %s e eu tenho %d anos.%n", myName, myAge);

        System.out.println("Vini".charAt(0));


        double x = 5;

        System.out.println(Math.pow(x, 2));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(x));

    }
}
