import java.util.Locale;
import java.util.Scanner;

public class Compost {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        double saldo = 1000.00;
        System.out.println("Olá, o limite do seu empréstimo no momento é de " + saldo);

        System.out.println("Digite quanto quer sacar: ");
        double saque = scanner.nextDouble();

        if(saque <= saldo) {
            saldo = saldo - saque;
            System.out.println("Você acaba de solicitar o saque de " + saque + " e seu limite disponível agora é de " + saldo + " compareça na sua agência contendo RG, número da conta e o valor do saque!");
        }
        else if(saque > saldo) {  //Estrutura encadeada
            System.out.println("O valor de saque é maior do que seu limite, volte e digite novamente. ");


        }
        else {}
    scanner.close();
        

    }

}
