import java.lang.reflect.Array;
import java.util.Arrays;

public class SES10_01_String {

    static String frase1 = "Hola estoy aqui, puedo tocarte el pelo? ";
    static int inicial = 2;
    static int ultimo = 76;
    public static void main(String[] args) {
        //inmutabilidad();
        //metodosEsenciales();
        comparadores(frase1);
        secuenciaNum(inicial, ultimo);
    }

    public static void inmutabilidad() {
        System.out.println("--Inmutabilidad--");

        String texto = "Hola ke ase";

        texto.toUpperCase();

        System.out.println("Texto: "+texto); //en este caso texto se vería como al generar la variable ya que el .toUpperCase() solo funciona si se usa en esa misma linea y deja de ser usado al continuar
        
        texto = texto.toUpperCase();

        System.out.println("Texto: "+texto); //aqui hacemos que se convierta todo a mayusculas a machete
    }

    public static void metodosEsenciales() {
        System.out.println("Prueba de Varias Funciones");

        String frase = "Quiero un bocadillo";

        System.out.println("Longitud: "+frase.length()); //identificar la longitud del String

        System.out.println("Carácter en posicion 1 -> "+frase.charAt(1));
        //System.out.println("Carácter en posicion 1"+frase.charAt(120)); //en este caso daria error de compilacion porque esta fuera de rango de la frase

        System.out.println("Subestring de 0 a 4 -> "+frase.substring(6)); //En este caso se corta desde la posicion 6 hasta el final.
        System.out.println("Subestring de 0 a 4 -> "+frase.substring(0, 4)); //Aqui decidimos desde donde empezamos y donde terminamos.

        System.out.println("Posicion de boca -> "+frase.indexOf("boca")); //te indica la posicion de la primera letra de toda esta palabra
        System.out.println("Posicion de boca -> "+frase.indexOf("o")); //indica la posicion de la primera letra que sea igual a esta 
        System.out.println("Posicion de boca -> "+frase.indexOf("keso")); // te dara un valor negativo que significa que no encuentra la palabra dentro del String 
    }

    public static void comparadores(String frase) {
        System.out.println(frase.trim()); //con el .trim() lo que hacemos es que elimine los espacios del principio y del final del String
        
        String texto = "Me justa muxisimo Java y me justa la chele con locacao";
        System.out.println("Replace -> "+texto.replace("chele", "cocholate")); //aqio sutituimos solo una palabra por otra 
        System.out.println("Replace -> "+texto.replace("justa", "pica")); //en este caso sustitumos todas las palabras iguales que haya en el texto

        String datos = "Juan,25,Madrid";
        String [] partes = datos.split(","); //Lo que estamos haciendo con esta herramienta es indicar que la coma es el indicativo de separacion para almacenar dentro del Array
        System.out.println("Ficha 1 -> "+Arrays.toString(partes)); //De esta manera estamos mostrando todos los valores dentro del array de manera mucho mas sencilla

        secuenciaNum(inicial, ultimo);
    }

    public static void secuenciaNum(int inicial, int ultimo) {
        
        StringBuilder secuencia = new StringBuilder();

        if (inicial > ultimo){
            System.out.println("El primer numero de la secuencia no puede ser mayor que el ultimo");
            return;
        }

        for (int i = inicial; i <= ultimo; i++) {
            secuencia.append(i);
            secuencia.append(" ");
        }

        System.out.println("Secuencia de Numeros -> "+secuencia);
    }
}
