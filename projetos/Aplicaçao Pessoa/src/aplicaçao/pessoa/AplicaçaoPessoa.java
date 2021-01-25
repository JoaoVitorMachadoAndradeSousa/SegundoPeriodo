
package aplicaçao.pessoa;

import java.util.Scanner;


public class AplicaçaoPessoa {

    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   String nome;
   int idade, op, numero;
   char genero;
   double peso;
   double altura;
   int quantidadePessoas;
        System.out.println("Informe a quantidade de pessoas: ");
        quantidadePessoas = in.nextInt();
        while(quantidadePessoas <= 0){
            System.out.println("Quantidade de pessoas inválida.");
            System.out.println("Digite novamente: ");
            quantidadePessoas = in.nextInt();
        }
        Pessoa [] pessoas = new Pessoa[quantidadePessoas];
        for(int i = 0; i < quantidadePessoas; i++){
            System.out.println("Informe o nome da pessoa " + (i + 1));
            nome = in.nextLine();
            System.out.println("Informe o gênero da pessoa (M PARA MASCULINO OU F PARA FEMININO):");
            genero = in.next().charAt(0);
            System.out.println("Informe a idade: ");
            idade = in.nextInt();
            System.out.println("Informe o peso: ");
            peso = in.nextDouble();
            System.out.println("Informe a altura da pessoa: ");
            altura = in.nextDouble();
            System.out.println("");
            pessoas[i] = new Pessoa(nome,idade,genero,peso,altura);
            
        }
        System.out.println("");
        for(int i = 0; i < quantidadePessoas; i++){
            System.out.println("Pessoa " + (1 + i) + pessoas[i].nomeUsuario());
            System.out.println(pessoas[i]);
        System.out.println("");
        }
        do{
            System.out.println("1 - Atualizar altura");
            System.out.println("2 - Atualizar peso");
            System.out.println("3 - Atualizar idade");
            System.out.println("0 - Encerrar programa");
            op = in.nextInt();
            switch(op){
                case 1: System.out.println("Informe o número da pessoa: ");
                numero = in.nextInt();
                while(numero <=0  || numero > quantidadePessoas){
                    System.out.println("Número inválido,");
                    System.out.println("Digite novamente: ");
                    numero = in.nextInt();
                }
                    System.out.println("Informe a nova altura: ");
                    altura = in.nextDouble();
                    pessoas[numero - 1].atualizarAltura(altura);
                    break;
                case 2: System.out.println("Informe o número da pessoa: ");
                numero = in.nextInt();
                while(numero <=0  || numero > quantidadePessoas){
                    System.out.println("Número inválido,");
                    System.out.println("Digite novamente: ");
                    numero = in.nextInt();
                }
                    System.out.println("Informe o novo peso da pessoa: ");
                    peso = in.nextDouble();
                    pessoas[numero - 1].atualizarPeso(peso);
                    break;
                case 3: System.out.println("Informe o número da pessoa: ");
                numero = in.nextInt();
                while(numero <=0  || numero > quantidadePessoas){
                    System.out.println("Número inválido,");
                    System.out.println("Digite novamente: ");
                    numero = in.nextInt();
                }
                    System.out.println("Informe a nova idade da pessoa: ");
                    idade = in.nextInt();
                    pessoas[numero - 1].atualizarIdade(idade);
                    break;
                case 0: System.out.println("Programa encerrado.");
                break;
                default: System.out.println("Resposta inválida.");
            }
        }while(op!=0);
            
    }
    
}
