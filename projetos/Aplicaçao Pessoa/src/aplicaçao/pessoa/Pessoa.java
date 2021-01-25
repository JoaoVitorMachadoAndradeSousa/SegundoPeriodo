
package aplicaçao.pessoa;


public class Pessoa implements Comparable <Pessoa>{
    private String nome;
    private int idade;
    private char genero;
    private double peso;
    private double altura;
    private double pesoIdeal;
    
    public Pessoa (String nome, int idade, char genero, double peso, double altura){  //construtor
        this. nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.pesoIdeal = pesoIdeal;
    }
    // sets e gets
    private void setNome (String novoNome){
        this.nome = novoNome;
    }
    private String getNome(){
        return this.nome;
    }
    private void setGenero (char novoGen){
        this.genero = novoGen;
    }
    private char getGenero(){
        return this.genero;
    }
    private void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    private int getIdade (){
        return this.idade;
    }
    private void setPeso ( double novoPeso){
        this.peso = novoPeso;
    }
    private double getPeso (){
        return this.peso;
    }
    private void setAltura (double novaAltura){
        this.altura = novaAltura;
    }
    private double getAltura(){
        return this.altura;
    }
    private void setPesoIdeal(double novoPesoIdeal){
        this.pesoIdeal = novoPesoIdeal;
    }
    private double getPesoIdeal(){
        return this.pesoIdeal;
    }
    public void atualizarPeso (double peso){
        double novoPesoIdeal;
        if(peso < 3 || peso > 200){
            System.out.println("Peso inválido.");
        }else{
            this.setPeso(peso);
            novoPesoIdeal = this.getPeso() / Math.pow(this.getAltura(), 2);
            this.setPesoIdeal(novoPesoIdeal);
            System.out.println("Novo peso: " + this.getPeso());
        }
    }
     public void atualizarAltura(double altura) {
        double novoPesoIdeal;
        if (altura < 0.5 || altura > 2.0) {
            System.err.println("Altura inválida.");
        } else {
            this.setAltura(altura);
            novoPesoIdeal = this.getPeso() / Math.pow(this.getAltura(), 2);
            this.setPesoIdeal(novoPesoIdeal);
            System.out.println("Nova Altura: " + this.getAltura());
        }
    }
     public void atualizarIdade(int idade) {
        if (idade < 0 || idade > 130) {
            System.err.println("Idade inválida.");
        } else {
            this.setIdade(idade);
            System.out.println("nova Idade: " + this.getIdade());
        }
    }
     public String nomeUsuario(){
         return this.getNome();
     }
     public int compareTo (Pessoa pessoa){
         return 0;
     }
     public String toString(){
         return  "Dados de " + this.getNome() + ": \nGênero: " + this.getGenero()
                + " \nIdade: " + this.getIdade() + " \nAltura: " + this.getAltura()
                + " \nPeso: " + this.getPeso();
     }
     
}
