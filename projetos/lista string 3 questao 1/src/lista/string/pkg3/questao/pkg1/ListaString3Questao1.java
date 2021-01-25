
package lista.string.pkg3.questao.pkg1;

import java.util.Scanner;


public class ListaString3Questao1 {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String placa;
    int tam;
    
    boolean resultado;
        System.out.println("Informe a placa, as letras devem estar em maíusculo: ");
        placa = in.next();
        StringBuilder exibirPlaca = new StringBuilder(placa);
        tam = placa.length();
        resultado = testeStringPlaca(placa);
        exibirPlaca.insert(3, "-");
        while(resultado == false){
            System.out.println("Dado inválido, digite novamente: ");
            placa = in.next();
            tam = placa.length();
            resultado = testeStringPlaca(placa);
            exibirPlaca.insert(3, "-");
        }
        System.out.println("A placa " + exibirPlaca + " é válida.");
        
    }
    public static boolean testeStringPlaca(String placa){
        if(placa.length() != 7){
            return false;
        }
        else if(!placa.substring(0, 3).matches("[A-Z]*")){
            return false;
        }
        else if(!placa.substring(3).matches("[0-9]*")){
            return true;
        }
        return true;
    }
    
}
