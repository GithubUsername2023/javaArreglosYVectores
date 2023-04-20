package arreglosyvectores;

import java.util.Random;

public class Extra3 {

    public static void main(String[] args) {
        /*
        Crear una función rellene un vector con números aleatorios, pasándole
        un arreglo por parámetro. Después haremos otra función o
        procedimiento que imprima el vector
        */
        int vector[]=new int[4];
                LlenarVector(vector);
        ImprimirVector(vector);
    }
    
    public static void LlenarVector (int vector[]){
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10)+1;
        }
    }
    
    public static void ImprimirVector (int vector[]) {    
        for (int elemento : vector) {
            System.out.println("[" + elemento + "]");
        }
    }
    
}
