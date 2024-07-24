import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TratamentoDeExcecoes {
public static void main(String[] args) {
    try{
    //Criando Objeto Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    Double altura = scanner.nextDouble();

    // imprimindo os dados obtidos pelo usuário.

    System.out.println("Olá me chamo"  + " " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
    System.out.println("Tenho " + idade + "anos");
    System.out.println("Minha altura é " + altura + "cm");
    scanner.close();
}
catch (InputMismatchException e){
    System.out.println("Os campos idade e altura precisam ser numéricos");
}
}
}



