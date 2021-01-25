
package lista.string.pkg2.questao.pkg1;

import java.util.Scanner;



public class ListaString2Questao1 {

 
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String cpf;
        String cpfExibir;
        int tam;
        System.out.println("Informe o seu CPF: ");
        cpf = in.nextLine();
        tam = cpf.length();
        
        while(tam != 11){
            System.out.println("Quantidade de caracteres digitados inválidos: " + tam);
            System.out.println("Informe o seu CPF: ");
             cpf = in.nextLine();
             tam = cpf.length();
        }
        System.out.println("CPF");
        StringBuilder exibirCpf = new StringBuilder(cpf);
        exibirCpf.insert(3, ".");
        exibirCpf.insert(7, ".");
	exibirCpf.insert(11, "-");                
	System.out.println(exibirCpf);
        
        
      
    }
    
}
