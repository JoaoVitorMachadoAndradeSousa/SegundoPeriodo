
package lista.string.pkg1.questao.pkg3;

import java.util.Scanner;


public class ListaString1Questao3 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String frase;
        int tam;
        int contLetra = 0;
        int contDigito = 0;
        int contSimbolo = 0;
        int contEspaço = 0;
        System.out.println("Digite a frase: ");
        frase = in.nextLine();
        tam = frase.length();
        for(int i = 0; i < tam ; i++){
            
                    if(frase.charAt(i) == 'a' || frase.charAt(i) == 'b'|| frase.charAt(i) == 'c'|| frase.charAt(i) == 'd'|| frase.charAt(i) == 'e'|| frase.charAt(i) == 'f'|| frase.charAt(i) == 'g'|| frase.charAt(i) == 'h'|| frase.charAt(i) == 'i'|| frase.charAt(i) == 'j'|| frase.charAt(i) == 'k'|| frase.charAt(i) == 'l'|| frase.charAt(i) == 'm'|| frase.charAt(i) == 'n'|| frase.charAt(i) == 'o'|| frase.charAt(i) == 'p'|| frase.charAt(i) == 'q'|| frase.charAt(i) == 'r'|| frase.charAt(i) == 's'|| frase.charAt(i) == 't'|| frase.charAt(i) == 'u'|| frase.charAt(i) == 'v'|| frase.charAt(i) == 'w'|| frase.charAt(i) == 'x'|| frase.charAt(i) == 'y'|| frase.charAt(i) == 'z'){
                contLetra++;
                    }else if(frase.charAt(i) == '0' || frase.charAt(i) == '1'|| frase.charAt(i) == '2'|| frase.charAt(i) == '3'|| frase.charAt(i) == '4'|| frase.charAt(i) == '5'|| frase.charAt(i) == '6'|| frase.charAt(i) == '7'|| frase.charAt(i) == '8'|| frase.charAt(i) == '9'){
                contDigito++;
                    }else if(frase.charAt(i) == '!' || frase.charAt(i) == '@'|| frase.charAt(i) == '#'|| frase.charAt(i) == '$'|| frase.charAt(i) == '%'|| frase.charAt(i) == '¨'|| frase.charAt(i) == '&'|| frase.charAt(i) == '*'|| frase.charAt(i) == '('|| frase.charAt(i) == ')'){
                contSimbolo++;
                    }else if(frase.charAt(i) == ' '){
                contEspaço++;
            }
        }
        System.out.println("Letras: " + contLetra);
        System.out.println("Dígitos: " + contDigito);
        System.out.println("Símbolos: " + contSimbolo);
        System.out.println("Espaços: " + contEspaço);
        
   
        
                
   
    }
    
}
