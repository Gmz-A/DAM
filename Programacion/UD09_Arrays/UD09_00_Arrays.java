public class UD09_00_Arrays {
    public static void main(String[] args) {
        
        //declarar el array
        String[] profesores; 
        //darle el tamaño al array
        profesores = new String[10];

        //Otra Opcion 
        String profesores2[] = new String[10];

        //otra forma de introducir valores directamente
        String[] alumnos = {"Jacinto", "Ladislao", "Edelmira", "Rigoberta"};

        //otra forma 
        String[] asignaturas;
        asignaturas = new String[] {"pro", "LM", "BBDD"};


        //Añadir Valores 
        profesores[0] = "Ana";
        profesores[1] = "Luis";
        profesores[2] = "Marta";
        profesores[3] = "Martina";
        //En este caso estariamos teniendo 7 valores vacíos. No es obligarorio seguir un orden secuencial para almacenar los valores pero es recomendable.

        profesores2[0] = "Ana";
        profesores2[3] = "Luis";
        profesores2[9] = "Marta";
        profesores2[7] = "Martina";


        //crear una matriz bidimensional
        double[][] notas = { //El primer [] -> filas | El segundo [] -> Columnas
            {8.5,7.0,6.5},
            {6.0,10.0,6.7},
            {9.5,8.9,5.7}
        };  

        //imprimir por pantalla
        System.out.println(profesores[1]);
        System.out.println(profesores[3]);
        //un valor null es que no hay ningun valor introducido


        //variable auxiliar
        int numProfesores = 4;

        //usar funcion con array y bucles
        mostrarElementos(alumnos); //realizamos un bucle que muestre todos los valores dentro del array alumnos 
        System.out.println();
        mostrarElementos(profesores); //realizamos un bucle del array profesores en el que vemos todos los valores null que tenemos 
        System.out.println();
        mostrarElementos2(profesores, numProfesores); //generamos un programa que se dedica unicamente a almacenar los valores del array que esten rellenos
        System.out.println();
        mostrarElementos3(profesores2); //funcion que se encarga de leer todas las celdas del array pero solo va a imprimir por pantallas las que no tengan un valor null
        System.out.println();
        mostrarConForEach(profesores); //
        System.out.println();
        recorrerMatriz(notas);
    }

    public static void mostrarElementos(String[] elementos) {
        System.out.println("Lista de Alumnos");

        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
    }

    public static void mostrarElementos2(String[] elementos, int numeroElementos) {
        System.out.println("Lista de Alumnos");

        for (int i = 0; i < numeroElementos; i++) {
            System.out.print(elementos[i] + " ");
        }
    }

    //solo muestra los valores que tienen un valor añadido
    public static void mostrarElementos3(String[] elementos) { 
        System.out.println("Lista de Alumnos");

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != null ) {
                System.out.print(elementos[i] + " ");
            }
        }
    }

    public static void mostrarConForEach(String[] elementos) {
        System.out.println("For Each");
        for (String elemento : elementos) {
            if (elemento != null) {
                System.out.println("- " + elemento);            
            }
        }
    }

    public static void recorrerMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
