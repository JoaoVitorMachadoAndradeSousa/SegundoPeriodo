
package lista.matrizes.pkg1;

import java.util.Scanner;


public class ListaMatrizes1 {

    
    public static void main(String[] args) {
       Scanner i = new Scanner (System.in);
       String [] alunos = new String[20];
       double [][] notaMedia = new double [20][3];
        System.out.println("Preenchimento dos nomes ");
        preencher(alunos, notaMedia);
        
    }
    public static void preencher (String [] alunos, double [][] notaMedia){
        Scanner i = new Scanner (System.in);
        double media;
        int linha, coluna;
        for (linha = 0; linha < notaMedia.length; linha++){
            System.out.println("Digite o nome do aluno: ");
            alunos [linha] = i.next();
            for(coluna = 0; coluna < notaMedia[linha].length; coluna++){
                System.out.println("Informe a " + (coluna+1)+ "°" + " nota: ");
                notaMedia[linha][coluna] = i.nextDouble();
                
            }
            media = (notaMedia[linha][0] * 2 + notaMedia[coluna][1] * 3 / 5);
            System.out.println("O aluno " + alunos[linha] + " obteve a média " + media + ".");
        }
        
    }
    
    
           }

           
       
       

    
    
    

