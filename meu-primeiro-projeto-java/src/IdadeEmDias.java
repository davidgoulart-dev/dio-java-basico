import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(dataNascimento, hoje);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();


       
        int idadeEmDias = dias;
        idadeEmDias += anos * 365.25; 
        idadeEmDias += meses * 30.42; 

        System.out.println("A sua idade em dias é aproximadamente: " + (int) idadeEmDias);

        scanner.close();
    }
}