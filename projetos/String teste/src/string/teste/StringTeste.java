
package string.teste;

import java.util.Scanner;


public class StringTeste {
// string explícita e implícita são diferentes!!!
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
   String nome;  
   String endereço;                     // criação de uma string
   nome = "joão";
   char [] letras = {'j', 'o', 'a', 'o'};   // criação de uma string a partir de um vetor de caracteres
   
   String nomeChar = new String (letras);     
        System.out.println(nomeChar);
        System.out.println(nome);
        System.out.println("Nome do endereço: ");
        endereço = in.nextLine();
        System.out.println(endereço);
    }
    
}
