public class Pruebas {
    public static void main(String[] args) {
        // 1. Declaración de un literal char usando comillas simples [5, 6]
        char opcionMenu = 'B'; 
        
        System.out.println("--- Mini Asistente de Caracteres ---");

        // 2. Uso de char en una estructura switch [2, 7]
        // Es ideal para menús de opciones simples
        switch (opcionMenu) {
            case 'A':
                System.out.println("Has seleccionado la opción A.");
                break;
            case 'B':
                System.out.println("Has seleccionado la opción B.");
                // 3. Naturaleza numérica del char [3, 8]
                // Podemos realizar operaciones matemáticas con caracteres
                char siguienteLetra = (char) (opcionMenu + 1); // Casting a char [9]
                System.out.println("Dato curioso: Después de la " + opcionMenu + " viene la " + siguienteLetra);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        // 4. Obtención de caracteres desde un String usando charAt() [10, 11]
        String mensaje = "Hola";
        char primeraLetra = mensaje.charAt(0); // Obtiene el char en la posición 0 [11]
        System.out.println("\nLa primera letra de '" + mensaje + "' es: " + primeraLetra);

        // 5. Comparación de caracteres con operadores relacionales [12, 13]
        char letra1 = 'a';
        char letra2 = 'z';
        if (letra1 < letra2) { // Compara basándose en su valor numérico Unicode [3, 13]
            System.out.println("En el alfabeto, '" + letra1 + "' va antes que '" + letra2 + "'.");
        }
        
        // 6. Visualización del código Unicode numérico [9, 14]
        char simbolo = 'ñ';
        int codigoUnicode = (int) simbolo; // Casting de char a int para ver su valor [15]
        System.out.println("El carácter '" + simbolo + "' tiene el código Unicode: " + codigoUnicode);
    }
}
