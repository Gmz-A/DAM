import java.util.Scanner;

public class UD04_miniPrograma {

    static Scanner sc = new Scanner(System.in);
    static int edad;
    static String nombre;

    public static void main(String[] args) {

        leerDatos();
        
    }

    static boolean preguntarSiNo (String pregunta){
        
        String opcion;
        System.out.print(pregunta + " (Si/No) -> ");
        opcion = sc.nextLine().trim().toUpperCase();

        switch (opcion){
            case "si","sí" -> {return true;}
            case "no" -> {return false;}
            default -> {return false;}
        }
    }

    static void leerDatos (){
        System.out.print("Como te llamas -> ");
        nombre = sc.nextLine();

        System.out.print("Dime tu edad -> ");
        edad = sc.nextInt();
    }
}
