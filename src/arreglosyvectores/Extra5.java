package arreglosyvectores;

import java.util.Random;
import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        /*
        Realizar un programa que llene una matriz de tamaño NxM con valores
        aleatorios y muestre la suma de sus elementos
        */
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        int matriz[][], suma, n, m;
        
        System.out.println("ingresa el tamaño de las filas y columnas:");
        n = leer.nextInt();
        m = leer.nextInt();
        
        matriz = new int[n][m];
        
        suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(10)+1;
                suma += matriz[i][j];
                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("La suma es: " + suma);
    }
    
}
