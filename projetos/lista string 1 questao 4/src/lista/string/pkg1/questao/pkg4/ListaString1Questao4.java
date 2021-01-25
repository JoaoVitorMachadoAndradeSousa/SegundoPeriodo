
package lista.string.pkg1.questao.pkg4;

import java.util.Scanner;


public class ListaString1Questao4 {

   
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String fraseCriptografada;
    String frase;
    int tam;
        System.out.println("Digite a frase");
        frase = in.nextLine();
        fraseCriptografada = frase;
        fraseCriptografada = fraseCriptografada.replace('a', '@');
        fraseCriptografada = fraseCriptografada.replace('e', '$');
        fraseCriptografada = fraseCriptografada.replace('i', '&');
        fraseCriptografada = fraseCriptografada.replace('o', '*');
        fraseCriptografada = fraseCriptografada.replace('u', '#');
        System.out.println("Frase digitada: " + frase);
        System.out.println("Frase criptografada: " + fraseCriptografada);
        
       
        }
        
    }

    

