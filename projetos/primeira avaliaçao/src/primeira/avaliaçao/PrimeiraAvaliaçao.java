
package primeira.avaliaçao;

import java.util.Scanner;


public class PrimeiraAvaliaçao {
    

    
    public static void main(String[] args) {
        int valor [] = new int[92];
        int valor2 [] = new int [92];
               
        preencherVet(valor);
        System.out.println("A soma do vetores é " + somaVet(valor));
        exibirVet(valor);
        System.out.println("A comparação entre o ano de 2019 e 2020 foi de: ");
        comparaçao(valor, valor2);
    
    }
     public static void preencherVet(int[] vet) {
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.print("Informe o 1º valor inteiro: ");
        num = in.nextInt();
        vet[0] = num;
        System.out.println("Valor inserido!");
        for (int i = 1; i <= vet.length - 1;) {
            System.out.print("Informe o " + (i++) + "º valor inteiro: ");
            num = in.nextInt();
           
        }
    }
     public static double somaVet (int [] vet){
        
        double soma = 0;
        for(int i = 0; i < 24;i++){
            soma = soma + vet[i];
        }
        return soma;
         
     }
     public static void comparaçao (int [] vet, int [] vetor){
         
     }
     public static void exibirVet(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " - ");
        }
        System.out.println();
     
            
        }
        
    

    
    
        
