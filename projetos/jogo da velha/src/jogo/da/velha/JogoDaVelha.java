
package jogo.da.velha;

import java.security.SecureRandom;
import java.util.Scanner;


public class JogoDaVelha {

    
    public static void main(String[] args) {
        tela();
    }
    public static void tela (){
        Scanner in = new Scanner(System.in);
        int resp;
        System.out.println("Jogo da Velha");
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        System.out.println("Digite a sua opção: ");
        resp = in.nextInt();
        switch(resp){
            case 1: telaJogo();
            break;
            case 2:System.out.println("Jogo encerrado.");
            break;
            default: System.out.println("Dado inválido, digite novamente.");
            tela();
            break;
        }
    }
    public static void telaJogo(){
        Scanner in = new Scanner(System.in);
        int resp;
        char [][] jogoDaVelha = new char [3][3];
        System.out.println("Jogo da Velha");
        System.out.println("1 - 1 Jogador");
        System.out.println("2 - 2 Jogadores");
        resp = in.nextInt();
        switch(resp){
            case 1: jogadorContraComputador(jogoDaVelha);
            break;
            case 2: JogadorXJogador(jogoDaVelha);
            break;
            default: System.out.println("Dado inválido, digite novamente.");
                tela();
                break;
                
            
        }
    }
    public static void jogadorContraComputador(char [] [] jogo){
        Scanner in = new Scanner(System.in);
        String jogador;
        String ia = "Computador";
        int resp;
        System.out.println("Digite o nome do jogador: ");
        jogador = in.next();
        System.out.println("Nível do jogo:");
        System.out.println("1-Fácil");
        System.out.println("2-Difícil");
        System.out.println("Digite 1 para o nível fácil ou 2 para o nível difícil: ");
        resp = in.nextInt();
        switch(resp){
            case 1:
                modoFacil(jogo,jogador,ia);
                break;
            case 2:
                modoDificil(jogo,jogador,ia);
                break;
            default:
                System.out.println("Dado inválido. Digite novamente.");
                jogadorContraComputador(jogo);
        }
        
    }
    public static void modoFacil (char [][] jogoDaVelha, String nome, String ia){
        int qtd;
        int ganho = 0;
        int ganho2 = 0;
        int jogadores;
        System.out.println("X-"+nome);
        System.out.println("O-"+ia);
        SecureRandom random = new SecureRandom();
        jogadores = random.nextInt(2)+1;
        
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar ... "+nome); 
        }
        else{
           System.out.println("Sorteando quem vai começar ... "+ia);
        }
        do{
            qtd = preencherMatModoFacil(jogoDaVelha, jogadores, nome, ia);
            for (int l = 0; l < jogoDaVelha.length; l++)  {
            for (int c = 0; c < jogoDaVelha[l].length; c++)     { 
                System.out.print(jogoDaVelha[l][c]+ "\t"); // saída
            }
      }
            if(jogadores==1){
            ganho = acertos(jogoDaVelha,jogadores);
            }else{
                ganho2 = acertos(jogoDaVelha, jogadores);
            } if(jogadores==1){
            jogadores=jogadores++;
        }else{
                jogadores=jogadores--;
            }
}while(qtd!=9 && ganho!=1 && ganho2!=1);
        System.out.println();
        if(qtd==9){
            System.out.println("Empate!");
        }
        else if(ganho==1){
            System.out.println("O jogador "+nome+" venceu.");
        }
        else if (ganho2==1){
            System.out.println("O jogador "+ia+" venceu.");
        }
        tela();
    }
    public static int acertos (char [][] jogoDaVelha, int jogador){
        int [] ganhali = new int[3];
        int [] ganhaC = new int [3];
        int ganhaDiagonalPrincipal = 0;
        int ganhaDiagonalSecundaria = 0;
        int i, j;
        if(jogador==1){
         for ( i = 0; i < jogoDaVelha.length; i++) {            // ganhar por linha
                for ( j = 0; j < jogoDaVelha[0].length; j++) {
                    if(jogoDaVelha[i][j]=='X'){
                        ganhali[i] = ganhali[i]++;
                    }
                }
            }
            for ( i = 0; i < ganhali.length; i++) {
                if(ganhali[i]==3){
                    return 1;
                }
            }
            
            for ( i = 0; i < jogoDaVelha[0].length; i++) {      // ganhar por coluna
                for ( j = 0; j < jogoDaVelha.length; j++) {
                    if(jogoDaVelha[j][i]=='X'){
                        ganhaC[i] = ganhaC[i]++;
                    }
                }
            }
            for ( i = 0; i < ganhaC.length; i++) {
                if(ganhaC[i]==3){
                    return 1;
                }
            }
           
            for ( i = 0; i < jogoDaVelha.length; i++) {               // vencer pela diagonal principal
                for ( j = 0; j < jogoDaVelha[0].length; j++) {
                    if(i==j && jogoDaVelha[i][j]=='X'){
                       ganhaDiagonalPrincipal = ganhaDiagonalPrincipal++; 
                    }
                }
            }
            if(ganhaDiagonalPrincipal==3){
                return 1;
            }
                                                                      //vencer pela diagonal secundária
            if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][0]=='X'){
                return 1;
            }
        }
        else{
            
            for ( i = 0; i < jogoDaVelha.length; i++) {           //ganhar pela linha
                for ( j = 0; j < jogoDaVelha[0].length; j++) {
                    if(jogoDaVelha[i][j]=='O'){
                        ganhali[i] = ganhali[i]++;
                    }
                }
            }
            for ( i = 0; i < ganhali.length; i++) {
                if(ganhali[i]==3){
                    return 1;
                }
            }
                                                                   //ganhar pela coluna
            for ( i = 0; i < jogoDaVelha[0].length; i++) {
                for ( j = 0; j < jogoDaVelha.length; j++) {
                    if(jogoDaVelha[j][i]=='O'){
                        ganhaC[i] = ganhaC[i]++;
                    }
                }
            }
            for ( i = 0; i < ganhaC.length; i++) {
                if(ganhaC[i]==3){
                    return 1;
                }
            }
                                                                    //ganhar pela diagonal principal
            for ( i = 0; i < jogoDaVelha.length; i++) {
                for ( j = 0; j < jogoDaVelha[0].length; j++) {
                    if(i==j && jogoDaVelha[i][j]=='O'){
                       ganhaDiagonalPrincipal = ganhaDiagonalPrincipal++; 
                    }
                }
            }
            if(ganhaDiagonalPrincipal==3){
                return 1;
            }
            if(jogoDaVelha[0][2]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[2][0]=='O'){
                return 1;
            }
        }
        return -1;
    }
    public static void modoDificil (char [][] jogoDaVelha,String nome,String ia){
    int qtd = 0;
    int ganho = 0;
    int ganho2 = 0;
    int l, c;
    System.out.println("X-"+nome);
    System.out.println("O-"+ia);
    SecureRandom random = new SecureRandom();
    int jogadores = random.nextInt(2);
    jogadores++;
    if(jogadores==1){
           System.out.println("Sorteando quem vai começar ...... "+nome); 
        }else{
         
           System.out.println("Sorteando quem vai começar ...... "+ia);
        }
    do{
    qtd++;
    preencherMatModoDificil(jogoDaVelha,jogadores,nome,ia);
    System.out.println("Jogo da velha:");
        for ( l = 0; l < jogoDaVelha.length; l++)  {
            for ( c = 0; c < jogoDaVelha[l].length; c++)     { 
                System.out.print(jogoDaVelha[l][c]+ "\t"); 
            }
 }
        if(jogadores==1){
            ganho = acertos(jogoDaVelha,jogadores);
        }
        else{
            ganho2 = acertos(jogoDaVelha,jogadores);
        }
        
        if(jogadores==1){
            jogadores=jogadores+1;
        }
        else{
            jogadores=jogadores-1;
        }
        
        }while(qtd!=9 && ganho!=1 && ganho2!=1);
        System.out.println();
        if(qtd==9){
            System.out.println("Empate.");
        }
        else if(ganho==1){
            System.out.println("O jogador "+nome+" venceu.");
        }
        else if (ganho2==1){
            System.out.println("O jogador "+ia+" venceu.");
        }
        tela();
    }
    public static int preencherMatModoFacil (char [][] jogoDaVelha,int jogador,String nome,String ia){
     int lin,col,qtd = 0;
        Scanner in = new Scanner(System.in);
        if(jogador==1){
            System.out.println(nome+" é sua vez de jogar.");
            System.out.println("Informe a linha:");
            lin = in.nextInt();
            while(lin<1||lin>3){
                System.out.println("Dado inválido. Digite novamente.");
                System.out.println("Informe a linha:");
                lin = in.nextInt();
            }
            System.out.println("Informe a coluna:");
            col = in.nextInt();
            while(col<1||col>3){
                System.out.println("Dado inválido. Digite novamente.");
                System.out.println("Informe a coluna:");
                col = in.nextInt();
            }
            if(jogoDaVelha[lin-1][col-1]=='X'||jogoDaVelha[lin-1][col-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                qtd = preencherMatModoFacil(jogoDaVelha,jogador,nome,ia);
            }
            else{
            jogoDaVelha[lin-1][col-1] = 'X';
            qtd++;
            }
        }
        else{
            SecureRandom random = new SecureRandom();
            int linha = random.nextInt(3)+1;
            int coluna = random.nextInt(3)+1;
            if(jogoDaVelha[linha-1][coluna-1]=='X'||jogoDaVelha[linha-1][coluna-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                qtd = preencherMatModoFacil(jogoDaVelha,jogador,nome,ia);
            }
            else{
                jogoDaVelha[linha-1][coluna-1] = 'O';
                qtd++;
            }
        }
        return qtd;
 }
    public static void preencherMatModoDificil(char [][] jogoDaVelha, int jogador, String nome, String ia){
     int l, c;
     int jogadaCentro;
     Scanner in = new Scanner (System.in);
     if(jogador == 1){
         System.out.println("Vez de " + nome);   
         System.out.println("Informe a linha: ");
         l = in.nextInt();
         while(l < 1 || l > 3){
             System.out.println("Linha inválida, digite novamente: ");
             l = in.nextInt();
    }
         System.out.println("Informe a coluna: ");
         c = in.nextInt();
         while(c < 1 || c > 3){
             System.out.println("Coluna inválida, digite novamente: ");
             c = in.nextInt();
         }
         if(jogoDaVelha[l-1][c-1] == 'X'||jogoDaVelha[l-1][c-1]=='O'){
             System.out.println("Posição já preenchida.");
             preencherMatModoFacil(jogoDaVelha,jogador,nome,ia);
         }else{
             jogoDaVelha[l-1][c-1] = 'X';
         }
         }else{
          if(jogoDaVelha[1][1]=='X'||jogoDaVelha[1][1]=='O'){
                jogadaCentro = 1;
            }else{
              jogadaCentro = -1;
            }
            if(jogadaCentro==-1){
                jogoDaVelha[1][1]='O';
            }
            else{
            //jogadas ofensivas
            //linha 1
            if(jogoDaVelha[0][0]=='O' && jogoDaVelha[0][1]=='O' && jogoDaVelha[0][2]==0){
                jogoDaVelha[0][2]='O';
            }
            else if(jogoDaVelha[0][0]=='O' && jogoDaVelha[0][1]==0 && jogoDaVelha[0][2]=='O'){
                jogoDaVelha[0][1]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[0][1]=='O' && jogoDaVelha[0][2]=='O'){
                jogoDaVelha[0][0]='O';
            }
            //linha 2
            else if(jogoDaVelha[1][0]=='O' && jogoDaVelha[1][1]=='O' && jogoDaVelha[1][2]==0){
                jogoDaVelha[1][2]='O';
            }
            else if(jogoDaVelha[1][0]=='O' && jogoDaVelha[1][1]==0 && jogoDaVelha[1][2]=='O'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[1][0]==0 && jogoDaVelha[1][1]=='O' && jogoDaVelha[1][2]=='O'){
                jogoDaVelha[1][0]='O';
            }
            else if(jogoDaVelha[2][0]=='X' && jogoDaVelha[2][1]=='X' && jogoDaVelha[2][2]==0){   // linha 3
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[2][0]=='X' && jogoDaVelha[2][1]==0 && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[2][1]='O';
            }
            else if(jogoDaVelha[2][0]==0 && jogoDaVelha[2][1]=='X' && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[2][0]='O';
            }
            //coluna 1
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][0]=='X' && jogoDaVelha[2][0]==0){
                jogoDaVelha[2][0]='O';
            }
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][0]==0 && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[1][0]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[1][0]=='X' && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[0][0]='O';
            }
            //coluna 2
            else if(jogoDaVelha[0][1]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][1]==0){
                jogoDaVelha[2][1]='O';
            }
            else if(jogoDaVelha[0][1]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][1]=='X'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][1]==0 && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][1]=='X'){
                jogoDaVelha[0][1]='O';
            }
            //coluna 3
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][2]=='X' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][2]==0 && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[1][2]='O';
            }
            else if(jogoDaVelha[0][2]==0 && jogoDaVelha[1][2]=='X' && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[0][2]='O';
            }
            //diagonal principal
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][2]==0){
                jogoDaVelha[2][2]='O';
            }
            else if(jogoDaVelha[0][0]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][0]==0 && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][2]=='X'){
                jogoDaVelha[0][0]='O';
            }
            //diagonal secundária
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][0]==0){
                jogoDaVelha[2][0]='O';
            }
            else if(jogoDaVelha[0][2]=='X' && jogoDaVelha[1][1]==0 && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[1][1]='O';
            }
            else if(jogoDaVelha[0][2]==0 && jogoDaVelha[1][1]=='X' && jogoDaVelha[2][0]=='X'){
                jogoDaVelha[0][2]='O';
            }
            //jogadas de empate
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
            if(jogoDaVelha[linha--][coluna--]=='X'||jogoDaVelha[linha-1][coluna-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                preencherMatModoDificil(jogoDaVelha,jogador,nome,ia);
            }
            else{
                jogoDaVelha[linha-1][coluna-1] = 'O';
            }
        }
        }
    }
                         

              
              
     }
    public static void JogadorXJogador(char [][] jogoDaVelha){
        Scanner in = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        String jogador1;
        String jogador2;
        int jogador;
        int ganho = 0;
        int ganho2 = 0;
        int qtd = 0;
        int jogadores;
        System.out.println("Digite o nome do primeiro jogador: ");
        jogador1 = in.next();
        System.out.println("Digite o nome do segundo jogador: ");
        jogador2 = in.next();
        System.out.println("X-"+jogador1);
        System.out.println("O-"+jogador2);
        jogadores = random.nextInt(2);
        jogadores++;
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar ... "+jogador1); 
        }
        else{
           System.out.println("Sorteando quem vai começar ... "+jogador2);
        }
        jogador = jogadores;
        do{
        qtd = preencheMatJogadorXJogador(jogoDaVelha,jogador,jogador1,jogador2);
        System.out.println();
        //mostra a matriz
        System.out.println("Jogo da velha:");
        for (int l = 0; l < jogoDaVelha.length; l++)  {
            for (int c = 0; c < jogoDaVelha[l].length; c++)     { 
                System.out.print(jogoDaVelha[l][c]+ "\t"); // saída
            }  
        System.out.println();
        }
        //descobrir se alguem ganhou
        if(jogador==1){
            ganho = acertos(jogoDaVelha,jogador);
        }
        else{
            ganho2 = acertos(jogoDaVelha,jogador);
        }
        //para o loop funcionar
        if(jogador==1){
            jogador=jogador+1;
        }
        else{
            jogador=jogador-1;
        }
        
        }while(qtd!=9 && ganho!=1 && ganho2!=1);
        System.out.println();
        if(qtd==9){
            System.out.println("Empate.");
        }
        else if(ganho==1){
            System.out.println("O jogador "+jogador1+" venceu.");
        }
        else if (ganho2==1){
            System.out.println("O jogador "+jogador2+" venceu.");
        }
        tela();
    }
    public static int preencheMatJogadorXJogador(char[][] jogoDaVelha, int jogador, String jogador1, String jogador2){
        int l, c;
        int qtd = 0;
        Scanner in = new Scanner (System.in);
        if(jogador == 1){
            System.out.println("Vez de " + jogador1);
            System.out.println("Digite a linha: ");
            l = in.nextInt();
            while(l < 1 || l > 3){
                System.out.println("Linha inválida, digite novamente: ");
                l = in.nextInt();
            }
            System.out.println("Digite a coluna: ");
            c = in.nextInt();
            while(c < 1 || c > 3){
                System.out.println("Coluna inválida, digite novamente: ");
                c = in.nextInt();
            }
            if(jogoDaVelha[l-1][c-1]=='X'||jogoDaVelha[l-1][c-1]=='O'){
                System.out.println("Posição já preenchida.");
                qtd = preencheMatJogadorXJogador(jogoDaVelha,jogador,jogador1,jogador2);
            }else{
                jogoDaVelha[l- 1][c- 1] = 'X';
                qtd++;
            }
        
        }else{
            System.out.println("Vez de " + jogador2);
            System.out.println("Digite a linha: ");
            l = in.nextInt();
            while(l < 1 || l > 3){
                System.out.println("Linha inválida, digite novamente: ");
                l = in.nextInt();
            }
            System.out.println("Digite a coluna: ");
            c = in.nextInt();
            while(c < 1 || c > 3){
                System.out.println("Coluna inválida, digite novamente: ");
                c = in.nextInt();
            }
            if(jogoDaVelha[l-1][c-1]=='O'||jogoDaVelha[l-1][c-1]=='X'){
                System.out.println("Posição já preenchida.");
                qtd = preencheMatJogadorXJogador(jogoDaVelha,jogador,jogador1,jogador2);
            }else{
                jogoDaVelha[l-1][c-1] = 'O';
                qtd++;
            }
        }
        return qtd;
        
    }    
    }
     
    

     



     



            
    

    
    


