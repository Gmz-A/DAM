import java.util.Scanner;

public class UD04_Switch {

//Variables 
    static java.util.Scanner sc = new java.util.Scanner(System.in); 

//
    public static void main(String[] args) {

        System.out.print("Introduce A para alta y B para baja -> ");

    //Hacer mayuscula un char
        //Primero solicitamos un String para poder usar la biblioteca de .toUpperCase
        String opcionS = sc.next();
        //Aqui hacemos que el String se pase a mayuscula y despues de eso cojamos unicamente un caracter que seia el primero ya en mayuscula gracias a la funcion
        char opcion = opcionS.toUpperCase().charAt(0);

        mostrarOpcionChar(opcion);

    }

    static void mostrarOpcionChar (char opcion){
        switch (opcion) {
            case 'A':
                System.out.println("Has elegido Alta");
                break;

            case 'B':
                System.out.println("Has elegido Baja");
                break;
            

            default:
                System.out.println("Opcion no válida");
                break;
        }
    }
}
