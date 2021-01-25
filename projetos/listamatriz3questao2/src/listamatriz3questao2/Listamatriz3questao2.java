
package listamatriz3questao2;

import java.util.Scanner;


public class Listamatriz3questao2 {

    
    public static void main(String[] args) {
           Scanner in = new Scanner (System.in);
        int lin,col;
        System.out.println("Elemento MINMAX:");
        System.out.println("Informe o número de linhas da matriz:");
        lin = in.nextInt();
        while (lin <= 0){
            System.out.println("Dado inválido. Digite novamente.");
            System.out.println();
            System.out.println("Elemento MINMAX:");
            System.out.println("Informe o número de linhas da matriz:");
            lin = in.nextInt();
        }
        System.out.println("Informe o número de colunas da matriz:");
        col = in.nextInt();
        while (col <=0 ){
            System.out.println("Dado inválido. Digite novamente.");
            System.out.println();
            System.out.println("Elemento MINMAX:");
            System.out.println("Informe o número de colunas da matriz:");
            col = in.nextInt();
        }
        double [][] matriz = new double [lin][col];
        preenchimentoMatriz(matriz);
        exibeMINMAX(matriz);
    }
    
    public static void preenchimentoMatriz(double [][] A){
        Scanner in = new Scanner(System.in);
        for (int l=0; l<A.length; l++){
            for (int c=0; c<A[0].length; c++){
                System.out.println("Informe o item ["+(l+1)+","+(c+1)+"] da matriz:");
                A[l][c]= in.nextDouble();
            }
        }
        }
    
    public static int verificacaoMINMAX (double [][] A){
        int i,j;
        double min = A[0][0];
        for (i = 1; i < A.length; i++) {
            for (j = 1; j < A[0].length; j++) {
                if (A[i][j] < min){
                min = A[i][j];
            }
            }
            return i;
        }
        return -1;
}  
    
    public static void exibeMINMAX (double [][] A){
        int linhaMenorValor; 
        linhaMenorValor = verificacaoMINMAX(A);
        if (linhaMenorValor==-1){
            System.out.println("Menor valor não encontrado.");
        }
        else{
            System.out.println("A linha "+linhaMenorValor+" constata onde foi encontrado o menor valor.");
        }
    }
        
    }
    
        
    

