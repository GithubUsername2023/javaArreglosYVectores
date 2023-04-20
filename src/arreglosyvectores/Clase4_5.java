package arreglosyvectores;

import java.util.Random;

public class Clase4_5 {

    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica.
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su
        propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
        A = ՞AT. La matriz traspuesta de una matriz A se denota por AT y se
        obtiene cambiando sus filas por columnas (o viceversa)
        */
        Random random=new Random();
        int matriz[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=random.nextInt(9)-4;
            }
        }
        /*
        Para comprobar que la matriz sea antisimétrica puede utilizar estos valores y comentar el for random.
        matriz[0][0]=0;matriz[0][1]=-2;matriz[0][2]=4;matriz[1][0]=2;matriz[1][1]=0;matriz[1][2]=2;matriz[2][0]=-4;matriz[2][1]=-2;matriz[2][2]=0;        
        */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
        int con=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]==(matriz[j][i])*(-1)){
                    con++;
                }
            }
        }        
        if(con==9)
            System.out.println("La matris es antisimétrica");
    }
    
}
