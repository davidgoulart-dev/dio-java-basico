import java.util.Scanner;

public class VerificadorPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite  uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase(); 

        // Remove todos os caracteres não alfabéticos
        palavra = palavra.replaceAll("[^a-zA-Z]", "");

        // Verifica se a palavra é igual à sua versão invertida
        boolean ehPalindromo = new StringBuilder(palavra).reverse().toString().equals(palavra);

        if (ehPalindromo) {
            System.out.println(palavra + " é um palíndromo");
        } else {
            System.out.println(palavra + " não é um palíndromo");

        }
        scanner.close();
    }
}