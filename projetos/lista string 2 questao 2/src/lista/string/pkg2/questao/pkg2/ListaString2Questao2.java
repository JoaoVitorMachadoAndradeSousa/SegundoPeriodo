
package lista.string.pkg2.questao.pkg2;

import java.util.Scanner;


public class ListaString2Questao2 {

    
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String frase;
    String fraseCriptografada;
    
        System.out.println("Digite a frase: ");
        frase = in.nextLine();
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        fraseCriptografada = fraseInvertida;
        fraseCriptografada = fraseCriptografada.replace('q', '#');
        fraseCriptografada = fraseCriptografada.replace('w', '#');
        fraseCriptografada = fraseCriptografada.replace('r', '#');
        fraseCriptografada = fraseCriptografada.replace('t', '#');
        fraseCriptografada = fraseCriptografada.replace('y', '#');
        fraseCriptografada = fraseCriptografada.replace('p', '#');
        fraseCriptografada = fraseCriptografada.replace('s', '#');
        fraseCriptografada = fraseCriptografada.replace('d', '#');
        fraseCriptografada = fraseCriptografada.replace('f', '#');
        fraseCriptografada = fraseCriptografada.replace('g', '#');
        fraseCriptografada = fraseCriptografada.replace('h', '#');
        fraseCriptografada = fraseCriptografada.replace('j', '#');
        fraseCriptografada = fraseCriptografada.replace('k', '#');
        fraseCriptografada = fraseCriptografada.replace('l', '#');
        fraseCriptografada = fraseCriptografada.replace('z', '#');
        fraseCriptografada = fraseCriptografada.replace('x', '#');
        fraseCriptografada = fraseCriptografada.replace('c', '#');
        fraseCriptografada = fraseCriptografada.replace('v', '#');
        fraseCriptografada = fraseCriptografada.replace('b', '#');
        fraseCriptografada = fraseCriptografada.replace('n', '#');
        fraseCriptografada = fraseCriptografada.replace('m', '#');
        System.out.println("A frase criptografada invertida é " + fraseCriptografada);
    }
    
}
