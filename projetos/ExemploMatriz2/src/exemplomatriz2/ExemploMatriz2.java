
package exemplomatriz2;

import java.util.Scanner;


public class ExemploMatriz2 {

    
    public static void main(String[] args) {
     double [][] matDouble = new double [3][4];
        System.out.println("Preenchimento da matriz");
        preencher(matDouble);
        System.out.println("Exibição da matriz");
        exibir(matDouble);
    }
    public static void preencher (double [][] mat){ //sub-programa para preencher uma matriz de double
        Scanner in = new Scanner (System.in);
        int l, c;
        for (l = 0; l < mat.length ;l++){
            for(c = 0; c < mat[l].length;c++){
                mat[l][c] = in.nextDouble();
            }
            
        }
    }
    public static void exibir (double [][] mat){ // sub-programa para exibir a matriz
     int l, c;   
     for (l = 0; l < mat.length; l++){
         for (c = 0; c < mat[l].length; c++){
             System.out.println(mat[l][c]);
         }
    }
    
    
}
