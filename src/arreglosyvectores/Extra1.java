package arreglosyvectores;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos de un
        vector de tamaño N, con los valores ingresados por el usuario
        */
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int vector[],suma=0,n;
        n=leer.nextInt();
        vector=new int[n];
        for(int i=0;i<vector.length;i++){
            System.out.println("Ingresar el número de la posción ["+(i+1)+"] ");
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("La suma de los valores del vector es: "+suma);
    }
    
}
