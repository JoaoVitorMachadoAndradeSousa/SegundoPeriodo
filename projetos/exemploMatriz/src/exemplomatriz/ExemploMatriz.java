
package exemplomatriz;

import java.util.Scanner;


public class ExemploMatriz {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
    int [] [] matInt = new int [3][4]; // matriz de inteiros com 3 linhas e 4 colunas
    matInt[0][3] = 10; // preenchimento de matriz com valor 10 na coluna 3(4) e na linha 0(1)
    matInt[2][0] = in.nextInt(); // preenchimento de matriz com valor que o usuário irá decidir na linha 2(3) na coluna 0(1)
    for (int linha = 0; linha <= matInt.length - 1; linha++){ // preenchimento da matriz inteira por linhas
        for (int coluna = 0; coluna <= matInt[linha].length; coluna++){
            matInt[linha][coluna] = linha + coluna;
            
        }
    }
    
    
    
    
    }
    
    
}
