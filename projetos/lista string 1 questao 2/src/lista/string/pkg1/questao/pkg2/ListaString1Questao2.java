
package lista.string.pkg1.questao.pkg2;

import java.util.Scanner;

public class ListaString1Questao2 {

    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
        char letra;
        String nome;
        int cont = 0;
        int tam;

        System.out.println("Informe um nome: ");
        nome = in.nextLine();
        System.out.println("Informe um caracter para procurar no nome: ");
        letra = in.next().charAt(0);
        letra = Character.toLowerCase(letra);
        tam = nome.length();
        for (int i = 0; i < tam; i++) {
            if (letra == Character.toLowerCase(nome.charAt(i))) {
                cont++;
            }
        }
        System.out.print("O caracter " + letra + " aparece " + cont + " vezes ");
        System.out.println("no nome " + nome);
    }
}    
    
    

