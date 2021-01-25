
package aplicaçao.paciente;

import java.util.Scanner;

public class AplicaçaoPaciente {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    CadastroPaciente cp = new CadastroPaciente();
    String nome, cpf,cpf2, email, fone;
    int op;
    do{
        menu();
        op = in.nextInt();
        in.nextLine();
        switch(op){
            case 1: System.out.println("Informe o CPF do paciente: "); 
            cpf = in.nextLine();
                System.out.println("Informe o nome do paciente: ");
                nome = in.nextLine();
                System.out.println("Informe o seu e-mail:  ");
                email = in.nextLine();
                System.out.println("Informe o seu fone: ");
                fone = in.nextLine();
                Paciente pa = new Paciente (cpf, nome, email, fone);
                cp.cadastroPaciente(pa);
                break;
            case 2: System.out.println("Informe o CPF do paciente a ser procurado: ");
                  cpf2 = in.nextLine();
                 cp.exibe1Paciente(cpf2);
                 break;
            case 0: System.out.println("Programa encerrado.");
            break;
            default: System.out.println("Escolha inválida");
                System.out.println("Digite novamente: ");
        }
    }while(op != 0);
    }
    public static void menu(){
        System.out.println("CLÍNICA");
        System.out.println("1 - CADASTRAR UM PACIENTE");
        System.out.println("2 - CONSULTAR OS DADOS DE UM PACIENTE");
        System.out.println("0 - SAIR DO PROGRAMA");
       
    
}
}
