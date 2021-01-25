
package aplicaçaolojapreçobom;

import java.util.Scanner;


public class AplicaçaoLojaPreçoBom {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    Loja loja = new Loja();
    int op,qtd,opc,quantidade,venda, percentual;
    String codigo,desc,forne,codAP,codAE,codAV;
    double preço;
    Produto p;
    do{
        System.out.println("Loja: Preço Bom.");
        System.out.println("O que deseja fazer:");
        System.out.println("1-Cadastrar novo produto.");
        System.out.println("2-Exibit todos os produtos.");
        System.out.println("3-Alterar preço de um produto.");
        System.out.println("4-Acrescer o estoque.");
        System.out.println("5-Vender produto do estoque.");
        System.out.println("6-Encerrar o programa.");
        System.out.println("Informe o número de escolha:");
        op = in.nextInt();
        in.nextLine();
        switch(op){
        case 1: System.out.println("Informe o código do produto: ");
                codigo = in.nextLine();
                System.out.println("Informe a descrição do produto: ");
                desc = in.nextLine();
                System.out.println("Informe o fornecedor do produto: ");
                forne = in.nextLine();
                System.out.println("Informe o preço do produto: ");
                preço = in.nextDouble();
                System.out.println("Informe a quantidade do produto a ser cadastrado: ");
                qtd = in.nextInt();
                p = new Produto (codigo, desc, forne, preço, qtd);
                loja.cadastraProduto(p);
               break;
        case 2: loja.exibeLoja();
        break;
        case 3: System.out.println("Infome o código do produto:");
                codAP = in.nextLine();
                System.out.println("Infome o percentual:");
                percentual = in.nextInt();
                System.out.println("Você deseja aplicar o percentual de "+percentual+"%:");
                System.out.println("1-Aumento.");
                System.out.println("2-Desconto.");
                opc = in.nextInt();
                loja.alterarPreço(codAP, percentual, opc);
                break;
            case 4:
                System.out.println("Infome o código do produto:");
                codAE = in.nextLine();
                System.out.println("Informe o acrescimo ao estoque:");
                quantidade = in.nextInt();
                loja.alterarEstoque(codAE, quantidade);
                break;
            case 5:
                System.out.println("Infome o código do produto:");
                codAV = in.nextLine();
                System.out.println("Informe a quantidade a ser vendida:");
                venda = in.nextInt();
                loja.vendeProduto(codAV, venda);
                break;
            case 6:
                System.out.println("Fim do programa.");
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
                break;
        }
        }while(op!=6);
    }
                
        }
    
    
    

