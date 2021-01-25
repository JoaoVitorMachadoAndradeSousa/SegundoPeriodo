
package exemplomatriz3;

import java.util.Scanner;


public class ExemploMatriz3 {

    
    public static void main(String[] args) {
    int [][] numeros = new int [2][2];
        int [][] valores = new int [2][2];
        System.out.println("Preenchimento da matriz números");
        preencher (numeros);
        exibir (numeros);
        System.out.println("Preenchimento da matriz valores");
        preencher (valores);
        exibir (valores);
    }
     public static void exibir (int[][] mat){
         int lin, col;
        
        for (lin = 0; lin <= mat.length - 1; lin++) {
            for (col = 0; col <= mat[lin].length - 1; col++) {
                System.out.print(mat[lin][col] + " ");
            }
            System.out.println();
        }
     }
     public static void preencher (int[][] mat) {
        Scanner in = new Scanner (System.in);
        int lin, col;
        
        for (lin = 0; lin <= mat.length - 1; lin++) {
            for (col = 0; col <= mat[lin].length - 1; col++) {
                System.out.print("[" + (lin+1) + "," + (col+1) + "] = ");
                mat[lin][col] = in.nextInt();
            }
        }
    }
}
     
    

