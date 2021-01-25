
package lista.strin.pkg2.questao.pkg5;

import java.util.Scanner;


public class ListaStrin2Questao5 {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
   String s1;
   String s2;
   boolean resp;
        System.out.println("Digite a primeira sequência de caracteres: ");
        s1 = in.nextLine();
        s1 = new String(s1);
        System.out.println("Digite a segunda sequência de caracteres: ");
        s1 = in.nextLine();
        resp = comparaçao(s1,s1);
        if(resp == true){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        
        
        }
    public static boolean comparaçao (String s1, String s2){
        if(s1 == s2){
            return true;
        }
        return false;
        
        
      
    }
}
    

