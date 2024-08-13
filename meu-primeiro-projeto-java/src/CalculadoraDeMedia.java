
import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.printf("A média do aluno é: %.2f\n", media);

            if (media >= 7) {
                System.out.println("Aprovado!");
            } else if (media >= 5) {
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado!");
            }
        }

        scanner.close();
    }
}
