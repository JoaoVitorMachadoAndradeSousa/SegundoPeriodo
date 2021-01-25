package validacpf;

import java.util.Scanner;

public class ValidaCPF {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cpf;
        boolean resp;
        char op;
        do{
        System.out.println("Digite o seu CPF: ");
        cpf = in.next();
        resp = validaNumero(cpf);
        if (resp == true) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
            System.out.println("Digite se quiser validar outro CPF: (S PARA SIM OU N PARA NÃO)");
            op = in.next().charAt(0);
            op = Character.toUpperCase(op);
           
            while(op != 'S'&& op != 'N'){
                System.out.println("Resposta inválida.");
                System.out.println("Digite se quiser validar outro CPF: (S PARA SIM OU N PARA NÃO)");
                op = in.next().charAt(0);
                op = Character.toUpperCase(op);
               
            }
        }while(op == 'S');
    }
   public static boolean validaNumero(String cpf) {
        int tam;
        char x;
        int soma = 0;
        int resto;
        int digito1, digito2;
        int c;
        int[] vet = new int[11];
        tam = cpf.length();
        if (tam != 11) {                                       //verificando o tamanho
            return false;
        } else {
            for (int i = 0; i < tam; i++) {                //verificando se todos os caracteres digitados são números
                x = cpf.charAt(i);
                if (Character.isDigit(x) == false) {
                    return false;
                }
            }
            for (int i = 0; i < vet.length; i++) {
                x = cpf.charAt(i);
                vet[i] = x - '0';
            }
            for (int i = 0; i < vet.length - 2; i++) {         // calculando o primeiro dígito verificador
                soma += vet[i] * (10 - i);

            }
            resto = soma % 11;
            if (resto < 2) {
                c = 0;
            } else {
                c = 11 - resto;
            }
            digito1 = vet[vet.length - 2];
            if (c == digito1) {
                soma = 0;
                for (int i = 0; i < vet.length - 1; i++) {           //calculando o segundo dígito verificador
                    soma += vet[i] * (11 - i);

                }
                resto = soma % 11;
                if (resto < 2) {
                    c = 0;
                } else {
                    c = 11 - resto;
                }
                digito2 = vet[vet.length - 1];
                if (c == digito2) {
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }

        }
        
    }


}
