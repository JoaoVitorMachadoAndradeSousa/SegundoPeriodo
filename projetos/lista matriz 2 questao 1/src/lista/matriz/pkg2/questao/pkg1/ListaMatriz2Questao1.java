
package lista.matriz.pkg2.questao.pkg1;

import java.util.Scanner;


public class ListaMatriz2Questao1 {

   
    public static void main(String[] args) {
        int v;
    int [][] matriz = new int [4][4];
        System.out.println("Preenchimento da matriz:");
        preencher(matriz);
        System.out.println("Exibição da matriz:");
        exibir(matriz);

        v = simetrica(matriz);
        if(v == 1){
            System.out.println("A matriz é simétrica");
        }else{
            System.out.println("A matriz não é simétrica");
        }
        
    }
    public static void preencher (int [][] mat){
        Scanner in = new Scanner(System.in);
    int l, c;
    for (l = 0; l <= mat.length - 1; l++){
        for (c = 0; c <= mat[l].length -1; c++){
            mat[l][c] = in.nextInt();
        }
            
        }
    
    }
    
    public static int simetrica (int [][] mat){
        boolean op = false;
        int l, c;
        for(l = 0; l< mat.length; l++){
            for (c = 0; c < mat[l].length; c++){
                if(mat[l][c] == mat[c][l]){
                    op = true;
                
            }else{
                    op = false;
                    break;
                }
                
            }
        }
        if(op == true){
            return 1;
        }else{
            return 0;
        }
    }
    public static void exibir(int [][] mat){
        int lin, col;
        
        for (lin = 0; lin <= mat.length - 1; lin++) {
            for (col = 0; col <= mat[lin].length - 1; col++) {
                System.out.print(mat[lin][col] + " ");
            }
            System.out.println();
        }
    }
       
       
        
    }
    

