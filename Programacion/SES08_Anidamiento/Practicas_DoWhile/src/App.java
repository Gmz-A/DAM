import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static int opcion;

    public static void main(String[] args) throws Exception {

        do{

            mostrsarmenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Funciona validar numero");
                    break;
                case 2:
                    System.out.println("Funciona prueba for");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }

    public static void mostrsarmenu() {
        
        System.out.println("\n---Menu---");
        System.out.println("0. Salir ");
        System.out.println("1. Validar Numero ");
        System.out.println("2. Prueba For ");
        System.out.print("Elige una opcion -> ");
        
    }
}
