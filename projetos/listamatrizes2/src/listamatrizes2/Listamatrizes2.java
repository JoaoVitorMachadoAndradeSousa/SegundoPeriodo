
package listamatrizes2;

import java.util.Scanner;


public class Listamatrizes2 {

   
    public static void main(String[] args) {
       
        String[] alunos = new String[20];
        double[][] matriz = new double[20][3];
        double mediaTurma;
        int mediainf;
        preencher(alunos, matriz);
        mediaTurma = mediaT(matriz);
        System.out.println("A media da turma foi: " + mediaTurma);
        mediainf = abaixoMedia(matriz, mediaTurma);
        System.out.println("A quantidade de alunos que ficaram abaixo da média foram de " + mediainf + " alunos. ");
        maiorMenor(matriz);
    }

    public static void preencher(String[] nomes, double[][] matriz) {
        Scanner in = new Scanner(System.in);
        double media;
        int l;
        for (l = 0; l < matriz.length; l++) {

            System.out.println("Digite o nome do aluno: ");
            nomes[l] = in.next();
            System.out.println("Informe a " + (1) + "°" + " nota:");
            matriz[l][0] = in.nextDouble();
            System.out.println("Informe a " + (2) + "°" + " nota:");
            matriz[l][1] = in.nextDouble();
            matriz[l][2] = (matriz[l][0] * 2 + matriz[l][1] * 3) / 5;
            media = matriz[l][2];
            System.out.println("O aluno " + nomes[l] + " obteve a média " + media + ".");
        }

    
    }
    public static double mediaT(double[][] matriz) {
        int i;
        double media;
        double soma = 0;
        for (i = 0; i < matriz.length; i++) {
            soma = matriz[i][2] + soma;
        }

        media = soma / matriz.length;
        return media;
    }

    public static int abaixoMedia(double[][] matriz, double media) {
        int abaixoMedia = 0;
        int i;
        for (i = 0; i < matriz.length; i++) {
            if (matriz[i][2] < media) {
                abaixoMedia++;
            }
        }
        return abaixoMedia;
    }

    public static void maiorMenor(double[][] matriz) {
        double menor = 11;
        double maior = -1;
        int i;
        for (i = 0; i < matriz.length; i++) {
            if (matriz[i][2] > maior) {
                maior = matriz[i][2];
            }if (matriz[i][2] < menor) {
                menor = matriz[i][2];
            }
        }
        System.out.println("O maior valor foi " + maior + ".");
        System.out.println("O menor valor foi " + menor + ".");
    }
    
}
