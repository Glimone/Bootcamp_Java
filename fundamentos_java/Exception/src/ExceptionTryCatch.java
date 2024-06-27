import java.util.Locale;
import java.util.Scanner;

/*Exceção se trata de um fluxo inesperado da aplicação, porém com estruturas de prevenção, você redireciona para o caminho. Um exemplo é quando é necessário informar o CPF mas não é informado. Isso é uma exceção.  
 * 
 * A estrutura de uma exceção é a seguinte:
 * 
 * try { 
 *        (Código pra dar certo)  }
 * catch (exception) {
 *  (Captura das exceções ocorridas.)}
*/


public class ExceptionTryCatch {
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
        } 
        catch(Exception e) { 
            System.err.println("Em Idade e altura é necessário informar apenas números.");
        }
    }
    
}