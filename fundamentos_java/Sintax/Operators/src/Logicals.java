public class Logicals {


    public static void main (String [] args) {
    //The logical operators are: AND or OR. The AND need everyone to be true to return true. The OR need only 1 conditions to return true.

    //Symbols: AND = || OR = &&

    //Exemple:

    int n1 = 14;
    int n2 = 43;
    int na1 = 3;
    int na2 = 2;

    double cond1 = Math.pow(n1, na2);
    double cond2 = Math.pow(n2, na1);

    if (cond1 > 45 && cond2 > 45 ) {
        System.out.println("The result is: " + cond1 + " and " + cond2);
        if (cond1 + cond2 != 8473) {
            double some = cond1 + cond2;
            System.out.println("And the some of that is:" +  some);
        }  
        else {
            System.out.println("CARACA, ESSE É O NÚMERO MAIS IMPROVÁVEL DE DAR NESSA SITUAÇÃO!");
        }

    }
    else {
        System.out.println("Unavaible");
    }



}
    
}
