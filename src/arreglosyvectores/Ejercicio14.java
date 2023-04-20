package arreglosyvectores;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        /*
        Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
        compañeros de equipo
        */
        String[] Equipo=new String[4];
        Scanner leer=new Scanner(System.in);
        for(int i=0;i<4;i++){
            Equipo[i]=leer.next();
        }
        System.out.println("");
        for(int i=0;i<4;i++){
            System.out.println(Equipo[i]);
        }   
    }
    
}
