
package prova.matriz;

import java.util.Scanner;



public class ProvaMatriz {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [][] matriz;
        int [] vetLinha;
        int [] vetColuna;
        int l, c;
        System.out.println("Informe a quantidade de linhas: ");
        l = in.nextInt();
        while(l <= 0 ){
            System.out.println("Quantidade de linhas inválidas");
            System.out.println("Digite novamente: ");
            l = in.nextInt();
        }
        System.out.println("Informe a quantidade de colunas: ");
        c = in.nextInt();
        while (c <= 0){
            System.out.println("Quantidade de colunas inválidas");
            System.out.println("Digite novamente: ");
            c = in.nextInt();
        }
        matriz = new int[l][c];
        preencher(matriz);
        somaLinha(matriz, vetLinha);
        somaColuna(matriz, vetColuna);
        exibirVetor(vetLinha);
        exibirVetor(vetColuna);
        
    
    }
    public static void preencher (int [][] mat){
       
        Scanner in = new Scanner (System.in);
        int lin, col;
        
        for (lin = 0; lin < mat.length ; lin++) {
            for (col = 0; col < mat[lin].length ; col++) {
                System.out.print("[" + (lin+1) + "," + (col+1) + "] = ");
                mat[lin][col] = in.nextInt();
            }
        }
    }
    public static void somaLinha (int [][] mat, int [] somaLinha){
        int soma = 0;
        int l, c;
		for ( l = 0; l < mat.length; l ++) {
			for ( c = 0; c < mat.length; c++) 
			{
				if(soma == l)
				somaLinha[l] += somaLinha[l] + mat[l][c];
			}
                        System.out.println("A soma das linhas foi de : " + somaLinha);
        
    }
    }
    public static void somaColuna (int [][] mat, int [] somaColuna){
        int soma = 0;
        int l, c;
		for ( l = 0; l < mat.length; l++) {
			for ( c = 0; c < mat.length; c++) 
			{
				if(soma == c)
				somaColuna[c] += somaColuna[c] + mat[l][c];
			}
		}
                System.out.println("A soma das colunas foi de : " + somaColuna);
    }
  
        

    
 public static void exibirVetor (int [] vet) {
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }
 
}
    
            
    

