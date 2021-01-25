
package listamatriz3questao3;

import java.util.Scanner;


public class Listamatriz3questao3 {

   
    public static void main(String[] args) {
    double [] precos = new double [10];
        int [][] itens = new int [5][10];
        System.out.println("Tabela de preços e armazenamento:");
        System.out.println("Preenchimento dos preços:");
        preencheVet(precos);
        System.out.println("Preenchimento dos produtos nos armazéns:");
        preenchimentoMatriz(itens);
        exibe(precos,itens);
    }
    
    public static void preencheVet (double [] vet){
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe o preço do "+(i+1)+"º item do armazém:");
            vet [i] = in.nextDouble();
            while (vet[i]<0){
                System.out.println("Dado inválido. Digite novamente.");
                System.out.println("Informe o preço do "+(i+1)+"º item do armazém:");
                vet [i] = in.nextDouble();
            }
        }
    }
    
    public static void preenchimentoMatriz(int [][] A){
        Scanner in = new Scanner(System.in);
        for (int l=0; l<A.length; l++){
            for (int c=0; c<A[0].length; c++){
                System.out.println("Informe a quantidade do "+(c+1)+"º do produto no "+(l+1)+"º armazém:");
                A[l][c]= in.nextInt();
            }
            System.out.println();
        }
    }
    
    public static int [] somaProdutosArmazem (int [][] A){
        int [] soma = new int [5];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                soma[i] = soma[i] + A[i][j];
            }
        }
        return soma;
    }
    
    public static double precoMaiorEstoque (int [][] A, double [] p){
        int i,j,max = A[0][0];
        double preco = 0;
        for (i = 1; i < A.length; i++) {
            for (j = 1; j < A[0].length; j++) {
                if (A[i][j] > max){
                    max = A[i][j];
                }
            }
        preco = p[i+1];
        }
        return preco;
    }
    
    public static int menorEstoque (int [][] A){
        int min = A[0][0];
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < A[0].length; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }
            return i;
        }
        return -1;
    }
    
    public static double [] precoArmazem (int [][] A, double [] p){
        int i,j;
        double precoL [] = new double [5];
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[0].length; j++) {
                precoL[i] = precoL[i] + (A[i][j] * p[j]);
            }
        }
        return precoL;
    }
    
    public static void exibe (double [] p,int [][] A){
        int [] soma;
        int s = 0,m;
        double [] pr;
        double prec;
        soma = somaProdutosArmazem(A);
        for (int i = 0; i < soma.length; i++) {
            System.out.println("O "+(i+1)+"º armazém possui "+soma[i]+" produtos.");
        }
        System.out.println();
        for (int i = 0; i < soma.length; i++) {
            s = s + soma[i];
        }
        System.out.println("A quantidade de produtos em todos os armazéns é de: "+s);
        System.out.println();
        prec = precoMaiorEstoque(A,p);
        System.out.println("O preço do produto em maior estoque é de: R$"+prec);
        System.out.println();
        m = menorEstoque (A);
        System.out.println("O item "+m+" está em menor estoque.");
        System.out.println();
        pr = precoArmazem(A,p);
        for (int i = 0; i < pr.length; i++) {
            System.out.println("O "+(i+1)+"º armazém tem o preço armazenado de: R$"+pr[i]);
        }
    }
    }
    

