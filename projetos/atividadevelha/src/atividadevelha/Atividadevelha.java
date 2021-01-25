
package atividadevelha;

import java.security.SecureRandom;
import java.util.Scanner;
public class Atividadevelha {

    public static void main(String[] args) {
     tela();
    }
     public static void tela (){
        Scanner in = new Scanner(System.in);
        int op;
        System.out.println("Jogo da Velha");
        System.out.println("1-Jogar");
        System.out.println("2-Sair");
        System.out.println("Digite sua opção:");
        op = in.nextInt();
        switch(op){
            case 1:
                telaJogo();
                break;
            case 2:
                System.out.println("Jogo encerrado.");
                break;
            default:
                System.out.println("Dado inválido. Digite novamente.");
                tela();
                break;
        }
    
}
     public static void telaJogo(){
         Scanner in = new Scanner(System.in);
        int op;
        char [][] jogo = new char [3][3];
        System.out.println("Jogo da Velha");
        System.out.println("1-Um jogador");
        System.out.println("2-Dois jogadores");
        System.out.println("Digite sua opção:");
        op = in.nextInt();
        switch(op){
            case 1:
                JogadorXComputador(jogo);
                break;
            case 2:
                JogadorXJogador(jogo);
                break;
            default:
                System.out.println("Dado inválido. Digite novamente.");
                tela();
                break;
        }
         
     }
     public static void JogadorXJogador(char [] [] jogoDaVelha){
        Scanner in = new Scanner(System.in);
        String jogador1, jogador2;
        SecureRandom aleatorio = new SecureRandom();
        int jogador;
        int ganho1 = 0;    
        int ganho2= 2;
        int qtd=0;
        System.out.println("Digite o nome do jogador 1:");
        jogador1 = in.next();
        System.out.println("Digite o nome do jogador 2:");
        jogador2 = in.next();
        System.out.println();
        System.out.println("X-"+ jogador1);
        System.out.println("O-"+ jogador2);
        System.out.println();
        int jogadores = aleatorio.nextInt(2)+1;
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar--- "+jogador1); 
        }
        else{
           System.out.println("Sorteando quem vai começar---"+ jogador2);
        System.out.println();
        jogador=jogadores;
        do{
        qtd = preencheMatrizJogadorXJogador(jogoDaVelha,jogador,jogador1,jogador2);
        System.out.println();
        //mostra a matriz
        System.out.println("Jogo da velha:");
        for (int l = 0; l < jogoDaVelha.length; l++)  {
            for (int c = 0; c < jogoDaVelha[l].length; c++)     { 
                System.out.print(jogoDaVelha[l][c]+ "\t"); 
            }  
        System.out.println();
        }
        //descobrir se alguem ganhou
        if(jogador==1){
            ganho1 = acerto(jogoDaVelha,jogador);
        }
        else{
            ganho2 = acerto(jogoDaVelha,jogador);
        }
                                                           //para o loop funcionar
        if(jogador==1){
            jogador=jogador+1;
        }
        else{
            jogador=jogador-1;
        }
        
        }while(qtd!=9 && ganho1!=1 && ganho2!=1);
        System.out.println();
        if(qtd==9){
            System.out.println("Empate.");
        }
        else if(ganho1==1){
            System.out.println( jogador1+" venceu.");
        }
        else if (ganho2==1){
            System.out.println( jogador2+" venceu.");
        }
        tela();
     
}
    
}
     public static int acerto (char [][] jogoDaVelha, int jogador){
        int [] l = new int[3];
        int [] c = new int [3];
        int diagonalprincipal = 0,diagonalsecundaria = 0;
        int i, j;
        if(jogador==1){
            for ( i = 0; i < jogoDaVelha.length; i++) {
                for ( j = 0; j < jogoDaVelha[0].length; j++) {                    //gahar pela linha
                    if(jogoDaVelha[i][j]=='X'){
                        l[i] = l[i] + 1;
                    }
                }
            }
            for ( i = 0; i < l.length; i++) {
                if(l[i]==3){
                    return 1;
                }
            }
                                                                                     //ganhar pela coluna
            for ( i = 0; i < jogoDaVelha[0].length; i++) {
                for ( j = 0; j < jogoDaVelha.length; j++) {
                    if(jogoDaVelha[j][i]=='X'){
                        c[i] = c[i] + 1;
                    }
                }
            }
            for ( i = 0; i < c.length; i++) {
                if(c[i]==3){
                    return 1;
                }
            }
                                                                                        //ganhar pela diagonal principal
            for ( i = 0; i < jogoDaVelha.length; i++) {
                for ( j = 0; j < jogoDaVelha[0].length; j++) {
                    if(i==j && jogoDaVelha[i][j]=='X'){
                       diagonalprincipal = diagonalprincipal + 1; 
                    }
                }
            }
            if(diagonalprincipal==3){
                return 1;
            }
                                                                                            //ganhar pela diagonal secundária
            if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][0]=='X'){
                return 1;
            }
        }
           else{
                                                                                                 //ganhar pela linha
            for ( i = 0; i < jogoDaVelha.length; i++) {
                for ( j = 0; j < jogoDaVelha[0].length; j++) {
                    if(jogoDaVelha[i][j]=='O'){
                        l[i] = l[i] + 1;
                    }
                }
            }
            for ( i = 0; i < l.length; i++) {
                if(l[i]==3){
                    return 1;
                }
            }
                                                                                                         //ganhar pela coluna
            for ( i = 0; i < jogoDaVelha[0].length; i++) {
                for ( j = 0; j < jogoDaVelha.length; j++) {
                    if(jogoDaVelha[j][i]=='O'){
                        c[i] = c[i] + 1;
                    }
                }
            }
            for ( i = 0; i < c.length; i++) {
                if(c[i]==3){
                    return 1;
                }
            }
                                                                                                     //ganhar pela diagonal principal
            for ( i = 0; i < jogoDaVelha.length; i++) {
                for ( j = 0; j < jogoDaVelha[0].length; j++) {
                    if(i==j && jogoDaVelha[i][j]=='O'){
                       diagonalprincipal = diagonalprincipal + 1; 
                    }
                }
            }
            if(diagonalprincipal==3){
                return 1;
            }
            if(jogoDaVelha[0][2]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][0]=='O'){
                return 1;
            }
        }
        return -1;
    }
     public static int preencheMatrizJogadorXJogador (char [][] jogoDaVelha,int jogador,String jogador1,String jogador2){
        int l;
        int c;
        int qtd = 0;
        Scanner in = new Scanner(System.in);
            if(jogador==1){
            System.out.println("Vez de" + jogador1);
            System.out.println("Informe a linha:");
            l = in.nextInt();
            while(l<1||l>3){
                System.out.println("Dado inválido, informe a linha: ");
              
                l = in.nextInt();
            }
            System.out.println("Informe a coluna:");
            c = in.nextInt();
            while(c<1||c>3){
                System.out.println("Dado inválido, informe a coluna: ");
                
                c = in.nextInt();
            }
            if(jogoDaVelha[l-1][c-1]=='X'||jogoDaVelha[l-1][c-1]=='O'){
                System.out.println(" posição já preenchida.");
                qtd = preencheMatrizJogadorXJogador(jogoDaVelha,jogador,jogador1,jogador2);
            }
            else{
            jogoDaVelha[l-1][c-1] = 'X';
            qtd++;
            }
        }
        else{
            System.out.println("Vez de " + jogador2);
            System.out.println("Informe a linha:");
            l = in.nextInt();
            while(l<1||l>3){
                System.out.println("Dado inválido, informe a linha: ");
              
                l = in.nextInt();
            }
            System.out.println("Informe a coluna:");
            c = in.nextInt();
            while(c<1||c>3){
                System.out.println("Dado inválido, informe a coluna:");
                
                c = in.nextInt();
            }
            if(jogoDaVelha[l-1][c-1]=='O'||jogoDaVelha[l-1][c-1]=='X'){
                System.out.println(" posição já preenchida.");
                qtd = preencheMatrizJogadorXJogador(jogoDaVelha,jogador,jogador1,jogador2);
            }
            else{
            jogoDaVelha[l-1][c-1] = 'O';
            qtd++;
            }
        }
        return qtd;
     }
     public static void JogadorXComputador(char[][] jogoDaVelha){
          Scanner in = new Scanner(System.in);
        String nomeJogador,computador="Computador";
        int op;
        System.out.println("Informe o nome do jogador:");
        nomeJogador = in.next();
        System.out.println("Nível do jogo:");
        System.out.println("1-Fácil");
        System.out.println("2-Difícil");
        System.out.println("Digite sua opção:");
        op = in.nextInt();
                switch(op){
            case 1:
                Facil(jogoDaVelha,nomeJogador,computador);
                break;
            case 2:
                Dificil(jogoDaVelha,nomeJogador,computador);
                break;
            default:
                System.out.println("Dado inválido. Digite novamente.");
                JogadorXComputador(jogoDaVelha);
        }
     }
     public static void Facil (char [][] jogoDaVelha, String nome,String ia){
         int qtd = 0 ;
         int ganho1 = 0;
         int ganho2 = 0;
         int jogadores;
        System.out.println();
        System.out.println("X-"+nome);
        System.out.println("O-"+ia);
        System.out.println();
        SecureRandom random = new SecureRandom();
        jogadores = random.nextInt(2)+1;
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar ----- "+nome); 
        }
        else{
           System.out.println("Sorteando quem vai começar ---- "+ia);
        }
        System.out.println();
        do{
        qtd = preencherMatrizFacil(jogoDaVelha,  jogadores,nome,ia);
        System.out.println();
        //mostra a matriz
        System.out.println("Jogo da velha:");
        for (int l = 0; l < jogoDaVelha.length; l++)  {
            for (int c = 0; c < jogoDaVelha[l].length; c++)     { 
                System.out.print(jogoDaVelha[l][c]+ "\t"); // /t tabula a saída
            }  
        System.out.println();
        }
        //descobrir se alguem ganhou
        if(jogadores==1){
            ganho1 = acerto(jogoDaVelha,jogadores);
        }
        else{
            ganho2 = acerto(jogoDaVelha,jogadores);
        }
        //para o loop funcionar
        if(jogadores==1){
            jogadores=jogadores+1;
        }
        else{
            jogadores=jogadores-1;
        }
        
        }while(qtd!=9 && ganho1!=1 && ganho2!=1);
        System.out.println();
        if(qtd==9){
            System.out.println("Empate.");
        }
        else if(ganho1==1){
            System.out.println(nome+" venceu.");
        }
        else if (ganho2==1){
            System.out.println(ia+" venceu.");
        }
        tela();

         
     }
     public static int preencherMatrizFacil (char[][] jogoDaVelha, int jogador, String nome, String ia){
         int l, c;
         int qtd = 0;
         Scanner in = new Scanner(System.in);
         SecureRandom random = new SecureRandom();
         if(jogador==1){
            System.out.println("Vez de " + nome);
            System.out.println("Informe a linha:");
            l = in.nextInt();
            while(l<1||l>3){
                System.out.println("Dado inválido, informe a linha:");
                
                l = in.nextInt();
            }
            System.out.println("Informe a coluna:");
            c = in.nextInt();
            while(c<1||c>3){
                System.out.println("Dado inválido, informe a coluna: ");
                
                c = in.nextInt();
            }
            if(jogoDaVelha[l-1][c-1]=='X'||jogoDaVelha[l-1][c-1]=='O'){
                System.out.println(" Posição já preenchida.");
                qtd = preencherMatrizFacil(jogoDaVelha,jogador,nome,ia);
            }
            else{
            jogoDaVelha[l-1][c-1] = 'X';
            qtd++;
            }
        }
        else{
            
            int linha = random.nextInt(3)+1;
            int coluna = random.nextInt(3)+1;
            if(jogoDaVelha[linha-1][coluna-1]=='X'||jogoDaVelha[linha-1][coluna-1]=='O'){
                System.out.println(" Posição já preenchida.");
                qtd = preencherMatrizFacil(jogoDaVelha,jogador,nome,ia);
            }
            else{
                jogoDaVelha[linha-1][coluna-1] = 'O';
                qtd++;
            }
        }
        return qtd;
     }
     public static void Dificil (char [][] jogoDaVelha, String nome, String ia){
         int ganho1 = 0;
         int ganho2 = 0;
         int qtd = 0;
         int jogadores;
         SecureRandom random = new SecureRandom();
         System.out.println();
         System.out.println("X - "+ nome);
         System.out.println("O - "+ ia);
         System.out.println("");
         jogadores = random.nextInt(2)+1;
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar --- "+nome); 
        }
        else{
           System.out.println("Sorteando quem vai começar --- "+ia);
        }
        System.out.println();
        do{
        qtd++;
        preencherMatrizDificil(jogoDaVelha,jogadores,nome,ia);
        System.out.println();
        System.out.println("Jogo da velha:");
        for (int l = 0; l < jogoDaVelha.length; l++)  {
            for (int c = 0; c < jogoDaVelha[l].length; c++)     { 
                System.out.print(jogoDaVelha[l][c]+ "\t"); 
            }  
        System.out.println();
        }
       if(jogadores==1){
            ganho1 = acerto(jogoDaVelha,jogadores);
        }
        else{
            ganho2 = acerto(jogoDaVelha,jogadores);
        }
       if(jogadores==1){
            jogadores=jogadores+1;
        }
        else{
            jogadores=jogadores-1;
        }
        
        }while(qtd!=9 && ganho1!=1 && ganho2!=1);
        System.out.println();
        if(qtd==9){
            System.out.println("Empate!");
        }
        else if(ganho1==1){
            System.out.println(nome+" venceu.");
        }
        else if (ganho2==1){
            System.out.println(ia+" venceu.");
        }
        tela();
    }
     public static void preencherMatrizDificil (char [][] jogoDaVelha,  int jogador,String nome, String ia){
         int l, c;
         int jogadaCentro;
         Scanner in = new Scanner(System.in);
         if(jogador==1){
            System.out.println("Vez de " + nome);
            System.out.println("Informe a linha:");
            l = in.nextInt();
            while(l<1||l>3){
                System.out.println("Dado inválido, informe a linha");
                l = in.nextInt();
            }
            System.out.println("Informe a coluna:");
            c = in.nextInt();
            while(c<1||c>3){
                System.out.println("Dado inválido, informe a coluna:");
                c = in.nextInt();
            }
            if(jogoDaVelha[l-1][c-1]=='X'||jogoDaVelha[l-1][c-1]=='O'){
                System.out.println(" Posição já preenchida.");
                preencherMatrizFacil(jogoDaVelha, jogador,nome,ia);
            }
            else{
            jogoDaVelha[l-1][c-1] = 'X';
            }
        }
        else{
                                                                     
            if(jogoDaVelha[1][1]=='X'||jogoDaVelha[1][1]=='O'){
                jogadaCentro = 1;
            }
            else{
                jogadaCentro = -1;
            }
            if(jogadaCentro==-1){
                jogoDaVelha[1][1]='O';
            }
            else{
            
            if(jogoDaVelha[0][0]=='O' && jogoDaVelha[0][1]=='O' && jogoDaVelha[0][2]==0){
                jogoDaVelha[0][2]='O';
            }
            else if(jogoDaVelha[0][0]=='O' && jogoDaVelha[0][1]==0 && jogoDaVelha[0][2]=='O'){
                jogoDaVelha[0][1]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[0][1]=='O' && jogoDaVelha[0][2]=='O'){
                jogoDaVelha[0][0]='O';
            }
            
            else if(jogoDaVelha[1][0]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[1][2]==0){
                jogoDaVelha[1][2]='O';
            }
            else if(jogoDaVelha[1][0]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[1][2]=='X'){
                jogoDaVelha[1][1]='O';            
                
            }
            else if(jogoDaVelha[1][0]==0 && jogoDaVelha[1][1]=='O' && jogoDaVelha[1][2]=='O'){
                jogoDaVelha[1][0]='O';
            }
          
            else if(jogoDaVelha[2][0]=='O' && jogoDaVelha[2][1]=='O' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[2][0]=='O' && jogoDaVelha[2][1]==0 && jogoDaVelha[2][2]=='O'){
                jogoDaVelha[2][1]='O';
            }
            else if(jogoDaVelha[2][0]==0 && jogoDaVelha[2][1]=='O' && jogoDaVelha[2][2]=='O'){
                jogoDaVelha[2][0]='O';
            }
            
            else if(jogoDaVelha[0][0]=='O' && jogoDaVelha[1][0]=='O' && jogoDaVelha[2][0]==0){
                jogoDaVelha[2][0]='O';
            }
            else if(jogoDaVelha[0][0]=='O' && jogoDaVelha[1][0]==0 && jogoDaVelha[2][0]=='O'){
                jogoDaVelha[1][0]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[1][0]=='O' && jogoDaVelha[2][0]=='O'){
                jogoDaVelha[0][0]='O';
            }
           
            else if(jogoDaVelha[0][1]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][1]==0){
                jogoDaVelha[2][1]='O';
            }
            else if(jogoDaVelha[0][1]=='O' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][1]=='O'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][1]==0 && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][1]=='O'){
                jogoDaVelha[0][1]='O';
            }
            
            else if(jogoDaVelha[0][2]=='O' && jogoDaVelha[1][2]=='O' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[0][2]=='O' && jogoDaVelha[1][2]==0 && jogoDaVelha[2][2]=='O'){
                jogoDaVelha[1][2]='O';
            }
            else if(jogoDaVelha[0][2]==0 && jogoDaVelha[1][2]=='O' && jogoDaVelha[2][2]=='O'){
                jogoDaVelha[0][2]='O';
            }
            
            else if(jogoDaVelha[0][0]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[0][0]=='O' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][2]=='O'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][2]=='O'){
                jogoDaVelha[0][0]='O';
            }
          
            else if(jogoDaVelha[0][2]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][0]==0){
                jogoDaVelha[2][0]='O';
            }
            else if(jogoDaVelha[0][2]=='O' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][0]=='O'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][2]==0 && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][0]=='O'){
                jogoDaVelha[0][2]='O';
            }
            
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[0][1]=='X' && jogoDaVelha[0][2]==0){
                jogoDaVelha[0][2]='O';
            }
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[0][1]==0 && jogoDaVelha[0][2]=='X'){
                jogoDaVelha[0][1]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[0][1]=='X' && jogoDaVelha[0][2]=='X'){
                jogoDaVelha[0][0]='O';
            }
            
            else if(jogoDaVelha[1][0]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[1][2]==0){
                jogoDaVelha[1][2]='O';
            }
            else if(jogoDaVelha[1][0]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[1][2]=='X'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[1][0]==0 && jogoDaVelha[1][1]=='X' && jogoDaVelha[1][2]=='X'){
                jogoDaVelha[1][0]='O';
            }
            
            else if(jogoDaVelha[2][0]=='X' && jogoDaVelha[2][1]=='X' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[2][0]=='X' && jogoDaVelha[2][1]==0 && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[2][1]='O';
            }
            else if(jogoDaVelha[2][0]==0 && jogoDaVelha[2][1]=='X' && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[2][0]='O';
            }
            
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][0]=='X' && jogoDaVelha[2][0]==0){
                jogoDaVelha[2][0]='O';
            }
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][0]==0 && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[1][0]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[1][0]=='X' && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[0][0]='O';
            }
            
            else if(jogoDaVelha[0][1]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][1]==0){
                jogoDaVelha[2][1]='O';
            }
            else if(jogoDaVelha[0][1]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][1]=='X'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][1]==0 && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][1]=='X'){
                jogoDaVelha[0][1]='O';
            }
          
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][2]=='X' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][2]==0 && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[1][2]='O';
            }
            else if(jogoDaVelha[0][2]==0 && jogoDaVelha[1][2]=='X' && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[0][2]='O';
            }
            
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[0][0]='O';
            }
           
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][0]==0){
                jogoDaVelha[2][0]='O';
            }
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][2]==0 && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[0][2]='O';
            }
           
            else if(jogoDaVelha[0][1]==0){
                jogoDaVelha[0][1]='O';
            }
            else if(jogoDaVelha[2][1]==0){
                jogoDaVelha[2][1]='O';
            }
            else if(jogoDaVelha[1][0]==0){
                jogoDaVelha[1][0]='O';
            }
            else if(jogoDaVelha[1][2]==0){
                jogoDaVelha[1][2]='O';
            }
            else{
            SecureRandom aleatorio = new SecureRandom();
            int linha = aleatorio.nextInt(3)+1;
            int coluna = aleatorio.nextInt(3)+1;
            if(jogoDaVelha[linha-1][coluna-1]=='X'||jogoDaVelha[linha-1][coluna-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                preencherMatrizDificil(jogoDaVelha,jogador,nome,ia);
            }
            else{
                jogoDaVelha[linha-1][coluna-1] = 'O';
            }
        }
        }
    }
     }
     }
    
        

     

