package arreglosyvectores;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        /*
        Los profesores del curso de programación de Egg necesitan llevar un
        registro de las notas adquiridas por sus 10 alumnos para luego obtener
        una cantidad de aprobados y desaprobados. Durante el período de
        cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
        evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
            Primer trabajo práctico evaluativo 10%
            Segundo trabajo práctico evaluativo 15%
            Primer Integrador 25%
            Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el
        arreglo. Al final del programa los profesores necesitan obtener por
        pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
        que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
        notas del curso.
        */
        Scanner leer=new Scanner(System.in);
        int aprobados=0,desaprobado=0;
        double matrizAlumnos[][],notaFinal[];
        matrizAlumnos=new double[10][4];
        notaFinal=new double[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                matrizAlumnos[i][j]= Math.random()*10;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            double promedio=0;
            for (int j = 0; j < 4; j++) {
                switch(j){
                    case 0:
                        promedio+=matrizAlumnos[i][j]*0.1;
                        break;
                    case 1:
                        promedio+=matrizAlumnos[i][j]*0.15;
                        break;
                    case 2:
                        promedio+=matrizAlumnos[i][j]*0.25;
                        break;
                    case 3:
                        promedio+=matrizAlumnos[i][j]*0.5;
                        break;                        
                }
            }
            notaFinal[i]=promedio;
        }
        
        for (double d : notaFinal) {
            System.out.printf("[%.2f]%n", d);           
        }

        for (int i = 0; i < notaFinal.length; i++) {
            if (notaFinal[i]>=7) {
                aprobados++;    
            }else {
                desaprobado++;
            }
        }
        System.out.println("Cantidad de aprobados: "+ aprobados);
        System.out.println("Cantidad de desaprobados: "+ desaprobado);
    }
    
}
