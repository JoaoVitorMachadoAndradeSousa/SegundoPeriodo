
package buscabinaria;

import java.util.Scanner;


public class BuscaBinaria {
    public static void exibeMenu () {
        System.out.println("1 - Inserir valor");
        System.out.println("2 - Buscar valor");
        System.out.println("3 - Remover valor");
        System.out.println("4 - Exibir pares");
        System.out.println("5 - Exibir ímpares");
        System.out.println("0 - Encerrar o programa");
    }

    
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        int [] pares = new int[50];
        int [] impares = new int [50];
        int qtdPares = 0, qtdImpares = 0;
        int op, valor, retorno;
        
        do {
            exibeMenu();
            System.out.println("Informar a opção: ");
            op = in.nextInt();
            switch (op) {
                case 1: System.out.println("Informe o valor: ");
                valor = in.nextInt();
                if (valor % 2 == 0) {
                    retorno = inserirOrdenado (pares, qtdPares, valor);
                    if (retorno == -2) {
                        System.out.println("Vetor cheio! Inserção não realizada!");
                    }
                    else {
                        qtdPares = retorno;
                    }
                }
                else {
                        retorno = inserirOrdenado (impares, qtdImpares, valor);
                        if (retorno == -2) {
                            System.out.println("Vetor cheio! Inserção não realizada!");
                        }
                        else {
                             qtdImpares = retorno;
                        }
                }
                break;
                case 2: System.out.println("Informe o valor: ");
                valor = in.nextInt();
                if (valor % 2 == 0) {
                    retorno = buscaBinaria (pares, qtdPares, valor);
                    if (retorno == -1) {
                        System.out.println("Valor não encontrado!");
                    }
                    else {
                        System.out.println("Valor encontrado na posição " + retorno);
                    }
                }
                else {
                    retorno = buscaBinaria (impares, qtdImpares, valor);
                    if (retorno == -1) {
                        System.out.println("Valor não encontrado!");
                    }
                    else {
                        System.out.println("Valor encontrado na posição " + retorno);
                    }
                }
                break;
                case 3: break;
                case 4: break;
                case 5: break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
       
    public static int buscaBinaria (int vet[], int qtd, int num) {
        int inicio, meio, fim;
        inicio = 0;
        fim = qtd - 1;
        do {
            meio = (inicio + fim) / 2;
            if (num == vet[meio]) {
                return meio;
            }
            else if (num < vet[meio]) {
                fim = meio - 1;
            }
            else {
                inicio = meio + 1;
            }
        } while (inicio <= fim);   
        return -1;    
    }
    
    // código insere valores repetidos.
    // alterar o código abaixo para não permitir a inserção de repetidos
    public static int inserirOrdenado (int vet[], int qtd, int num) {
        int i, j;
        if (qtd == 0) { // a lista está vazia
            vet[qtd] = num;
            qtd++;
            return qtd;
        }
        else { // a lista não está vazia
            if (qtd == vet.length) { // a lista está cheio
                return -2;
            }
            else { // a lista não está cheia
                if (num > vet[qtd - 1]) { // inserir valor no final
                    vet[qtd] = num;
                    qtd++;
                    return qtd;
                }
                else {  // inserir o novo valor no início ou no meio do vetor
                    for (i = 0; i <= qtd - 1; i++) { // procurar  posição de inserção
                        if (vet[i] > num) {
                            break;
                        }
                    }
                    for (j = qtd - 1; j >= i; j--) { // "mover" valores para liberar posição de inserção
                        vet [j+1] = vet [j];
                    }
                    vet[i] = num;
                    qtd++;
                    return qtd;
                }
            }
        }
    }
    
    // código incompleto - completar o código abaixo
    public static int remover (int vet[], int qtd, int num) {
        int pos;
        if (qtd == 0) { // caso 1: testar se o vetor está vazio
            return -2;
        }
        else {
            pos = buscaBinaria (vet, qtd, num);
            if (pos == -1) { // não achou!
                return pos;
            }
            else { // achou!
                // inserir código de remoção
                
                
                qtd--;
                return qtd;
            }           
        }       
    }

    }
    

