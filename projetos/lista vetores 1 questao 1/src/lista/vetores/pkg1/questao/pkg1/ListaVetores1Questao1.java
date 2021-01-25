
package lista.vetores.pkg1.questao.pkg1;

import java.util.Scanner;


public class ListaVetores1Questao1 {

    
    public static void main(String[] args) {
   double [] vetGanhos = new double [12];
   double [] vetGastos = new double [12];
   double [] vetLucro = new double [12];
        System.out.println("Informe o ganho");
        ganhosEGastos(vetGanhos);
        System.out.println("Informe o gasto");
        ganhosEGastos(vetGastos);
        calcLucro(vetGanhos,vetGastos,vetLucro);
        System.out.println("VALORES DOS GANHOS");
        exibir(vetGanhos);
        System.out.println("VALORES DOS GASTOS");
        exibir(vetGastos);
        System.out.println("VALORES DOS LUCROS");
        exibir(vetLucro);
   
    }
    public static void ganhosEGastos (double [] vet){
        Scanner in = new Scanner (System.in);
        int mes = 1;
        for (int i = 0; i < vet.length; i++){
            System.out.println("Informe o valor do mês " + mes +":");
            vet[i] = in.nextDouble();
            mes++;
            
        }
            
    }
    public static void calcLucro (double [] vetGanhos, double [] vetGastos, double[] vetLucro){
        int i;
        for (i = 0; i < vetGanhos.length;i++ ){
            vetLucro[i] = vetGanhos[i] - vetGastos[i];
            
        }
    }
    public static void exibir (double [] vet){
        int mes = 1;
        for(int i = 0; i<vet.length;i++){
            System.out.println("Mês" + mes + "R$" + vet[i]);
            mes++;
        }
        
    }
    
    
}
