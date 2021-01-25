
package lista.string.pkg2.questa.o5;

import java.util.Scanner;

public class ListaString2QuestaO5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase1, frase2;
        int tamanho1,tamanho2,cont = 0;
        char letra1,letra2;
        System.out.println("Comparação de frases:");
        System.out.println("Informe a primeira sequência de caracteres:");
        frase1 = in.nextLine();
        tamanho1 = frase1.length();
        System.out.println("Informe a segunda sequência de caracteres:");
        frase2 = in.nextLine();
        tamanho2 = frase1.length();
        System.out.println();
        System.out.println("Observe as sequência de caracteres:");
        System.out.println("1º Sequência: "+frase1);
        System.out.println("2º Sequência: "+frase2);
        if(tamanho1 != tamanho2){
            System.out.println("As duas sequências NÃO são iguais.");
        }
        else{
            for (int i = 0; i < tamanho1; i++) {
                letra1 = frase1.charAt(i);
                letra1 = Character.toLowerCase(letra1);
                letra2 = frase2.charAt(i);
                letra2 = Character.toLowerCase(letra2);
                if(letra1 == letra2){
                    cont++;
                }
            }
            if(cont != tamanho1){
                System.out.println("As duas sequências NÃO são iguais.");
            }
            else{
                System.out.println("As duas sequências são iguais.");
            }
        }
    }
    
}
   


