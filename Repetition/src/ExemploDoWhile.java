// ExemploDoWhile.java

import java.util.Random;
public class ExemploDoWhile {

	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender (Método faça)
			System.out.println("Telefone tocando");
		
		}while(tocando()); //Método enquanto, basicamente é um "Faça enquanto".
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() { //Método boolean de retorno true ou false em random.
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}