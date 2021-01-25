
package listavetores1questao2e3;

import java.util.Scanner;


public class Listavetores1questao2e3 {

    
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
        System.out.println("O total de ganhos foi de R$" + somaVet(vetGanhos));
        System.out.println("O total de ganhos foi de R$" + somaVet(vetGastos));
        System.out.println("O total de ganhos foi de R$" + somaVet(vetLucro));
        mediaVetores(vetLucro);
        System.out.println("A média do lucro mensal de 2019 foi de: " + mediaVetores(vetLucro));

   
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
    public static double somaVet (double [] vet){
        double soma = 0;
        for(int i = 0; i <12;i++){
            soma = soma + vet[i];
        }
        return soma;
    }
    public static double mediaVetores (double [] vet){
double somamedia = 0,media = 0;
int i;
for(i=0;i<12;i++){
somamedia = somamedia + vet[i];
}
media = somamedia / 12;
return media;
}
    
}
