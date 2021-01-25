
package listavetores1questao4;

import java.util.Scanner;


public class Listavetores1questao4 {

    
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    char resp;
    int voto;
     int votoTotal = 0;
     int [] candidato = new int [10];
     exibiCandi();
     do{
         System.out.println("Informe o seu voto: ");
         voto = in.nextInt();
         if (voto < 0 || voto > 8){
          candidato[9] += 1;
          
         }else{
             candidato[voto] = candidato[voto] + 1;
         }
         System.out.println("Existe outro eleitor(a)? Digite S ou N:");
         resp = in.next().charAt(0);
         Character.toUpperCase(resp);
     
     }while (resp == 'S');
     for (int i = 0; i < candidato.length; i++){
         votoTotal += candidato[i];
     }
     
    }
    
}
