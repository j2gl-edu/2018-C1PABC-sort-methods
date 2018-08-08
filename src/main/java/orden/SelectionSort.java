package orden;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int A[] = new int[20];
        int menor, indice, n, i, j;
        System.out.print("Ingrese dimension del arreglo: ");
        n = teclado.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("A[" + i + "]= ");
            A[i] = teclado.nextInt();
        }

        for (i = 1; i <= n - 1; i++) {
            menor = A[i];
            indice = i;

            for (j = i + 1; j <= n; j++) {
                if (menor > A[j]) {
                    menor = A[j];
                    indice = j;
                }
            }

            A[indice] = A[i];
            A[i] = menor;

        }

        System.out.println("EL ARREGLO ORDENADO");
        for (i = 1; i <= n; i++) {
            System.out.print(" " + A[i]);

        }

    }

}
