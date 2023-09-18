import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
       

        // Definindo os valores das constantes
        int numero = 1012;
        int agencia = 1893;
        String nomeCliente = "Aislan Madison";
        double saldo = 12025.34;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o número da Agência");
        int agencia2 = scanner.nextInt();
    
        if (numero==numero2 && agencia==agencia2){
    
        //Mensagem a ser exibida
        System.out.println("Olá " +nomeCliente);
        System.out.println("Conta: "+ numero);
        System.out.println("Agência: "+ agencia);
        System.out.println("Saldo: R$ " + saldo);
    }

        else{
        System.out.println("Desculpe, alguma informação está incorreta. Tente novamente");
        }
    }
}