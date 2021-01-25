
package listamatriz3questao1;

import java.util.Scanner;


public class ListaMatriz3questao1 {

    public static void main(String[] args) {
    int matriz [][] = new int [3][3];
    int t;
    preencher(matriz);
    t = quadradoMagico(matriz);
    if(t == 1){
        System.out.println("A matriz não é um quadrado mágico.");
    
    }else{
        System.out.println("A matriz é um quadrado mágico.");
    }
    }
    
    public static void preencher (int [][] mat){
        Scanner in = new Scanner (System.in);
        int l, c;
        for (l = 0; l <= mat.length - 1; l++){
            for (c = 0; c <= mat[l].length - 1 ; c++){
                System.out.print("[" + (l+1) + "," + (c+1) + "] = ");
                mat[l][c] = in.nextInt();
            }
        }
    }
    public static int quadradoMagico (int [][] mat){
        int soma = 0;
        int soma2 = 0;
        int c, l;
        
        
        for (  c = 0; c < mat[0].length; c++ ){ // soma elementos da primeira linha
            soma = soma + mat[0][c];
        }
        for (  l = 1; l < mat.length ; l++){
            ;
                for(  c = 0; c < mat[0].length; c++){
                soma2 = soma2 + mat[l][c];
                
            }
            if(soma2 != soma){
                return 0;
            }

        }
        for (  c = 0; c < mat[0].length; c++){
            ;                       // soma das colunas
            for(  l = 0; l < mat.length; l++){
                soma2= soma2 + mat[l][c];
                
            }
            if(soma2 != soma){
                return 0;
            }
        }
        ; 
        for (  l = 0; l < mat.length; l++){
           soma2 = soma2 + mat[l][l];
        }
        if(soma2 != soma){
            return 0;
        }
        ;
        int i = 0;
        for (  c = mat.length - 1; c >= 0; c-- ){ // soma diagonal secundária
            soma2 = soma2 + mat[l][c];
            i++;
        }
        if(soma2 != soma){
            return 0;
        }
        return 1; //é quadrado mágico
        }
    
    }
        

    

