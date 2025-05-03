import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int matrixOrder = 5;
        int[][] myMatrix = new int[matrixOrder][matrixOrder];
        int[] diagonal = new int[matrixOrder];
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        int negativeNumbersNumbersQuantity = 0;

        for (int i = 0; i < matrixOrder; i++){
            for (int j = 0; j < matrixOrder; j++){
                int number = 5 + 2*i - j*j;
                myMatrix[i][j] = number;
                System.out.print(number + "  ");
                if (i == j){
                    diagonal[i] = number;
                }
                if (number < 0){
                    negativeNumbers.add(number);
                    negativeNumbersNumbersQuantity++;
                }
            }
            System.out.println();
        }
        System.out.print("Diagonal:  {");
        for (int i = 0; i < matrixOrder; i++){
            System.out.print(" " + diagonal[i]);
        }
        System.out.println("}");
        System.out.println("Negative numbers: " +  negativeNumbers.toString().replace("[", "{").replace("]", "}") );
        System.out.println("Negative numbers quantity: " + negativeNumbersNumbersQuantity);

    }
}

