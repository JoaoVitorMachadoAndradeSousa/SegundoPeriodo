
package busca.sequencial.simples;

import java.util.Scanner;
public class BuscaSequencialSimples {
    
    

    
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
    double [] numeros = new double [10];
    int pos;
    double num;
    preencheVetor (numeros);
        System.out.println("Digite o valor procurado: ");
        num = i.nextDouble();
        pos = buscaSequencial (numeros, num, numeros.length);
        if (pos == -1) {
            System.out.println(num + " não está na lista.");
        }
        else {
            System.out.println(num + " está na lista na posição " + pos);
        }
    
    }
    public static void preencheVetor (double [] vet){
        Scanner in = new Scanner (System.in);
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println("informe o valor [" + i + "] = ");
            vet[i] = in.nextDouble();
        }
    }
    public static int buscaSequencial(double v[], double procurado, int n) {
        int i;
        boolean achou = false;

        for (i = 0; i < n; i++) {
            if (v[i] == procurado) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            return i;     // retorna a posição onde encontrou a chave
        } else {
            return -1;  // retorna -1 indicando que não achou a chave
        }
    }
}
    

