package arreglosyvectores;

import java.util.Random;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son
        iguales (la comparación deberá detenerse en cuanto se detecte alguna
        diferencia entre los elementos)
        */
        Scanner leer=new Scanner(System.in);
        int n,vector1[],vector2[];
        System.out.println("Ingrese el tamaño de los vectores");
        Random random=new Random();
        n=leer.nextInt();
        vector1=new int[n];
        vector2=new int[n];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i]=random.nextInt(2)+1;
            vector2[i]=random.nextInt(2)+1;
        }
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]+" - "+vector2[i]);
            if(vector1[i]!=vector2[i]){
                System.out.println("Los valores almacenados en la posición "+(i+1)+" de los vectores son diferentes por lo que no se muestran más valores");
                break;}
        }
    }
    
}
