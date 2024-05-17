public class Calculator {
    /**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gabriel Limone (tag author define  o autor.)
* @version 1.0 
* @since   16/05/2024 (Since, define data.)
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método, a tag param é usada pra isso.
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}

/**
 * As principais tags são:
 * author, params, since, version, throws e return.
 * 
 * 
 */ 

 public void teste() {


 }

}  //OBS: Com o JavaDoc, é criado um API com a documentação do seu código (Muito legal) Isso é feito com o comando: javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
