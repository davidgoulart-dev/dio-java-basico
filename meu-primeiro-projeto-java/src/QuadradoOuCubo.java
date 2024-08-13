import java.util.Scanner;

public class QuadradoOuCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero  % 2 == 0) 
 {
            // Se o número é par, calcula o quadrado
            int quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        } else {
            // Se o número é ímpar, calcula o cubo
            int cubo = numero * numero * numero;
            System.out.println("O cubo de " + numero + " é: " + cubo);
        }

        scanner.close();
    }
}