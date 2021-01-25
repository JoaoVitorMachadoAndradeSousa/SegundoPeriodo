
package lista.matriz.pkg2.questao.pkg2;

import java.util.Scanner;


public class LISTAMATRIZ2QUESTAO2 {

    
    public static void main(String[] args) {
    char gabarito [] = new char [100];
   char respostas [][] = new char [50][100];
    String alunos [] = new String [50];
    int  acerto [] = new int [100];
    Scanner in = new Scanner(System.in);
    preencher(gabarito,alunos, acerto, respostas);
    aprovadoReprovado(gabarito,alunos,acerto);
    
    }
    public static void preencher (char[] gab, String[] nomes, int [] acertos, char[][] resp){
        
    Scanner in = new Scanner (System.in);
        int l, c, letra;
        for(letra = 0; letra < gab.length; letra++){
            System.out.println("Informe o gabarito do % d° quesito: " + (letra + 1));
            gab[letra] = in.next().charAt(0);
        }
        for(l = 0; l < resp.length; l++){
            System.out.println("Informe o nome do " + (l + 1) + "° aluno ");
            nomes[l]= in.next();
            for(c = 0; c < resp[l].length ;l++){
                System.out.println("Informe a resposta do " + (c + 1) + "° quesito: ");
                resp[l][c] = in.next().charAt(0);
                if(resp[l][c] == gab[c]){
                    acertos[l]++;
                }
            }
            System.out.println("A quantidade de acertos do aluno %S foram de %d acertos. %n " + nomes[l] + acertos[l]);
            
        }
    }
    public static void aprovadoReprovado (char[] gab, String [] nomes, int [] acertos){
        int i; 
        for ( i = 0; i < nomes.length ; i++) {
            if (acertos[i] >= gab.length * 0.7) {
                System.out.println("O aluno " + nomes[i] + " está aprovado, parabéns!");
            }else{
                System.err.println("O aluno " + nomes[i] + " está reprovado, lamentamos.");
            }
        }
   
    }
    }
   
