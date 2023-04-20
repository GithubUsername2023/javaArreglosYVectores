package arreglosyvectores;

public class Clase4_1 {

    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector con los 100 primeros números
        enteros y los muestre por pantalla en orden descendente.
        */
        int vector[]=new int[100];
        for(int i=0;i<100;i++){
            vector[i]=i+1;
        }
        for(int i=100;i>0;i--){
            System.out.println(vector[i-1]);
        }
    }
    
}
