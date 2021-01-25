
package matriz;

import java.util.Scanner;


public class Matriz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int ordem;
    int [][] matriz;
    boolean resp;
        System.out.println("Informe a ordem da matriz quadrada: ");
        ordem = in.nextInt();
        while(ordem < 2){
            System.out.println("Ordem inválida, digite uma matriz de ordem acima de 2: ");
            ordem = in.nextInt();
        }
        matriz = new int[ordem][ordem];
        System.out.println("Preenchimento da matriz: ");
        preencher(matriz);
        resp = matrizPermutada (matriz);
        if (resp == true) {
            System.out.println("A matriz é de permutação");
        }
        else {
            System.out.println("A matriz não é de permutação");
        }
        exibir (matriz);
    }
    
     public static void preencher (int [][] mat){
        Scanner in = new Scanner (System.in);
        int l, c;
        for(l = 0; l < mat.length; l++){
            for(c = 0; c < mat[l].length; c++){
                System.out.print("[" + (l+1) + "," + (c+1) + "] = ");
                mat[l][c] = in.nextInt();
            
        
    
}
        }
     }
     public static boolean matrizPermutada (int [][] mat){
         int l, c;
         int cont = 0;
         for(l = 0; l < mat.length; l++){
             for(c = 0; c < mat[l].length; c++){
                 if(mat[l][c] != 1 && mat[l][c] != 0){
                     return false;
                     
                 }
             }
         }
         for( l = 0; l < mat.length; l++){
             for(c = 0; c < mat[l].length; c++){
                 if(mat[l][c] != 1){
                     return false;
                 }else{
                     cont++;
                 }
             }
         }
         for (c = 0; c < mat[0].length; c++) {
            cont = 0;
            for (l = 0; l < mat.length; l++) {
                if (mat[l][c] == 1) {
                    cont++;
                }
            }
            if (cont != 1) {
                return false;
            }
        }
        return true;
    }
     public static void exibir (int [][] mat) {
        int l, c;
        for (l = 0; l < mat.length;l++) {
            for (c = 0; c < mat[l].length; c++) {
                System.out.print(mat[l][c] + " ");
            }
            System.out.println();
        }
        
        
    }
    }
     






