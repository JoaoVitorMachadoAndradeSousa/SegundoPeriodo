
package lista.string.pkg3.questao.pkg2;

import java.util.Scanner;


public class ListaString3Questao2 {

   
    public static void main(String[] args) {
     
        Scanner in = new Scanner (System.in);
        String conta;
        int dv, tamanho;
        boolean resultado;
        System.out.println("Informe o número da conta (6 números da conta):");
        conta = in.next();
        System.out.println("Informe o dígito verificador (1 número):");
        dv = in.nextInt();
        tamanho = conta.length();
        resultado = testeContaBancaria(conta,tamanho,dv);
        if(resultado == true){
            System.out.println("O dígito verificador é válido.");
        }
        else{
            System.out.println("O dígito verificador não é válido.");
        }
    }
    
    public static boolean testeContaBancaria (String c, int t1, int dv){
        char letraConta;
        int numeroConta;
        double soma = 0, resto;
        if(t1==6){
            for (int i = 0; i < t1; i++) {
                letraConta = c.charAt(i);
                numeroConta = letraConta - '0';
                soma = soma + numeroConta * Math.pow(2, i); 
            }
            resto = soma % 11;
            if(resto == dv){
                return true;
            }
        }
        return false;
    }
    
}
    
    

