//Abaixo temos o mesmo código, entretanto um com identação, enquanto o outro sem. Ambos irão funcionar, entretanto algumas outras linguagens não aceitariam, como Python.

public class Identation {
    //Código sem identação:

    /*
    public static void main (String [] args) {
        int mediaFinal = 8;
        if(mediaFinal < 6 )
        System.out.println("REPROVADO");
        else if (mediaFinal == 6)
        System.out.println("RECUPERAÇÃO");
        else if (mediaFinal > 6)
        System.out.println("APROVADO!");
        else 
        System.out.println("Essa nota não está de acordo, digite novamente!");
    */

    
        //Código com identação:
    public static void main (String []args) {
        
        int mediaFinal = 8;
        
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("RECUPERAÇÃO");
        else if (mediaFinal > 6)
            System.out.println("APROVADO!");
        else 
            System.out.println("Número incorreto, digite novamente! ");

    }

}
