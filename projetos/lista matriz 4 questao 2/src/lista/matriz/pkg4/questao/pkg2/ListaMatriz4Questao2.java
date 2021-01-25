
package lista.matriz.pkg4.questao.pkg2;

import java.util.Scanner;


public class ListaMatriz4Questao2 {

    
    public static void main(String[] args) {
        int mat [][] = new int [4][4];
        System.out.println("Preenchimento da matriz por coluna: ");
        preencherPorColuna(mat);
        System.out.println("Exibição da matriz");
        exibir(mat);
        soma(mat);
        
    
    }
    public static void preencherPorColuna (int [][] mat){
        Scanner in = new Scanner (System.in);
        int l, c;
        for(c = 0; c < mat.length; c++){
            for(l = 0; l < mat[c].length; l++){
                System.out.print("[" + (c+1) + "," + (l+1) + "] = ");
                mat[c][l] = in.nextInt();
            }
        }
    
    }
     public static void exibir (int[][] mat) {
        int lin, col;
        
        for (col = 0; col < mat.length; col++) {
            for (lin = 0; lin < mat[col].length; lin++) {
                System.out.print(mat[lin][col] + " ");
            }
            System.out.println();
        }
     }
     public static void soma (int [][] mat){
         int soma1, soma2, soma3;
         int somaFinal, somaFinal2;
         soma1 = mat[0][1] + mat[0][2];
         soma2 = mat[0][3] + mat [1][2];
         soma3 = mat[1][3] + mat [2][3];
         somaFinal = soma1 + soma2;
         somaFinal2 = somaFinal + soma3;
         System.out.println("A soma dos números superiores a diagonal principal é igual a " + somaFinal2);
        
   }
    
}
    

