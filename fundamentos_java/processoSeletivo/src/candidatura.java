import java.util.Scanner;

public class candidatura {
    
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Qual é o seu salário requerido?");
        // analisarCandidato(scanner.nextInt()); 
        
        SelecaoCandidatos();
        selecionados();

        // scanner.close();
    }

    static void selecionados() {
        String [] candidatos = {"Felipe","Maria", "Gabriel", "Marcia", "Julio"};
        System.out.println("*IMPRIMINDO CANDIDATOS INFORMANDO O INDICE*");
        for(int indice=0; indice < candidatos.length;indice +=1) {
            System.out.println("O candidato número " + indice + " é " + candidatos[indice]);
        }
    }

    static void SelecaoCandidatos () {
        Scanner scanner = new Scanner(System.in);
        String [] candidatos = {"Felipe","Maria", "Gabriel", "Marcia", "Julio"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            System.out.println("Informe o salário que pretende receber caso aprovado: ");
            double salarioPretendido = scanner.nextDouble(); 
            System.out.println("O candidato " + candidato + " solicitou este valor de slaário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " está na lista de aprovação por enquanto.");
            }
            candidatoAtual += 1;
        }
        scanner.close();
    }
}

//     static void analisarCandidato (double vRequerido) { 
//         double vBase = 2000.0;
//         if (vBase > vRequerido) {
//             System.out.println("*A EMPRESA ESTÁ TE LIGANDO PARA FECHAR O ACORDO.*");
//         } else if (vBase == vRequerido ) { 
//             System.out.println("A EMPRESA DESEJA TE FAZER UMA CONTRA PROPOSTA.");
//         } else { 
//             System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
//         }
//     }
     
// }
