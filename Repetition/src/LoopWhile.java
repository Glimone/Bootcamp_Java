import java.util.concurrent.ThreadLocalRandom;

public class LoopWhile {
    public static void main(String[] args) {
        /*While equivale a "Enquanto".

        Sua estrutura é aquivalente a:
        while (expressão de validação); {

            Comando executado até a definição.
        
        */
        double mesada = 50.0;
        while(mesada > 0) {
            double valorDoce = valorAleatorio(); 
            if(valorDoce > mesada) {
                valorDoce = mesada;
            
            }
            System.out.println("Valor do doce: " + valorDoce + " adicionado ao carrinho!");
            mesada -= valorDoce;
        }

            System.out.println("Mesada: " + mesada);
           System.out.println("Joãozinho gastou toda a sua mesada em doces");


    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
    


