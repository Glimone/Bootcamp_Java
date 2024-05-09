public class VariableTypes {
    
    public static void main(String[] args) {
        /*How pattern, we follow this variable structure:
          
        typeVar nameVar = value;
        */

        //Variable Types: 


        String texto = "That's a String"; //Type String
        System.out.println(texto);
        
        int number = 2600; //Type integral
        System.out.println(number);
         
        double decimal = 32.455; //Type big decimals
        System.out.println(decimal);

        float smallDecimal = 3.14F; //Type small decimals, necessary the "F" ever.
        System.out.println(smallDecimal);
        
        long hugenumber = 3423434354353L; //Type long number, necessary the "L" ever.
        System.out.println(hugenumber);

        final String FINISH = " Essa string foi definida para nunca ser mudado, com 'final'."; //In main, we write the var final with capsLock on.
        System.out.println(FINISH);



    }



}
