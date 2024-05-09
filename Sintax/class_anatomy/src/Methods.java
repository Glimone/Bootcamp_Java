public class Methods {
        
<<<<<<< HEAD
     
     public static void main ( String [] args) {
          String first = "Gabriel";; 
          String last = "Limone Nunes";

           
          String completeName = name (first, last); 
         
          System.out.println(completeName); 
     
}    
       

     public static String name (String firstName, String lastName) {

          return firstName + " " + lastName;
=======
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
>>>>>>> new-feature

} 


}

