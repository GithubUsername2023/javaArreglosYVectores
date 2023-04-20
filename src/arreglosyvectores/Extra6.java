package arreglosyvectores;

import java.util.Random;
import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
        caracteres y, a medida que el usuario las va ingresando, construya una
        “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
        palabras se ubicarán todas en orden horizontal en una fila que será
        seleccionada de manera aleatoria. Una vez concluida la ubicación de las
        palabras, rellene los espacios no utilizados con un número aleatorio del 0
        al 9. Finalmente imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java substring(), Length() y Math.random()
        */
        Scanner leer=new Scanner(System.in);
        Random random=new Random();
        String aux, palabra[]=new String[5];
        String sopa[][]=new String[20][20];
//        Ingresar los valores
        for (int i = 0; i < 5; i++) {
            do{
            System.out.println("Ingrese la [ "+(i+1)+" ] palabra entre 3 y 5 caracteres");
            palabra[i]=leer.next();
            aux=palabra[i];
            }while(aux.length()<3||aux.length()>5);    
        }
//        Crear sopa
        int con,col=0,fil=0;
        for (int i = 0; i < 5; i++) {
            con=0;
            aux=palabra[i];
            col=random.nextInt(20)+1;
            for (int j = 0; j < aux.length(); j++) {
                System.out.print(con);
                con++;
                if(aux.length()==5){
                    fil=random.nextInt(15)+1;
                }else if(aux.length()==4){
                    fil=random.nextInt(16)+1;
                }else{
                    fil=random.nextInt(17)+1;                
                }
            }
            System.out.println("");
            System.out.println(fil);
            System.out.println(col);
        }
    }
}
