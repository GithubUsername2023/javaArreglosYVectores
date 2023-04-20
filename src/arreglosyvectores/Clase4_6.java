package arreglosyvectores;

import java.util.Random;

public class Clase4_6 {

    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
        1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
        idénticas. Crear un programa que permita introducir un cuadrado por
        teclado y determine si este cuadrado es mágico o no. El programa
        deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9
        */
        Random random=new Random();
        int matriz[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=random.nextInt(9)+1;
            }
        }
//        Para comprobar que la matriz sea un cuadrado mágico puede utilizar estos valores y comentar el for random.
//        matriz[0][0]=2;matriz[0][1]=7;matriz[0][2]=6;matriz[1][0]=9;matriz[1][1]=5;matriz[1][2]=1;matriz[2][0]=4;matriz[2][1]=3;matriz[2][2]=8;        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        int sumFil,sum=0;
        boolean magica=true;
//        Suma las filas del cuadrado
        for (int i = 0; i < 3; i++) {
            sumFil=0;
            for (int j = 0; j < 3; j++) {
                sumFil+=matriz[i][j];
            }
            if(sum==0)
                sum=sumFil;
            if(sum!=sumFil){
                magica=false;
                break;}   
        }
//        Suma las columnas del cuadrado
        int sumCol;
        for (int i = 0; i < 3; i++) {
            sumCol=0;
            for (int j = 0; j < 3; j++) {
                sumCol+=matriz[j][i];
            }
            if(sum!=sumCol){
                magica=false;
                break;}             
        }
        int sumDiag=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                    sumDiag+=matriz[i][j];
                }
            }         
        }
        if(sum!=sumDiag)
            magica=false;
             
        if(magica==true){
            System.out.println("Es un cuadrado mágico");
        }else{
            System.out.println("No es un cuadrado mágico");        
        }                 
    }
    
}
