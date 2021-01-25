
package lista.string.pkg3.questao.pkg3;

import java.util.Scanner;


public class ListaString3Questao3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    String frase;
    int var;
        System.out.println("Digite uma frase: ");
        frase = in.nextLine();
        var = frase.split(" ", -1).length - 1;
        System.out.println((var + 1) + " palavras.");
        
    }
    
}
