import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner (System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();


            System.out.println("Olá " + nome +" " + sobrenome);
            System.out.println("Sua idade é: " + idade);
            System.out.println("Sua altura é: " + altura);
        }
       
        System.out.println("Obrigado por efetuar este teste");
    }
}
