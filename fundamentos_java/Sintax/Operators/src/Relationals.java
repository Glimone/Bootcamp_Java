public class Relationals {
    
    public static void main (String [] args) {  
        /* > - Bigger then
        >= - Bigger or equal then
        < - Less then 
        <= - Less or equal then
        == - Equal
        != Different
        */

        //Exemple 1:

        int int1 = 1;
        int int2 = 2;

        boolean simNao = int1 == int2;

        System.out.println("The first number is equal the second number = " + simNao); //If you use the "!=", the result is true

        //Exemple2:

        float n1 = 34*3;
        float n2 = 18*4;

        System.out.println(n1 < n2); //With the ">", the result is true.

        //In cases which we have objects or Strings, don't used the "==", but yes the method ".equals".
        
        //Exemple 3

        String name1 = "Gabriel Limone";
        String name2 =  new String("Gabriel Limone");
        System.out.println(name1.equals(name2)); //If you use just: name1 == name2, the result is false, because name2 its a object.

        



        

    }


}
