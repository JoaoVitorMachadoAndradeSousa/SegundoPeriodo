
package aplicaçao.produto;

import java.util.Scanner;

public class AplicaçaoProduto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     String codigo, descriçao, fornecedor;
     double preço, desconto, aumento = 0;
     int estoque, op, quantidadeProduto, numero;
        System.out.println("Informe a quantidade de produtos a ser registrada: ");
        quantidadeProduto = in.nextInt();
        in.nextLine();
        Produto [] produtos = new Produto [quantidadeProduto];
        for(int i = 0; i < quantidadeProduto; i++){
            System.out.println("Informe o código do produto " + (1 + i) + ":");
            codigo = in.nextLine();
            System.out.println("Informe a descrição do produto " + (1 + i) + ":");
            descriçao = in.nextLine();
            System.out.println("Informe o fornecedor do produto " + (1 + i) + ":");
            fornecedor = in.nextLine();
            System.out.println("Informe o preço do produto " + (1 + i) + ":");
            preço = in.nextDouble();
            System.out.println("Informe a quantidade do estoque do produto " + (1 + i) + ":");
            estoque = in.nextInt();
            in.nextLine();
            produtos[i] = new Produto(codigo, descriçao, fornecedor, preço, estoque);
             do {
            System.out.println("1-Aplicar desconto \n2-Aplicar aumento \n3-Atualizar estoque"
                    + " \n4-Vender produto\n0-Finalizar");
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe a numeração do produto: ");
                    numero = in.nextInt();
                    System.out.print("Informe a porcentagem do desconto: ");
                    desconto = in.nextDouble();
                    produtos[numero - 1].aplicarDesconto(preço);
                    break;
                case 2:
                    System.out.println("Informe a numeração do produto: ");
                    numero = in.nextInt();
                    System.out.print("Informe a porcentagem do aumento: ");
                    desconto = in.nextDouble();
                    produtos[numero-1].aplicarAumento(preço);
                    break;
                case 3:
                    System.out.println("Informe a numeração do produto: ");
                    numero = in.nextInt();
                    System.out.print("Informe a quantidade do produto para o estoque: ");
                    estoque = in.nextInt();
                    produtos[numero-1].atualizarEstoque(estoque);
                    break;
                case 4:
                    System.out.println("Informe a numeração do produto: ");
                    numero = in.nextInt();
                    System.out.print("Informe a quantidade do produto vendido: ");
                    estoque = in.nextInt();
                    produtos[numero-1].venderProduto(estoque);
                    break;
                            
                case 0:
                    
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.err.print("Resposta inválida!");
            }
        } while (op != 0);

    }

}
        }
     
      




        
    
    

