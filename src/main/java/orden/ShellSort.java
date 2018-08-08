package orden;

import java.util.Scanner;

public class ShellSort {

  public static int[]  shell(int A[]){
    int salto, aux, i;
    boolean cambios;
    for(salto=A.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){ // Mientras se intercambie algún elemento
                        cambios=false;
                        for(i=salto; i< A.length; i++) // se da una pasada
                                if(A[i-salto]>A[i]){ // y si están desordenados
                                      aux=A[i]; // se reordenan
                                      A[i]=A[i-salto];
                                      A[i-salto]=aux;
                                      cambios=true; // y se marca como cambio.
                                }
                         }
             }
  return A;
 }

  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int A[];
        int menor,indice,n,i,j;
        System.out.print("Ingrese dimension del arreglo: ");
        n=teclado.nextInt();
        A= new int[n];
        for(i=0;i<n;i++){
            System.out.print("A["+i+"]= ");
            A[i]=teclado.nextInt();
        }

        A = shell(A);
        System.out.println("EL ARREGLO ORDENADO");
        for(i=0;i<n;i++){
            System.out.print(" "+A[i]);

        }
  }

}
