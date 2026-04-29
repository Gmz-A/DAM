import java.util.Scanner;

public class SES10_EjerciciosString {

    static Scanner sc = new Scanner(System.in);
    static String palabra;

    public static void main(String[] args) {
        selector();
    }

    public static void ejercicio1(String valores) {
        
        System.out.println("La palabra original es -> "+valores);
        System.out.println("Tiene "+ valores.length()+" carácteres");
        System.out.println("La primera lerta es -> "+valores.charAt(0));
        System.out.println("La ultima letra es -> "+valores.charAt(valores.length()-1));

    }

    public static void ejercicio2(String valores) {
        
        for (int i = 0; i < valores.length(); i++) {
            System.out.println(valores.charAt(i));
        }

    }

    public static void ejercicio3(String valores) {
    
        valores = valores.toLowerCase();

        for (int i = 0; i < valores.length(); i++) {
            char carac = valores.charAt(i);

        }

    }

    public static void ejercicio4(String valores) {
        
        

    }

    public static String ejercicio5(String frase) {
        
        StringBuilder reversa = new StringBuilder();

        solicitarPalabra();

        for (int i = frase.length()-1; i >= 0; i--) {
            reversa.append(frase.charAt(i));
        }
        
        return reversa.toString();
    }

    public static boolean ejercicio9(String frase) {
                
        StringBuilder reversa = new StringBuilder();

        for (int i = frase.length()-1; i >= 0; i--) {
            reversa.append(frase.charAt(i));
        }
        
        if (frase.equals(reversa.toString())) {
            return true;
        } else {
            return false;
        }
    }


    public static String solicitarPalabra() {
        
        System.out.print("Dime una palabra -> ");
        palabra = sc.next();
        
        return palabra;
    }

    public static void selector() {

        int ejercicio = 1;

        while (ejercicio != 0) {
            
            System.out.print("Que ejercicio quieres ver (0 para finalizar) -> ");
            ejercicio = sc.nextInt();

            switch (ejercicio) {
                case 1:
                    solicitarPalabra();
                    ejercicio1(palabra);
                    break;
                case 2:
                    solicitarPalabra();
                    ejercicio2(palabra);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println(ejercicio5(palabra));
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    solicitarPalabra();
                    if (ejercicio9(palabra)) {
                        System.out.println("La palabra es palindromo");
                    } else {
                        System.out.println("No es palindromo");
                    }
                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;        
                default:
                    break;
            }
        }
        System.out.println("Gracias por interactuar :)");
    }
}