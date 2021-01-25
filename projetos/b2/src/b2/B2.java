
package b2;


public class B2 {

    
    public static void main(String[] args) {
    double vet[] = new double [5];
    
    }
    public static double buscaBinaria(double[] vet,int qtt, double x) {
int l,c,inicio=0,meio,fim=qtt;
while (inicio <= fim){

meio = (inicio+fim)/2;
if(vet[meio]==x){
return meio;
}

for (l=0;l<x;l++){
inicio = meio + 1;
return inicio;
}

for (c=0;c>x;c--){
fim = meio - 1;
return fim;
}
}
return -1;
}
    
}
