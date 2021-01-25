
package listamatrizes3;

import java.util.Scanner;


public class ListaMatrizes3 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int linhas, colunas;
        int[][] matrizA;
        int[][] matrizB;
        char resp;
        System.out.println("Informe qual tamanho desejado da matriz (Linha x Colunas): ");
        System.out.println("Informe o número de Linhas: ");
        linhas = in.nextInt();
        System.out.println("Informe o número de Colunas: ");
        colunas = in.nextInt();
        matrizA = new int[linhas][colunas];
        System.out.println("Preenchimento da matriz: ");
        preencher(matrizA);
        matrizB = new int[colunas][linhas];
        matrizB = transposta(matrizA, matrizB);
        System.out.println("Qual matriz você deseja exibir? (A para a matriz informada ou B para a sua transposta) ");
        resp = in.next().charAt(0);
        resp = Character.toUpperCase(resp);
        while (resp != 'A' && resp != 'B') {
            System.out.println("Resposta inválida, por favor, tente novamente!");
            System.out.println("Qual matriz você deseja exibir? (A para a matriz informada ou B para a sua transposta) ");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);
        }
        if (resp == 'A') {
            exibir(matrizA);
        }else{
            exibir(matrizB);
        }

    }

    public static void preencher(int[][] matriz) {
        Scanner in = new Scanner(System.in);
        int L, C;
        for (L = 0; L < matriz.length; L++) {
            for (C = 0; C < matriz[L].length; C++) {
                System.out.println("("+(L + 1) + ", " + (C + 1)+ ")");
                matriz[L][C] = in.nextInt();
            }
        }
    }

    public static void exibir(int[][] matriz) {
        int L, C;
        for (L = 0; L < matriz.length; L++) {
            for (C = 0; C < matriz[L].length; C++) {
                System.out.print(matriz[L][C] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposta(int[][] matrizA, int[][] matrizB) {
        for (int L = 0; L < matrizA.length; L++) {
            for (int C = 0; C < matrizA[L].length; C++) {
                matrizB[C][L] = matrizA[L][C];
            }
        }

        return matrizB;
    }
    }
    

