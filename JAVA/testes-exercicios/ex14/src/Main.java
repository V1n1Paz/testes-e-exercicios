import entities.Triangle;

public class Main {
    public static void main(String[] args){
        f();
    }
    private static void f(){
        Triangle abc = new Triangle(5, Math.sqrt(2)*5 ,5);
        abc.print();
    }
}
