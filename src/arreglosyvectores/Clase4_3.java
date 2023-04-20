package arreglosyvectores;

import java.util.Random;
import java.util.Scanner;

public class Clase4_3 {

    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de
        1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
        */
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int vector[],dig1=0,dig2=0,dig3=0,dig4=0,dig5=0;
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=random.nextInt(100000)+1;
        }
        for (int i = 0; i < vector.length; i++) {
            n = vector[i];
            int con = 0;
            do{
                con ++;
                n = n / 10;
            }while((n) > 0);
            switch(con){
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;                    
                case 5:
                    dig5++;
                    break;                    
            }
        }
        System.out.println("Los valores del vector con 1 dígito son: " + dig1);
        System.out.println("Los valores del vector con 2 dígito son: " + dig2);
        System.out.println("Los valores del vector con 3 dígito son: " + dig3); 
        System.out.println("Los valores del vector con 4 dígito son: " + dig4);
        System.out.println("Los valores del vector con 5 dígito son: " + dig5);
    }
    
}
