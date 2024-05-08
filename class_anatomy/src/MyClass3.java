public class MyClass3 {
        
     //Isso é um método, o método principal   
     public static void main ( String [] args) {
          String first = "Gabriel";; //Definição de variáveis que funcionarão como parâmetros
          String last = "Limone Nunes";

           //var que define ser igual ao método name
          String completeName = name (first, last); //Método name com os parâmetros definidos.
         
          System.out.println(completeName); //Impressão da variável que contém o método e parâmetros. 

     
}    
       
//Isso é outro método, agora nossa class tem 2 métodos.
     public static String name (String firstName, String lastName) {

          return firstName + " " + lastName; //Comando de retorno para o método main

} 


}

