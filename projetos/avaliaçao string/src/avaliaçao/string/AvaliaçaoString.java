
package avaliaçao.string;

import java.util.Scanner;

public class AvaliaçaoString {

   public static void main (String[]args){
  Scanner in = new Scanner (System.in);
  String codigo;
  int tam;
  int resp;
           System.out.println("Digite o cógido:  ");
           System.out.println("Ele deve ser formado por 4 letras, sendo que a primeira letra deve ser A e composto por 5 números em seguida.");
           codigo = in.next();
           tam = codigo.length(); 
           resp = verificaSequencia(codigo,tam);   
           if(resp == 1){
           System.out.println("Código válido.");    
           }else if(resp == 2){
           System.out.println("O código não contém a quantidade correta de caracteres(9) : " + tam);
           }else{
           System.out.println("Código diferente do padrão.");    
}
    
}
    public static int verificaSequencia(String codigo, int tam){
        int i = 0;
        char letra;
        int contLetra = 0;
        int contDigito = 0;
           
           if(tam != 9){
             return 2;   
}
           else if(!codigo.substring(0).matches("[a]") && !codigo.substring(1, 3).matches("[a-z]") && !codigo.substring(4).matches("[0-9]")){ 
             return 1;    
           }else{
               letra = codigo.charAt(i);
               if(letra != 'a'){
                   return 3;
               }for( i = 1; i <= 3; i++){
                   if(Character.isLetter(codigo.charAt(i))){
                       contLetra++;
                   }
               }
               if (contLetra != 3) {
                   return 3;
               }for( i = 4; i < 8; i++){
                   if(Character.isDigit(codigo.charAt(i)))
                   contDigito++;
               }
           if(contDigito != 5){
             return 3;
}


          return 1;
}
}
 }

   
    

      
    


    

