
package aplicaçaoproduto2;


public class Produto2 implements Comparable <Produto2> {
    private String codigo;
    private String descriçao;
    private String fornecedor;
    private double preço;
    private int qtdEstoque;
    
    public Produto2 (String codigo, String descriçao, String fornecedor, double preço, int estoque){ // construtor
this.codigo = codigo;
this.descriçao = descriçao;
this.fornecedor = fornecedor;
this.preço = preço;
this.qtdEstoque = estoque;
}
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
this.qtdEstoque = novoEstoque;
}
private int getEstoque(){
return this.qtdEstoque;
}
public void aplicaDesconto (int percentual){
    double desconto;
    if (percentual <= 0 || percentual > 100){
        System.out.println("Percentual de aplicação de desconto inválido");
    }else{
        desconto = (percentual / 100) * this.getPreço();
        double novoPreço = this.getPreço() - desconto;
        this.setPreço(novoPreço);
        System.out.println("Novo preço com o desconto aplicado: " + novoPreço);
    }
}
public void aplicaAumento (int percentual){
    double aumento;
    if(percentual <= 0 || percentual > 100){
        System.out.println("Percentual de aplicação de aumento inválido");
    }else{
        aumento = (percentual / 100) * this.getPreço();
        double novoPreço = this.getPreço() + aumento;
        this.setPreço(novoPreço);
        System.out.println("Novo preço com o aumento aplicado: " + novoPreço);
    }
}
public void atualizaEstoque (int qtd){
    if(qtd <= 0){
        System.out.println("Informe uma quantidade maior que zero");
    }else{
        int novoEstoque = this.getEstoque() - qtd;
        this.setEstoque(novoEstoque);
        System.out.println("Novo estoque: " + this.getEstoque());
    }
}


    
}
