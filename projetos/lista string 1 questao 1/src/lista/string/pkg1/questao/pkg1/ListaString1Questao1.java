

package lista.string.pkg1.questao.pkg1;

import java.util.Scanner;


public class ListaString1Questao1 {

   
    public static void main(String[] args) {
     String frase;
   
    int tam;
    int cont = 0;
    
    Scanner in = new Scanner (System.in);
        System.out.println("Digite a frase: ");
        frase = in.nextLine();
        tam = frase.length();
        for(int i = 0; i < tam; i++){
            if( frase.charAt(i) == 'a' || frase.charAt(i) == 'e' ||frase.charAt(i) == 'i' || frase.charAt(i) == 'o' ||frase.charAt(i) == 'u'){
                cont++;
            }
        }
        System.out.println("Na frase há " + cont + " vogais.");
    
    }
    
}
    

    


