public class Main {
    public static void main(String[] args){
        String text = "  ABCDE fghij KLMNO pqrst UVWXY z ÁêÌõÚ   ";
        System.out.println("Original:  -" + text + "-");
        System.out.println("toLowerCase:  -" + text.toLowerCase() + "-");
        System.out.println("toUpperCase:  -" + text.toUpperCase() + "-");
        System.out.println("trim:  -" + text.trim() + "-");     //Tira os espaços antes e depois
        System.out.println("substring:  -" + text.trim().substring(0, 5) + "-");        //Corta a String
        System.out.println("replace:  -" + text.replace("ABC", "_") + "-");        //Troca os caracteres
        System.out.println("indexOf:  -" + text.indexOf(" ") + "-");        //Retorna o índice do primeiro caractere encontrado na primeira sequência passada como parâmetro
        System.out.println("LastIndexOf:  -" + text.lastIndexOf(" ") + "-");        //Retorna o índice do último caractere encontrado na primeira sequência passada como parâmetro
        String[] array = text.split(" ");
        int arraySize = array.length;   //Em array se usa a propriedade length, em String o métod length()

        for (int i = 0; i < arraySize; i++){
            System.out.println("-" + array[i] + "-");
        }
    }
}
