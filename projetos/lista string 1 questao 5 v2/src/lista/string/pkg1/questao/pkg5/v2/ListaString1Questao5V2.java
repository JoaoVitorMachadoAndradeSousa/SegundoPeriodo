
package lista.string.pkg1.questao.pkg5.v2;

import java.util.Scanner;


public class ListaString1Questao5V2 {

  
    public static void main(String[] args) {
   Scanner in = new Scanner (System.in);
    String nome;
    int tam;
    char letra;
        System.out.println("Digite um nome: ");
        nome = in.nextLine();
        tam = nome.length();
        for(int i = 0; i < tam; i++ ){
            letra = nome.charAt(i);
            if(letra >= '0' && letra <= '9'){
                System.out.println("Nome inválido, digite novamente: ");
                nome = in.nextLine();
            }else if(letra >= 'a' || letra <= 'z' || letra == ' '){
                System.out.print("É um nome.");
            }else{
        System.out.println("Nome inválido");
                
            
}
        
    }
}
}
