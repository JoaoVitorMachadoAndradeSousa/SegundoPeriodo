
package lista.matriz.pkg4.questao.pkg1;

import java.util.Scanner;


public class ListaMatriz4Questao1 {

    
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        int ordem;
        int [] [] matriz;
        boolean resp;
        System.out.print("Informe qual a ordem da matriz quadrada: ");
        ordem = in.nextInt();
        while (ordem < 2) {
            System.out.print("Ordem inválida. Informe ordem maior ou igual a 2: ");
            ordem = in.nextInt();
        }
        matriz = new int [ordem][ordem];
        System.out.println("Preenchimento da matriz");
        preencher (matriz);
        resp = testar (matriz);
        if (resp == true) {
            System.out.println("A matriz é de permutação");
        }
        else {
            System.out.println("A matriz não é de permutação");
        }
        exibir (matriz);
    }
    
    public static boolean testar (int [][] mat) {
        int lin, col, total;
        
        // Passo 1 - Garantir que todos os valores são 0 ou 1
        for (lin = 0; lin < mat.length; lin++) {
            for (col = 0; col < mat[lin].length; col++) {
                if (mat[lin][col] != 0 && mat[lin][col] != 1) {
                    return false;
                }               
            }
        }        
        // Passo 2 - Garantir que tem apenas um 1 por linha
        for (lin = 0; lin < mat.length; lin++) {
            total = 0;
            for (col = 0; col < mat[lin].length; col++) {
                if (mat[lin][col] == 1) {
                    total++;
                }
            }
            if (total != 1) {
                return false;
            }
        }        
        // Passo 3 - Garantir que tem apenas um 1 por coluna
        for (col = 0; col < mat[0].length; col++) {
            total = 0;
            for (lin = 0; lin < mat.length; lin++) {
                if (mat[lin][col] == 1) {
                    total++;
                }
            }
            if (total != 1) {
                return false;
            }
        }
        return true;
    }    
    
    public static void preencher (int [][] mat) {
       
        Scanner in = new Scanner (System.in);
        int l, c;
        
        for (l = 0; l < mat.length; l++) {
            for (c = 0; c < mat[l].length; c++) {
                System.out.print("[" + (l+1) + "][" + (c+1) + "]: ");
                mat[l][c] = in.nextInt();  
            }            
        }        
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
    

