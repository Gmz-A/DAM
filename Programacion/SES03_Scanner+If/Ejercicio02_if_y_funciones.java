import java.util.Scanner;

public class Ejercicio02_if_y_funciones {
    
//Herramientas
    static java.util.Scanner sc = new Scanner(System.in);

//Variables
    static String nombre;
    static int edad;
    static double precio_base;
    static String estudiante;
    static String material_adicional;
    static int descuento = 0;

//Main
    public static void main(String[] args) {
        //Iniciamos con las preguntas para rellenar las variables
        preguntas();

        //Leemos los datos escritos 
        leerDatos();

        //Ejecutamos la funcion calcular para saber el precio 
        calcularPrecioFinal();

        //Imrpimimos el informe por pantalla 
        imprimirinforme();
    }

//Funciones 
    static void leerDatos(){
        System.out.println("");
        System.out.println("Hola " + nombre + " los datos que has introducido son: ");
        System.out.println("Nombre -> " + nombre);
        System.out.println("Edad -> " + edad);
        System.out.println("Precio base: -> " + precio_base);
        System.out.println("Estudiante -> " + estudiante);
        System.out.println("Material Adicional -> " + material_adicional);
    }

    static void calcularPrecioFinal(){
        esEstudiante();
        if (edad <= 18){
            descuento = descuento + 5;
        } else if(material_adicional.equalsIgnoreCase("si")){
            precio_base = precio_base + 20;
        }

        precio_base = precio_base - (precio_base * descuento / 100);

        precio_base = precio_base + (precio_base * 10 / 100);
    }

    static void esEstudiante(){
        if(estudiante.equalsIgnoreCase("si")){
            descuento = descuento + 10;
        }
    }

    static void imprimirinforme(){
        System.out.println("");
        System.out.println("-- Informe --");
        System.out.println("Alumno: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Descuento Aplicado: " + descuento + " %");
        System.out.println("Precio Final: " + precio_base + " €");
    }

    static void preguntas (){
        System.out.print("Como te llamas -> ");
        nombre = sc.nextLine();

        System.out.print("Que edad tienes -> ");
        edad = sc.nextInt();

        System.out.print("Precio base del curso -> ");
        precio_base = sc.nextDouble();

        System.out.print("Eres estudante -> ");
        estudiante = sc.next();

        System.out.print("Quieres Material adicional -> ");
        material_adicional = sc.next();
    }

}
