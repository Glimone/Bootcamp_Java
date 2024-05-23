
public class LoopFor {
    public static void main(String[] args) {
       /*For em tradução significa "Para". Essa estrutura de repetição recebe:
       1 - Variável contadora
       2 - A condição
       3 - Incrementação

       Sua estrutura é:

       for (bloco de inicialização; expressão boleana de validação; bloco de atualização e incrementação;)
       {
        (CORPO de execução até a validação finalizar.)
       }


       */ 


            
       for( int carneirinhos = 1; carneirinhos <=20; carneirinhos += 1 ) {

        System.out.println("Contando Carneirinhos " + carneirinhos);
       }

       /*Em "int carneirinhos" definimos que o valor do carneirinho dentro do loop inicia com 1" (Valor inicial)
       
       Em "carneirinhos <= 20" definimos que o loop for deve ser feito enquanto for menor ou igual a 20 (Limite, condição)

       Em "Carneirinhos +=" definimos de quantas em quantas vezes esse loop será feito (Pulo, inclemento)

       Logo, com essa estrutura montada, definimos que o comando a ser executado (O que está dentro das chaves)seria a impressão dos carneirinhos, que inicia com 1, conta de 1 em 1 e tem o limite de 20.
       
       */
       
    }
}
