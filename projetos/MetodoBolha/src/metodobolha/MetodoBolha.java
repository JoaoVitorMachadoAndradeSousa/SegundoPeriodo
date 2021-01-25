
package metodobolha;

import java.util.Scanner;


public class MetodoBolha {

  
    public static void main(String[] args) {
       int[] numeros = new int[10];
        preencher(numeros);
        exibir (numeros);
        ordenar (numeros);
        exibir (numeros);
}
     public static void exibir (int [] vet) {
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
        System.out.println();
        }
      public static void ordenar(int[] vet) { // utilizando o algoritmo BubbleSort
        int pos = 0, i, aux;
        int fim = vet.length - 1;
        boolean troca = true;
        while (troca == true) {
            troca = false;
            for (i = 0; i < fim; i++) { // passagem ou varredura
                if (vet[i] > vet[i + 1]) {
                    aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    troca = true;
                    pos = i;
                     }
                 }
            fim = pos;
               }
         }
       public static void preencher(int[] vet) {
        Scanner in = new Scanner(System.in);
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println("[" + i + "] = ");
            vet[i] = in.nextInt();
            }
        }
       }
        
