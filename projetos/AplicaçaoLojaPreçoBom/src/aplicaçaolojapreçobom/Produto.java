
package aplicaçaolojapreçobom;


public class Produto implements Comparable <Produto>{
    private String codigo;
    private String descriçao;
    private String fornecedor;
    private double preço;
    private int estoque;
    
    
    public Produto (String codigo, String descriçao, String fornecedor, double preço, int estoque){  // construtor
        this.codigo = codigo;
        this.descriçao = descriçao;
        this.fornecedor = fornecedor;
        this.preço = preço;
        this.estoque = estoque;
    }
//gets e sets
    private void setCodigo (String novoCodigo){
        this.codigo = novoCodigo;
    }
    private String getCodigo(){
        return this.codigo;
    }
    private void setDescriçao (String novaDescriçao){
        this.descriçao = novaDescriçao;
    }
    private String getDescriçao(){
        return this.descriçao;
    }
    private void setFornecedor (String novoFornecedor){
        this.fornecedor = novoFornecedor;
    }
    private String getFornecedor(){
        return this.fornecedor;
    }
    private void setPreço (double novoPreço){
        this.preço = novoPreço;
    }
    private double getPreço(){
        return this.preço;
    }
    private void setEstoque (int novoEstoque){
        this.estoque = novoEstoque;
    }
    private int getEstoque(){
        return this.estoque;
    }
    public void aplicarDesconto (double desconto){
        if(desconto <= 0 || desconto > 100){
            System.out.println("Informe uma porcentagem entre 0 e 100.");
        }else{
            double des = (desconto / 100) * this.getPreço();
            double novoPreço = this.preço - des;
            this.setPreço(novoPreço);
            System.out.println("Preço com desconto: R$" + this.getPreço());
        }
    }
    public void aplicarAumento(double aumento){
        if(aumento <= 0 || aumento > 100){
            System.out.println("Informe uma porcentagem entre 0 e 100.");
        }else{
            double aum = (aumento / 100) * this.getPreço();
            double novoPreço = this.getPreço() + aum;
            this.setPreço(novoPreço);
            System.out.println("Preço com aumento: R$" + this.getPreço());
        }
    }
    public void atualizarEstoque(int quantidade){
        int estoqueAtual = this.getEstoque();
        int novoEstoque;
        novoEstoque = estoqueAtual + quantidade;
        this.setEstoque(novoEstoque);
        System.out.println("Depósito de " + novoEstoque + " efetuado.");
        
    }
    public void venderProduto (int quantidade){
        int estoqueAtual = this.getEstoque();
        int novoEstoque;
        if(quantidade <= estoqueAtual){
            novoEstoque = estoqueAtual - quantidade;
            this.setEstoque(novoEstoque);
            System.out.println("Retirada de produto efetuada.");
        }else{
            System.out.println("Estoque insuficiente.");
        }
    }
    public String toString (){
        return "Produto: " + this.getCodigo() + " " + this.getDescriçao() + " " + this.getFornecedor() + " " + this.getPreço() + " " + this.getEstoque();
    }
    public int compareTo (Produto produto){
        int result;
        result = this.getEstoque() - produto.getEstoque();
        return result;
    }

  
    }
    
            
  

 
