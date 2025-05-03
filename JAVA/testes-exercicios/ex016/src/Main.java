import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();       //Generics?

        for ( int i = 0; i < 10; i++){
            myList.add(i);
        }

        myList.add(7, 1000);

        for ( int item : myList ){
            System.out.println(item);
        }

        System.out.println(myList.indexOf(9));
        System.out.println("----------------");
        System.out.println(myList.removeIf( x -> x%2 == 0));

        System.out.println();
    }
}
