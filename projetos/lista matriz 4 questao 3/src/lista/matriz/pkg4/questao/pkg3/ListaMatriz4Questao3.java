//Implemente um programa para criar uma matriz com 5 linhas e 5 colunas
//onde serão armazenados números reais. Essa matriz deverá ser preenchida coluna a
//coluna com valores informados pelo usuário do programa. Em seguida, multiplique cada
//elemento da diagonal secundária da matriz pelo elemento de maior valor armazenado na
//matriz. Ao final, exiba a matriz resultante, linha a linha.
package lista.matriz.pkg4.questao.pkg3;

import java.util.Scanner;


public class ListaMatriz4Questao3 {

    
    public static void main(String[] args) {
        double mat [][] = new double [5][5];
        System.out.println("Preenchimento da matriz por coluna: ");
        preencherPorColuna(mat);
        System.out.println("Exibição da matriz antes dos cálculos:");
        exibir(mat);
        System.out.println("O maior número da matriz é " + maior(mat));
        
    
    }
    public static void preencherPorColuna (double [][] mat){
        Scanner in = new Scanner (System.in);
        int l, c;
        for(c = 0; c < mat.length; c++){
            for(l = 0; l < mat[c].length; l++){
                System.out.print("[" + (c+1) + "," + (l+1) + "] = ");
                mat[c][l] = in.nextInt();
            }
        }
    
}
    public static void exibir (double[][] mat) {
        int lin, col;
        
        for (lin = 0; lin < mat.length; lin++) {
            for (col = 0; col < mat[lin].length; col++) {
                System.out.print(mat[lin][col] + " ");
            }
            System.out.println();
        }
     }
    public static double maior (double [][] mat){
        int i, j;
        double maior = Integer.MIN_VALUE;
        for( i = 0; i < mat.length; i++){
            for(j = 0; j < mat[i].length; j++){
            if(mat[i][j] > maior)
                maior = mat[i][i];
          }
        }
        return maior;
    
    }
    
}
      
    



