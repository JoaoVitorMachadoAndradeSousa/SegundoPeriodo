
package lista.string.pkg1.questao.pkg5;

import java.util.Scanner;


public class ListaString1Questao5 {

   
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String nome;
    int tam;
        System.out.println("Digite um nome: ");
        nome = in.nextLine();
        tam = nome.length();
        for(int i = 0; i < tam; i++){
            while(nome.charAt(i) == '0'||nome.charAt(i) == '1' ||
                    nome.charAt(i) == '2'||nome.charAt(i) == '3'||
                    nome.charAt(i) == '4'||nome.charAt(i) == '5'||
                    nome.charAt(i) == '6'||nome.charAt(i) == '7'||
                    nome.charAt(i) == '8'||nome.charAt(i) == '9'||
                    nome.charAt(i) == '!'||nome.charAt(i) == '@'||
                    nome.charAt(i) == '$'||nome.charAt(i) == '%'||
                    nome.charAt(i) == '¨'||nome.charAt(i) == '&'||
                    nome.charAt(i) == '*'||nome.charAt(i) == '('||
                    nome.charAt(i) == ')'||nome.charAt(i) == '-'||
                    nome.charAt(i) == '_'||nome.charAt(i) == '+'||
                    nome.charAt(i) == '='||nome.charAt(i) == '`'||
                    nome.charAt(i) == '´'||nome.charAt(i) == '['||
                    nome.charAt(i) == '{'||nome.charAt(i) == ']'||
                    nome.charAt(i) == '#'||nome.charAt(i) == '}'||
                    nome.charAt(i) == '~'||nome.charAt(i) == '^'||
                    nome.charAt(i) == ','||nome.charAt(i) == '<'||
                    nome.charAt(i) == '.'||nome.charAt(i) == '>'||
                    nome.charAt(i) == ';'||nome.charAt(i) == ':'||
                    nome.charAt(i) == '?'||nome.charAt(i) == '+'||
                    nome.charAt(i) == '/'||nome.charAt(i) == '´'){
                System.out.println("Nome inválido, digite novamente: ");
                 nome = in.nextLine();
            }
        }
    }
    
}
