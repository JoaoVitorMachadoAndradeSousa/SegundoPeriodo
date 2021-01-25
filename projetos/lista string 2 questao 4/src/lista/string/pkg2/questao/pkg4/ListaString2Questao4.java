
package lista.string.pkg2.questao.pkg4;

import java.util.Scanner;


public class ListaString2Questao4 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       String [] nome = new String [30];
        String [] situacao = new String[30];
        double [] primeiraNota = new double [30];
        double [] segundaNota = new double [30];
        double [] media = new double [30];
        int resultado;
        char respSN = 0;
        preencheNomeENota(nome,primeiraNota,segundaNota);
        calculaMedia (primeiraNota,segundaNota,media,situacao);
        do{
            resultado = procuraAluno(nome);
            if(resultado == -1){
                System.out.println("Aluno não encontrado.");
            }
            else{
                exibeAlunoprocurado(nome,media,situacao,resultado);
                System.out.println("Deseja continuar a procura?");
                respSN = in.next().charAt(0);
                respSN = Character.toUpperCase(respSN);
                while(respSN != 'S' && respSN!= 'N'){
                    System.out.println("Dado inválido. Digite novamente.");
                    System.out.println("Deseja continuar a procura?");
                    respSN = in.next().charAt(0);
                    respSN = Character.toUpperCase(respSN);
                }
            }
        }while(respSN == 'S');
    }

    public static void preencheNomeENota (String [] nome,double [] pNota,double [] sNota){
        Scanner in = new Scanner (System.in);
        int tamanho;
        boolean resultado;
        for (int i=0;i<nome.length;i++){
            System.out.println("Informe o nome do Aluno:");
            nome[i] = in.nextLine();
            tamanho = nome[i].length();
            resultado = testeStringNome(nome[i],tamanho);
            clearBuffer(in);
            while(resultado == false){
                System.out.println("Dado inválido. Digite novamente.");
                nome[i] = in.nextLine();
                tamanho = nome[i].length();
                resultado = testeStringNome(nome[i],tamanho);
                clearBuffer(in);
                
            }
            System.out.println("Informe a primeira nota do Aluno:");
            pNota[i] = in.nextDouble();
           
            
            while (pNota[i]<0 || pNota[i]>10){
                System.out.println("Dado inválido. Digite novamente.");
                System.out.println("Informe a primeira nota do Aluno:");
                pNota[i] = in.nextDouble();
               
            }
            System.out.println("Informe a segunda nota do Aluno:");
            sNota[i] = in.nextDouble();
            
            while (sNota[i]<0 || sNota[i]>10){
                System.out.println("Dado inválido. Digite novamente.");
                System.out.println("Informe a segunda nota do Aluno:");
                sNota[i] = in.nextDouble();
                
            }
        }
    }

    public static boolean testeStringNome (String  nome, int tamanho){
        char letra;
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            letra = nome.charAt(i);
            letra = Character.toLowerCase(letra);
            //verifica se há letras ou espaços em branco e conta
            if(Character.isLetter(letra)==true || letra == ' '){
                cont++;
            }
        }
        //se o contador tiver o msm tamanho da String então é nome
        if(cont == tamanho){
            return true;
        }
        //se não não é nome
        else{
            return false;
        }
    }

    public static double [] calculaMedia (double [] pN, double [] sN, double [] med, String [] sit){
        int i;
        for (i=0;i<med.length;i++){
            med[i] = (pN[i] * 2 + sN[i] * 3) / 5;
            if(med[i] < 3){
                sit[i] = "reprovado";
            }
            else if(med[i] > 7){
                sit[i] = "aprovado";
            }
            else{
                sit[i] = "em recuperação";
            }
        }
        return med;
    }
    
    public static int procuraAluno (String [] nome){
        Scanner in = new Scanner (System.in);
        String procurado;
        boolean resultado;
        int tamanho;
        System.out.println("Informe o nome do aluno que deseja procurar:");
        procurado = in.nextLine();
        tamanho = procurado.length();
        resultado = testeStringNome(procurado,tamanho);
        if(resultado == false){
            System.out.println("Dado inválido. Digite novamente.");
            procuraAluno(nome);
        }
        else{
            for (int i = 0; i < nome.length; i++) {
                if(procurado.equalsIgnoreCase(nome[i])){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static void exibeAlunoprocurado (String [] nome, double [] media, String [] situacao, int resultado){
        System.out.println("O aluno "+nome[resultado]+" obteve a média "+media[resultado]+" e foi "+situacao[resultado]+".");
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
    

    

    

    

