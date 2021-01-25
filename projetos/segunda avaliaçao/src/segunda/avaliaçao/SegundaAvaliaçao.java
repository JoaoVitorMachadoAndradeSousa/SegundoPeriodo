
package segunda.avaliaçao;


public class SegundaAvaliaçao {

   
    public static void main(String[] args) {
    
    }
    public static void decrescente (double [] vetor){
         int pos = 0, l;
         double a;
         int fim = vetor.length - 1;
         boolean troca = true;
         while (troca == true) {
         troca = false;
         for (l = 0; l < fim; l++) { 
        if (vetor[l] < vetor[l + 1]) {
        a = vetor[l];
        vetor[l] = vetor[l + 1];
        vetor[l + 1] = a;
        troca = true;
        pos = l;
 }
 }
 fim = pos;
 }
    }
    
}
