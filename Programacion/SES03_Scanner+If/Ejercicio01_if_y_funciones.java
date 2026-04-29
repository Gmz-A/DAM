
public class Ejercicio01_if_y_funciones {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    //Variables
    static String nombre;
    static int edad;
    static String autorizacion_medica;
    static int entrenamientos;

    //Fijas
    static int edad_minima = 16;
    
    public static void main(String[] args) {

        //Iniciamos el programa y solicitamos los datos
        solicitarDatos();

        //Leer los datos que se han introducido
        leerDatos();

        //Mostramos el informe final 
        mostrarInforme();
    } 

    static void resolucion (){
        if (edad >= 16 && autorizacion_medica.equalsIgnoreCase("si") && entrenamientos >= 3){
            System.out.println(nombre + ", ¡¡ERES APTO PARA LA CARRERA!!");
        } else {
            System.out.println(nombre + ", No eres apto para la carrera :(");
        }
    }

    static void leerDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Autorizacion medica: " + autorizacion_medica);
        System.out.println("Entrenamientos este mes: " + entrenamientos);
    }

    static void clasificarEdad(){
        if (edad < 18) {
            System.out.println("Eres menor :)");
        } else if (edad > 18 && edad < 40) {
            System.out.println("Eres adulto ;)");
        } else {
            System.out.println("Eres veterano :/");
        }
    }

    static void solicitarDatos(){
        System.out.print("Como te llamas: ");
            nombre = sc.nextLine();

        System.out.print("Cuantos años tienes: ");
            edad = sc.nextInt();

        System.out.print("Tienes autorizacion medica: ");
            autorizacion_medica = sc.next();

        System.out.print("Cuantos entrenamientos has realizado: ");
            entrenamientos = sc.nextInt();
    }

    static void mostrarInforme (){
        System.out.println("--- Informe ---");
        System.out.println("Nombre: " + nombre);
        System.out.print("Clasificacion edad: ");
        clasificarEdad();
        System.out.print("Puedes participar: ");
        resolucion();

    }
}
