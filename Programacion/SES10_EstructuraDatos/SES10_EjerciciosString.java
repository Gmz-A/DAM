import java.util.Scanner;

public class SES10_EjerciciosString {

    static Scanner sc = new Scanner(System.in);
    static String palabra;
    static String palabra2;
    static char[] vocales = {'a','e','i','o','u'};


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
        int contadorVocales = 0;

        for (int i = 0; i < valores.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if ((valores.charAt(i))==(vocales[j])) {
                    //System.out.println(valores.charAt(i));
                    contadorVocales++;
                }
            }
        }

        System.out.println("Esta palabra tiene "+contadorVocales+" vocales en ella :)");
    }

    public static void ejercicio4(String valores) {
        
        Boolean comprobacion = true;

        System.out.print("Dame otra palabra -> ");
        palabra2 = sc.next();

        if (valores.length()==palabra2.length()) {
            for (int i = 0; i < valores.length(); i++) {
                while (comprobacion != false && i!=valores.length()) {
                    if ((valores.charAt(i)==(palabra2.charAt(i)))) {
                        comprobacion = true;
                        i++;
                    }else {
                        comprobacion = false;
                    }
                }
            }
        } else {
            comprobacion = false;
        }

        if (comprobacion==true) {
            System.out.println("Equals -> Si son iguales :)");
        } else {
            System.out.println("Equals -> Son palabras diferentes :(");
        }
    }

    public static String ejercicio5(String frase) {
        
        StringBuilder reversa = new StringBuilder();

        for (int i = frase.length()-1; i >= 0; i--) {
            reversa.append(frase.charAt(i));
        }
        
        return reversa.toString();
    }

    public static void ejercicio6(String valores) {
        
        int contador = 0;

        System.out.print("Dime una letra que buscar -> ");
        String letra = sc.next();

        char letraF = letra.charAt(0);

        for (int i = 0; i < valores.length(); i++) {
            if (valores.charAt(i)==letraF) {
                contador++;
            }
        }

        System.out.println("La palabra letra elegida a buscar es -> "+letraF);
        System.out.println("Esa letra sale "+contador+" veces :)");
    }

    public static void ejercicio7(String valores) {
        
        valores = valores.trim();
        char sepacaion = ' ';
        int espacio = 0;
        int espacio2= 0;

        for (int i = 0; i < valores.length(); i++) {
            if (valores.charAt(i)==sepacaion) {
                espacio = i;
                System.out.println(valores.substring(espacio2, espacio));
                espacio2 = espacio+1;
            } else {
                espacio = valores.length();
            }
        }
        System.out.println(valores.substring(espacio2,espacio));
    }

    public static void ejercicio8() {
        
        String texto = " hola mundo ";

        texto = texto.trim();

        texto = texto.replace("mundo", "java");

        texto = texto.toUpperCase();

        System.out.println(texto);
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

    public static void ejercicio10(String valores) {

        valores = valores.trim();

        valores = valores.replace(' ', ',');

        String[] palabras = valores.split(",");
        System.out.println("La frase tiene "+palabras.length+" palabras");

    }

    public static void ejercicio11(String valores) {
        
        valores = valores.trim();
        valores = valores.toLowerCase();
        String frasefinal = " ";

        for (int i = 0; i < valores.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (valores.charAt(i)==vocales[j]) {
                    frasefinal += '*';
                    i++;
                }
            }
            frasefinal += valores.charAt(i);
        }
        frasefinal = frasefinal.trim();
        System.out.println(frasefinal);
    }

    public static void ejercicio12(String valores) {
        
        boolean comprobaciones = false;
        String caracterEspecial = "@#$%&*{}";

        if (valores.length()<=8) {
            comprobaciones = false;
        } else {
            comprobaciones = true;
        }

        /*if (valores.toLowerCase()==valores.toUpperCase()) {
            comprobaciones = false;
        } else if (comprobaciones != false) {
            comprobaciones = true;
        }*/
        String palabra = valores.toUpperCase();

        if (comprobaciones != false) {
            for (int i = 0; i < valores.length(); i++) {
                if (valores.charAt(i)==palabra.charAt(i)) {
                    for (int j = 0; j < vocales.length; j++) {
                        if (comprobaciones =! false) {
                            if (valores.charAt(i)==caracterEspecial.charAt(j)) {
                                comprobaciones = false;
                            } else if (comprobaciones != false) {
                                comprobaciones = true;
                            }
                        }
                    }
                } 
            }
        }

        if (comprobaciones != false) {
            for (int i = 0; i < valores.length(); i++) {
                for (int j = 0; j < caracterEspecial.length(); j++) {
                    if (valores.charAt(i)==caracterEspecial.charAt(j)) {
                        if(comprobaciones =! false){
                            comprobaciones = true;
                        }
                    }
                }
            }
        }

        if (comprobaciones==true) {
            System.out.println("Contraseña Segura :)");
        } else {
            System.out.println("Contraseña no segura :(");
        }
    }

    public static String solicitarPalabra() {
        
        System.out.print("Dime una palabra -> ");
        palabra = sc.next();
        
        return palabra;
    }

    public static String solicitarFrase() {
        
        sc.nextLine();
        System.out.print("Escribe una pequeña frase -> ");
        palabra = sc.nextLine();
        
        return palabra;
    }

    public static void selector() {

        int ejercicio = 1;

        while (ejercicio != 0) {
            
            System.out.print("\nQue ejercicio quieres ver (0 para finalizar) -> ");
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
                    solicitarPalabra();
                    ejercicio3(palabra);
                    break;
                case 4:
                    solicitarPalabra();
                    ejercicio4(palabra);
                    break;
                case 5:
                    solicitarPalabra();
                    System.out.println(ejercicio5(palabra));
                    break;
                case 6:
                    solicitarPalabra();
                    ejercicio6(palabra);
                    break;
                case 7:
                    solicitarFrase();
                    ejercicio7(palabra);
                    break;
                case 8:
                    ejercicio8();
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
                    solicitarFrase();
                    ejercicio10(palabra);
                    break;
                case 11:
                    solicitarPalabra();
                    ejercicio11(palabra);
                    break;
                case 12:
                    solicitarPalabra();
                    ejercicio12(palabra);
                    break;        
                default:
                    break;
            }
        }
        System.out.println("\n:) :) :) :) :) :) :) :) :) :)");
        System.out.println(":) Gracias por interactuar :)");
        System.out.println(":) :) :) :) :) :) :) :) :) :)");
    }
}