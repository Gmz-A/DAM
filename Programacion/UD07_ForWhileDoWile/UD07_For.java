import java.util.Scanner;

public class UD07_For {
    public static void main(String[] args) {
        contarConFor();
        contarConForInverso();
        contarConForParesImpares();
        forBidimensional();
    } 
    
    public static void contarConFor(){
    //secuencia conteo del 1 al 10 
    System.out.println("\nContando de 1 al 10: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void contarConForInverso() {
        System.out.println();
        System.out.println("Contador inverso de 10 a 0:");
            for (int i = 10; i >= 0; i--) {
                System.out.print(i + " ");
            }
    }

    public static void contarConForParesImpares() {
        System.out.println();

        System.out.println("Contador pares de 0 a 5:");
        for (int i = 0; i <= 5; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Contador impares del 0 al 5:");
        for (int i = 1; i <= 5; i +=2) {
            System.out.print(i + " ");
        }
        
        //programa que solo imprima por pantalla los numereros que sean pares 
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.print("Par: " + i + " ");
            }
        }

        for (int i = 0; i <= 10; i++) {
            if(i % 2 != 0){
                System.out.print("Impar: " + i + " ");
            }
        }
    }

    public static void forBidimensional() {
        
        System.out.println();
        System.out.println("Tabla simple:");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " x " + j + " = " + (i*j) + " | ");
            }
            System.out.println();

        }
    }
}
