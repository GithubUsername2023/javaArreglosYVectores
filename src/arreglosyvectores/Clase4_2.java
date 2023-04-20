package arreglosyvectores;

import java.util.Scanner;

public class Clase4_2 {

    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores
        aleatorios y le pida al usuario un número a buscar en el vector. El
        programa mostrará dónde se encuentra el numero y si se encuentra
        repetido
        */
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int cont=0;
        int n=leer.nextInt();
        int vector[]=new int[n];
        System.out.println(""); 
        System.out.println("Ingrese un valor");
        for(int i=0;i<vector.length;i++){
            if(i>0)
                System.out.println("Ingrese otro valor");
            vector[i]=leer.nextInt();
        }
        System.out.println("");
        System.out.println("Ingrese el valor que desea buscar");
        n=leer.nextInt();
        for(int i=0;i<vector.length;i++){
            if(n==vector[i]){   
                System.out.println("El valor buscado se encuentra en la "+(i+1)+" posición del vector.");
                cont ++;
            }
        }
        if(cont>1)
            System.out.println("El valor se repite "+cont+" veces dentro del vector.");
    }
    
}