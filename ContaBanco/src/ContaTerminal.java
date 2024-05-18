import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta, que possui 4 dígitos: ");
        int Numero = scanner.nextInt();

        System.out.println("Por gentileza, agora digite o número da sua Agência, que também possui 4 dígitos: ");
        String Agencia = scanner.next();

        System.out.println("Por favor, nos informe o seu nome: ");
        String Nome_Cliente = scanner.next();

        System.out.println("Agora, digite o seu saldo depositado: ");
        Double Saldo = scanner.nextDouble();

        System.out.println("Olá " +Nome_Cliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");



    
        
    }


}
