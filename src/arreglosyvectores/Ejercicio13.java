package arreglosyvectores;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        /*
        Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
        de equipo y define su tipo de dato de tal manera que te permita alojar sus
        nombres más adelante.
        */
        
        String[] Equipo=new String[4];
        Scanner leer=new Scanner(System.in);
        Equipo[0]="Martin";
        Equipo[1]="Yanina";
        Equipo[2]="Bruno";
        Equipo[3]="Salvador";
        for(int i=0;i<4;i++){
            System.out.println(Equipo[i]);
        }   
    }
    
}
