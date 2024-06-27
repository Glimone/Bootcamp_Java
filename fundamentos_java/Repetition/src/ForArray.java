public class ForArray {
    public static void main(String[] args) {
        
        String alunos [] = {"Felipe", "Jonas", "Maria", "Carol", "Gabriel"}; //Array é um conjunto de elementos correspondentes (Todos var ou todos String, etc)
                                //length significa tamanho, ou seja, o tamanho do array em quantidade.
        for (int x=0; x < alunos.length; x += 1 ) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
                        //Aqui o x é definido como valor do indice, pois é ele que definirá o array em cada mudança. Basicamente conectamos a var "X" com a ordem dos arrays, no mesmo formato ambos.
        }

    }
}
