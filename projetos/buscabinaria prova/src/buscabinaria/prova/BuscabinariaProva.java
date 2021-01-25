
package buscabinaria.prova;


public class BuscabinariaProva {

    public static void main(String[] args) {
        int vet[] = new int [5];
        
    
    }
    public static int buscaBinaria (double [] vet, double n, int qtt){
        
        int in = 0, m, f;   // in (início) , m (meio) e f(fim)
        
        f = qtt - 1;
        do {
            m = (in + f) / 2;
            if (n == vet[m]) {
                return m;
            }
            else if (n < vet[m]) {
                f = m - 1;
            }
            else {
                in = m + 1;
            }
        } while (in <= f);   
        return -1;    
    }
        
    }
    

