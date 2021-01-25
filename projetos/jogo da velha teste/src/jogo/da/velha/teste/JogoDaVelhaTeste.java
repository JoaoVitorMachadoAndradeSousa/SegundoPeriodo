
package jogo.da.velha.teste;

import java.security.SecureRandom;
import java.util.Scanner;


public class JogoDaVelhaTeste {

    public static void main(String[] args) {
        telaInicial();
    
    }
    public static void telaInicial (){
        Scanner in = new Scanner(System.in);
        int op;
        System.out.println("Jogo da Velha");
        System.out.println("1-Jogar");
        System.out.println("2-Sair");
        System.out.println("Digite sua opção:");
        op = in.nextInt();
        switch(op){
            case 1:
                telaPrincipal();
                break;
            case 2:
                System.out.println("O usuário saiu do jogo, volte sempre!");
                break;
            default:
                System.out.println("Dado inválido. Digite novamente.");
                telaInicial();
                break;
        }
    }
    
    public static void telaPrincipal (){
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
                umJogador(jogo);
                break;
            case 2:
                doisJogadores(jogo);
                break;
            default:
                System.out.println("Dado inválido. Digite novamente.");
                telaPrincipal();
                break;
        }
    }
    
    public static void umJogador (char [][] jogo){
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
                jogoFacil(jogo,nomeJogador,computador);
                break;
            case 2:
                jogoDificil(jogo,nomeJogador,computador);
                break;
            default:
                System.out.println("Dado inválido. Digite novamente.");
                umJogador(jogo);
        }
    }
    
    public static void jogoFacil (char [][] jogo,String nome,String pc){
        int qtt,ganho1 = 0,ganho2 = 0;
        System.out.println();
        System.out.println("X-"+nome);
        System.out.println("O-"+pc);
        System.out.println();
        //sorteio de quem começa
        SecureRandom aleatorio = new SecureRandom();
        int jogadores = aleatorio.nextInt(2)+1;
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar ...... "+nome); 
        }
        else{
           System.out.println("Sorteando quem vai começar ...... "+pc);
        }
        System.out.println();
        do{
        qtt = preenchimentoMatriz1JogadorFacil(jogo,jogadores,nome,pc);
        System.out.println();
        //mostra a matriz
        System.out.println("Jogo da velha:");
        for (int l = 0; l < jogo.length; l++)  {
            for (int c = 0; c < jogo[l].length; c++)     { 
                System.out.print(jogo[l][c]+ "\t"); // /t tabula a saída
            }  
        System.out.println();
        }
        //descobrir se alguem ganhou
        if(jogadores==1){
            ganho1 = acertos(jogo,jogadores);
        }
        else{
            ganho2 = acertos(jogo,jogadores);
        }
        //para o loop funcionar
        if(jogadores==1){
            jogadores=jogadores+1;
        }
        else{
            jogadores=jogadores-1;
        }
        
        }while(qtt!=9 && ganho1!=1 && ganho2!=1);
        System.out.println();
        if(qtt==9){
            System.out.println("Empate!");
        }
        else if(ganho1==1){
            System.out.println("O jogador "+nome+" venceu!");
        }
        else if (ganho2==1){
            System.out.println("O jogador "+pc+" venceu!");
        }
        telaInicial();
    }
    
    public static int preenchimentoMatriz1JogadorFacil (char [][] jogo,int jogador,String n,String pc){
        int lin,col,qtd = 0;
        Scanner in = new Scanner(System.in);
        if(jogador==1){
            System.out.println(n+" é sua vez de jogar.");
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
            if(jogo[lin-1][col-1]=='X'||jogo[lin-1][col-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                qtd = preenchimentoMatriz1JogadorFacil(jogo,jogador,n,pc);
            }
            else{
            jogo[lin-1][col-1] = 'X';
            qtd++;
            }
        }
        else{
            SecureRandom aleatorio = new SecureRandom();
            int linha = aleatorio.nextInt(3)+1;
            int coluna = aleatorio.nextInt(3)+1;
            if(jogo[linha-1][coluna-1]=='X'||jogo[linha-1][coluna-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                qtd = preenchimentoMatriz1JogadorFacil(jogo,jogador,n,pc);
            }
            else{
                jogo[linha-1][coluna-1] = 'O';
                qtd++;
            }
        }
        return qtd;
    }
    
    public static void jogoDificil (char [][] jogo,String nome,String pc){
        int qtt = 0,ganho1 = 0,ganho2 = 0;
        System.out.println();
        System.out.println("X-"+nome);
        System.out.println("O-"+pc);
        System.out.println();
        //sorteio de quem começa
        SecureRandom aleatorio = new SecureRandom();
        int jogadores = aleatorio.nextInt(2)+1;
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar ...... "+nome); 
        }
        else{
           System.out.println("Sorteando quem vai começar ...... "+pc);
        }
        System.out.println();
        do{
        qtt++;
        preenchimentoMatriz1JogadorDificil(jogo,jogadores,nome,pc);
        System.out.println();
        //mostra a matriz
        System.out.println("Jogo da velha:");
        for (int l = 0; l < jogo.length; l++)  {
            for (int c = 0; c < jogo[l].length; c++)     { 
                System.out.print(jogo[l][c]+ "\t"); // /t tabula a saída
            }  
        System.out.println();
        }
        //descobrir se alguem ganhou
        if(jogadores==1){
            ganho1 = acertos(jogo,jogadores);
        }
        else{
            ganho2 = acertos(jogo,jogadores);
        }
        //para o loop funcionar
        if(jogadores==1){
            jogadores=jogadores+1;
        }
        else{
            jogadores=jogadores-1;
        }
        
        }while(qtt!=9 && ganho1!=1 && ganho2!=1);
        System.out.println();
        if(qtt==9){
            System.out.println("Empate!");
        }
        else if(ganho1==1){
            System.out.println("O jogador "+nome+" venceu!");
        }
        else if (ganho2==1){
            System.out.println("O jogador "+pc+" venceu!");
        }
        telaInicial();
    }
    
    public static void preenchimentoMatriz1JogadorDificil (char [][] jogo,int jogador,String n,String pc){
        int lin,col,jogador1centro;
        Scanner in = new Scanner(System.in);
        if(jogador==1){
            System.out.println(n+" é sua vez de jogar.");
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
            if(jogo[lin-1][col-1]=='X'||jogo[lin-1][col-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                preenchimentoMatriz1JogadorFacil(jogo,jogador,n,pc);
            }
            else{
            jogo[lin-1][col-1] = 'X';
            }
        }
        else{
            //se o jogador humano jogou no centro
            if(jogo[1][1]=='X'||jogo[1][1]=='O'){
                jogador1centro = 1;
            }
            else{
                jogador1centro = -1;
            }
            if(jogador1centro==-1){
                jogo[1][1]='O';
            }
            else{
            //jogadas ofensivas
            //linha 1
            if(jogo[0][0]=='O' && jogo[0][1]=='O' && jogo[0][2]==0){
                jogo[0][2]='O';
            }
            else if(jogo[0][0]=='O' && jogo[0][1]==0 && jogo[0][2]=='O'){
                jogo[0][1]='O';
            }
            else if(jogo[0][0]==0 && jogo[0][1]=='O' && jogo[0][2]=='O'){
                jogo[0][0]='O';
            }
            //linha 2
            else if(jogo[1][0]=='O' && jogo[1][1]=='O' && jogo[1][2]==0){
                jogo[1][2]='O';
            }
            else if(jogo[1][0]=='O' && jogo[1][1]==0 && jogo[1][2]=='O'){
                jogo[1][1]='O';
            }
            else if(jogo[1][0]==0 && jogo[1][1]=='O' && jogo[1][2]=='O'){
                jogo[1][0]='O';
            }
            //linha 3
            else if(jogo[2][0]=='O' && jogo[2][1]=='O' && jogo[2][2]==0){
                jogo[2][2]='O';
            }
            else if(jogo[2][0]=='O' && jogo[2][1]==0 && jogo[2][2]=='O'){
                jogo[2][1]='O';
            }
            else if(jogo[2][0]==0 && jogo[2][1]=='O' && jogo[2][2]=='O'){
                jogo[2][0]='O';
            }
            //coluna 1
            else if(jogo[0][0]=='O' && jogo[1][0]=='O' && jogo[2][0]==0){
                jogo[2][0]='O';
            }
            else if(jogo[0][0]=='O' && jogo[1][0]==0 && jogo[2][0]=='O'){
                jogo[1][0]='O';
            }
            else if(jogo[0][0]==0 && jogo[1][0]=='O' && jogo[2][0]=='O'){
                jogo[0][0]='O';
            }
            //coluna 2
            else if(jogo[0][1]=='O' && jogo[1][1]=='O' && jogo[2][1]==0){
                jogo[2][1]='O';
            }
            else if(jogo[0][1]=='O' && jogo[1][1]==0 && jogo[2][1]=='O'){
                jogo[1][1]='O';
            }
            else if(jogo[0][1]==0 && jogo[1][1]=='O' && jogo[2][1]=='O'){
                jogo[0][1]='O';
            }
            //coluna 3
            else if(jogo[0][2]=='O' && jogo[1][2]=='O' && jogo[2][2]==0){
                jogo[2][2]='O';
            }
            else if(jogo[0][2]=='O' && jogo[1][2]==0 && jogo[2][2]=='O'){
                jogo[1][2]='O';
            }
            else if(jogo[0][2]==0 && jogo[1][2]=='O' && jogo[2][2]=='O'){
                jogo[0][2]='O';
            }
            //diagonal principal
            else if(jogo[0][0]=='O' && jogo[1][1]=='O' && jogo[2][2]==0){
                jogo[2][2]='O';
            }
            else if(jogo[0][0]=='O' && jogo[1][1]==0 && jogo[2][2]=='O'){
                jogo[1][1]='O';
            }
            else if(jogo[0][0]==0 && jogo[1][1]=='O' && jogo[2][2]=='O'){
                jogo[0][0]='O';
            }
            //diagonal secundária
            else if(jogo[0][2]=='O' && jogo[1][1]=='O' && jogo[2][0]==0){
                jogo[2][0]='O';
            }
            else if(jogo[0][2]=='O' && jogo[1][1]==0 && jogo[2][0]=='O'){
                jogo[1][1]='O';
            }
            else if(jogo[0][2]==0 && jogo[1][1]=='O' && jogo[2][0]=='O'){
                jogo[0][2]='O';
            }
            //jogadas defensivas
            //linha 1
            else if(jogo[0][0]=='X' && jogo[0][1]=='X' && jogo[0][2]==0){
                jogo[0][2]='O';
            }
            else if(jogo[0][0]=='X' && jogo[0][1]==0 && jogo[0][2]=='X'){
                jogo[0][1]='O';
            }
            else if(jogo[0][0]==0 && jogo[0][1]=='X' && jogo[0][2]=='X'){
                jogo[0][0]='O';
            }
            //linha 2
            else if(jogo[1][0]=='X' && jogo[1][1]=='X' && jogo[1][2]==0){
                jogo[1][2]='O';
            }
            else if(jogo[1][0]=='X' && jogo[1][1]==0 && jogo[1][2]=='X'){
                jogo[1][1]='O';
            }
            else if(jogo[1][0]==0 && jogo[1][1]=='X' && jogo[1][2]=='X'){
                jogo[1][0]='O';
            }
            //linha 3
            else if(jogo[2][0]=='X' && jogo[2][1]=='X' && jogo[2][2]==0){
                jogo[2][2]='O';
            }
            else if(jogo[2][0]=='X' && jogo[2][1]==0 && jogo[2][2]=='X'){
                jogo[2][1]='O';
            }
            else if(jogo[2][0]==0 && jogo[2][1]=='X' && jogo[2][2]=='X'){
                jogo[2][0]='O';
            }
            //coluna 1
            else if(jogo[0][0]=='X' && jogo[1][0]=='X' && jogo[2][0]==0){
                jogo[2][0]='O';
            }
            else if(jogo[0][0]=='X' && jogo[1][0]==0 && jogo[2][0]=='X'){
                jogo[1][0]='O';
            }
            else if(jogo[0][0]==0 && jogo[1][0]=='X' && jogo[2][0]=='X'){
                jogo[0][0]='O';
            }
            //coluna 2
            else if(jogo[0][1]=='X' && jogo[1][1]=='X' && jogo[2][1]==0){
                jogo[2][1]='O';
            }
            else if(jogo[0][1]=='X' && jogo[1][1]==0 && jogo[2][1]=='X'){
                jogo[1][1]='O';
            }
            else if(jogo[0][1]==0 && jogo[1][1]=='X' && jogo[2][1]=='X'){
                jogo[0][1]='O';
            }
            //coluna 3
            else if(jogo[0][2]=='X' && jogo[1][2]=='X' && jogo[2][2]==0){
                jogo[2][2]='O';
            }
            else if(jogo[0][2]=='X' && jogo[1][2]==0 && jogo[2][2]=='X'){
                jogo[1][2]='O';
            }
            else if(jogo[0][2]==0 && jogo[1][2]=='X' && jogo[2][2]=='X'){
                jogo[0][2]='O';
            }
            //diagonal principal
            else if(jogo[0][0]=='X' && jogo[1][1]=='X' && jogo[2][2]==0){
                jogo[2][2]='O';
            }
            else if(jogo[0][0]=='X' && jogo[1][1]==0 && jogo[2][2]=='X'){
                jogo[1][1]='O';
            }
            else if(jogo[0][0]==0 && jogo[1][1]=='X' && jogo[2][2]=='X'){
                jogo[0][0]='O';
            }
            //diagonal secundária
            else if(jogo[0][2]=='X' && jogo[1][1]=='X' && jogo[2][0]==0){
                jogo[2][0]='O';
            }
            else if(jogo[0][2]=='X' && jogo[1][1]==0 && jogo[2][0]=='X'){
                jogo[1][1]='O';
            }
            else if(jogo[0][2]==0 && jogo[1][1]=='X' && jogo[2][0]=='X'){
                jogo[0][2]='O';
            }
            //jogadas de empate
            else if(jogo[0][1]==0){
                jogo[0][1]='O';
            }
            else if(jogo[2][1]==0){
                jogo[2][1]='O';
            }
            else if(jogo[1][0]==0){
                jogo[1][0]='O';
            }
            else if(jogo[1][2]==0){
                jogo[1][2]='O';
            }
            else{
            SecureRandom aleatorio = new SecureRandom();
            int linha = aleatorio.nextInt(3)+1;
            int coluna = aleatorio.nextInt(3)+1;
            if(jogo[linha-1][coluna-1]=='X'||jogo[linha-1][coluna-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                preenchimentoMatriz1JogadorDificil(jogo,jogador,n,pc);
            }
            else{
                jogo[linha-1][coluna-1] = 'O';
            }
        }
        }
    }
    }
    
    public static void doisJogadores(char [] [] jogo){
        Scanner in = new Scanner(System.in);
        String jogador1, jogador2;
        int jogador,ganho1 = 0,ganho2 = 2,qtd = 0;
        System.out.println("Informe o nome do jogador 1:");
        jogador1 = in.next();
        System.out.println("Informe o nome do jogador 2:");
        jogador2 = in.next();
        System.out.println();
        System.out.println("X-"+jogador1);
        System.out.println("O-"+jogador2);
        System.out.println();
        //sorteio de quem começa
        SecureRandom aleatorio = new SecureRandom();
        int jogadores = aleatorio.nextInt(2)+1;
        if(jogadores==1){
           System.out.println("Sorteando quem vai começar ...... "+jogador1); 
        }
        else{
           System.out.println("Sorteando quem vai começar ...... "+jogador2);
        }
        System.out.println();
        jogador=jogadores;
        do{
        qtd = preenchimentoMatriz2Jogadores(jogo,jogador,jogador1,jogador2);
        System.out.println();
        //mostra a matriz
        System.out.println("Jogo da velha:");
        for (int l = 0; l < jogo.length; l++)  {
            for (int c = 0; c < jogo[l].length; c++)     { 
                System.out.print(jogo[l][c]+ "\t"); // /t tabula a saída
            }  
        System.out.println();
        }
        //descobrir se alguem ganhou
        if(jogador==1){
            ganho1 = acertos(jogo,jogador);
        }
        else{
            ganho2 = acertos(jogo,jogador);
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
            System.out.println("Empate!");
        }
        else if(ganho1==1){
            System.out.println("O jogador "+jogador1+" venceu!");
        }
        else if (ganho2==1){
            System.out.println("O jogador "+jogador2+" venceu!");
        }
        telaInicial();
    }
    
    public static int preenchimentoMatriz2Jogadores (char [][] jogo,int jogador,String jogador1,String jogador2){
        int lin,col,qtd = 0;
        Scanner in = new Scanner(System.in);
            if(jogador==1){
            System.out.println(jogador1+" é sua vez de jogar.");
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
            if(jogo[lin-1][col-1]=='X'||jogo[lin-1][col-1]=='O'){
                System.out.println("Essa posição já foi preenchida.");
                qtd = preenchimentoMatriz2Jogadores(jogo,jogador,jogador1,jogador2);
            }
            else{
            jogo[lin-1][col-1] = 'X';
            qtd++;
            }
        }
        else{
            System.out.println(jogador2+" é sua vez de jogar.");
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
            if(jogo[lin-1][col-1]=='O'||jogo[lin-1][col-1]=='X'){
                System.out.println("Essa posição já foi preenchida.");
                qtd = preenchimentoMatriz2Jogadores(jogo,jogador,jogador1,jogador2);
            }
            else{
            jogo[lin-1][col-1] = 'O';
            qtd++;
            }
        }
        return qtd;
    }
    
    public static int acertos (char [][] jogo, int jogador){
        int [] ganhalinha = new int[3];
        int [] ganhacoluna = new int [3];
        int ganhadiagonalprincipal = 0,ganhadiagonalsecundaria = 0;
        if(jogador==1){
            //ganhar pela linha
            for (int i = 0; i < jogo.length; i++) {
                for (int j = 0; j < jogo[0].length; j++) {
                    if(jogo[i][j]=='X'){
                        ganhalinha[i] = ganhalinha[i] + 1;
                    }
                }
            }
            for (int i = 0; i < ganhalinha.length; i++) {
                if(ganhalinha[i]==3){
                    return 1;
                }
            }
            //ganhar pela coluna
            for (int i = 0; i < jogo[0].length; i++) {
                for (int j = 0; j < jogo.length; j++) {
                    if(jogo[j][i]=='X'){
                        ganhacoluna[i] = ganhacoluna[i] + 1;
                    }
                }
            }
            for (int i = 0; i < ganhacoluna.length; i++) {
                if(ganhacoluna[i]==3){
                    return 1;
                }
            }
            //ganhar pela diagonal principal
            for (int i = 0; i < jogo.length; i++) {
                for (int j = 0; j < jogo[0].length; j++) {
                    if(i==j && jogo[i][j]=='X'){
                       ganhadiagonalprincipal = ganhadiagonalprincipal + 1; 
                    }
                }
            }
            if(ganhadiagonalprincipal==3){
                return 1;
            }
            //ganhar pela diagonal secundária
            if(jogo[0][2]=='X' && jogo[1][1]=='X' && jogo[2][0]=='X'){
                return 1;
            }
        }
        else{
            //ganhar pela linha
            for (int i = 0; i < jogo.length; i++) {
                for (int j = 0; j < jogo[0].length; j++) {
                    if(jogo[i][j]=='O'){
                        ganhalinha[i] = ganhalinha[i] + 1;
                    }
                }
            }
            for (int i = 0; i < ganhalinha.length; i++) {
                if(ganhalinha[i]==3){
                    return 1;
                }
            }
            //ganhar pela coluna
            for (int i = 0; i < jogo[0].length; i++) {
                for (int j = 0; j < jogo.length; j++) {
                    if(jogo[j][i]=='O'){
                        ganhacoluna[i] = ganhacoluna[i] + 1;
                    }
                }
            }
            for (int i = 0; i < ganhacoluna.length; i++) {
                if(ganhacoluna[i]==3){
                    return 1;
                }
            }
            //ganhar pela diagonal principal
            for (int i = 0; i < jogo.length; i++) {
                for (int j = 0; j < jogo[0].length; j++) {
                    if(i==j && jogo[i][j]=='O'){
                       ganhadiagonalprincipal = ganhadiagonalprincipal + 1; 
                    }
                }
            }
            if(ganhadiagonalprincipal==3){
                return 1;
            }
            if(jogo[0][2]=='O' && jogo[1][1]=='O' && jogo[2][0]=='O'){
                return 1;
            }
        }
        return -1;
    }
    
}
    

