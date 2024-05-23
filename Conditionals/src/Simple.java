import java.util.Locale;
import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Quanto você quer sacar?");
        double solicitado = scanner.nextDouble();

        if(solicitado < saldo) { //If = "Se"
            saldo = saldo - solicitado;
            System.out.println("Seu saldo após o saque é " + saldo);
        
        }

        

    }
    
}
