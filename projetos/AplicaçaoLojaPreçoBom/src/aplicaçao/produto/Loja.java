
package aplicaçao.produto;
public class Loja {
    private int qtd;
    private Produto [] produtos;
    public Loja (){
       produtos = new Produto [5];
    }
    public int buscaSimples (Produto p){
        for(int i = 0; i < this.qtd; i++){
            if(p.compareTo(this.produtos[i]) == 0){
                return i;
            }
        }
        return -1;
    }
    public void cadastraProduto (Produto p){
        if(this.qtd < this.produtos.length){
            int busca;
            busca = buscaSimples(p);
            if(busca == -1){
                this.produtos[this.qtd] = p;
                this.qtd++;
                System.out.println("PRODUTO CADASTRADO");
            }else{
                System.out.println("PRODUTO JÁ EXISTENTE. /n CADASTRO NÃO EFETUADO");
            }
        }
        else{
            System.out.println("LOJA CHEIA! /n CADASTRO NÃO EFETUADO");
        }
    }
    public void exibeLoja (){
        if(this.qtd == 0){
            System.out.println("LOJA VAZIA!");
        }else{
            for(int i = 0; i <= this.qtd; i++){
                System.out.println(this.produtos[i]);
            }
        }
    }
    public void alterarPreço (String cod, int percentual, int op){
        int busca;
        Produto p;
        p = new Produto (cod,"","",0,0);
        busca = buscaSimples(p);
        if(busca == -1){
            System.out.println("PRODUTO NÃO ENCONTRADO");
        }else{
            if(percentual <= 0){
                System.out.println("PERCENTUAL INVÁLIDO");
            }else{
                switch(op){
                    case 1: this.produtos[busca].aplicarAumento(percentual);
                    break;
                    case 2: this.produtos[busca].aplicarDesconto(percentual);
                    break;
                    default: System.out.println("ESCOLHA INVÁLIDA /n DIGITE NOVAMENTE: " );
                    break;
                }
            }
        }
    }
    public void alterarEstoque (String cod, int acrescimo){
        int busca;
        Produto p;
        p = new Produto (cod,"","",0,0);
        busca = buscaSimples(p);
        if(busca == -1){
            System.out.println("PRODUTO NÃO ENCONTRADO");
        }else{
            if(acrescimo <= 0){
                System.out.println("ACRÉSCIMO INVÁLIDO");
            }else{
                this.produtos[busca].atualizarEstoque(acrescimo);
            }
        }
    }
    public void vendeProduto (String cod, int quantidade){
        int busca;
        Produto p;
        p = new Produto (cod,"","",0,0);
        busca = buscaSimples(p);
        if(busca == -1){
            System.out.println("PRODUTO NÃO ENCONTRADO");
        }else{
            if(quantidade <= 0){
                System.out.println("QUANTIDADE DE PRODUTOS PARA VENDA INVÁLIDA");
            }else{
                this.produtos[busca].venderProduto(quantidade);
                System.out.println("VENDA EFETUADA");
            }
        }
    }
    
   
}
