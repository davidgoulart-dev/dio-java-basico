import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.print("Número da agência: ");
        String agencia = sc.nextLine();

        System.out.print("Seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%n" +
                "Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}