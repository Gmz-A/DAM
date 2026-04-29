import java.util.Scanner;

public class UD09_01_EjerciciosArrays {

    //Utiles
    static int[] array01 = {2,4,6,8,10}; 
    static int[] array02 = {1,9,4,2,8};
    static double[] array03 = {5.5,7.2,3.1,9.2,6.6,1.1};
    static String[] array04 = {"ajo", "feo","sal","puf","eje"};
    static int[][] array05 = {
        {2,4,6},
        {1,3,5},
        {2,3,4},
    };

    static String[][] array06 = {
        {"Pedro","Monica","Alfonso"}, //Alumnos
        {"Religion","Plastica","Musica  "}, //Asignaturas
    };
    static Scanner sc = new Scanner(System.in);
    static int ejercicio;

    public static void main(String[] args) {
        indice();
    } 

    public static void indice() {
        ejercicio = 1;
        while (ejercicio != 0) {
            System.out.println();
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println();
            System.out.println("Cuando no quieras ver mas ejercicios indica 0.");
            System.out.print("Que ejercicio quieres ver: ");
            ejercicio = sc.nextInt();
            System.out.println();
            switch (ejercicio) {
                /*case 0:
                    break;*/
                case 1:
                    System.out.println("Ejercicio " + ejercicio + " : (crear un array mostrando todos sus elementos introducidos");
                    ejercicio1(array01);
                    break;
                case 2:
                    System.out.println("Ejercicio " + ejercicio + " : (ej1 con for-each)");
                    ejercicio2(array01);
                    break;
                case 3:
                    System.out.println("Ejercicio " + ejercicio + " : (Sumar los elementos del array usando el for y for-each");
                    ejercicio3(array01);
                    ejercicio3v2(array01);
                    break;
                case 4:
                    System.out.println("Ejercicio " + ejercicio + " : (Encontrar el numero mayor dentro del array)");
                    ejercicio4(array02);
                    break;
                case 5:
                    System.out.println("Ejercicio " + ejercicio + " : (Contar los aprobados de una serie de notas)");
                    ejercicio5(array03);
                    break;
                case 6:
                    System.out.println("Ejercicio " + ejercicio + " : (Acierta la palabra oculta)");
                    ejercicio6(array04);
                    break;                
                case 7:
                    System.out.println("Ejercicio " + ejercicio + " : (Calcular una media de valores)");
                    ejercicio7(array03);
                    break;
                case 8:
                    System.out.println("Ejercicio " + ejercicio + " : (Invertir un array)");
                    ejercicio8(array01);
                    break;
                case 9:
                    System.out.println("Ejercicio " + ejercicio + " : (Crear una matriz de 3x3 mostrnado todos los elementos)");
                    ejercicio9(array05);
                    break;
                case 10:
                    System.out.println("Ejercicio " + ejercicio + " : (Calcular la media de un array tridimensional con alumnos y asignaturas)");
                    ejercicio10(array06, array03);
                    break;                                                        
                default:
                    break;
            }
        }
        System.out.println("Muchas gracias por la interaccion, nos vemos :)");
    }

    public static void ejercicio1(int[] valores) {
        System.out.print(" | ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " | ");
        }
    }

    public static void ejercicio2(int[] valores) {
        for (int valor : valores) {
            System.out.print(" | "+valor);
        }
    }

    public static void ejercicio3 (int[] valores) {
        int suma = 0;
        System.out.print("For -> ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(suma+" + "+valores[i]+" = "+(suma+valores[i])+" | ");
            suma += valores[i];
        }
        System.out.println("Resultado de la suma = "+suma);
    }

    public static void ejercicio3v2(int[] valores) {
        int suma = 0;
        System.out.print("for-each -> ");
        for (int valor : valores) {
            System.out.print(suma+" + "+valor+" = "+(suma+valor)+" | ");
            suma += valor;
        }
        System.out.println("Resultado de la suma = "+suma);
    }

    public static void ejercicio4(int[] valores) {
        int numeroMayor=0;

        /*for (int i = 0; i < valores.length; i++) {
            if (valores[i]>numeroMayor) {
                numeroMayor = valores[i];
            }
        }*/
        for (int i = valores.length-1; i != 0; i--) {
            if (valores[i]>numeroMayor) {
                numeroMayor = valores[i];
            }
        }
        System.out.println("El numero mayor es el " + numeroMayor);
    }

    public static void ejercicio5(double[] valores) {
        double[] aprobados = new double[5];
        double[] suspensos = new double[5];

        int j = 0;
        int y = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i]>=5) {
                aprobados[j] = valores[i];
                j++;
            } else {
                suspensos[y]= valores[i];
                y++;
            }
        }
        
        System.out.print("Aprobados -> ");
        for (int i = 0; i < aprobados.length; i++) {
            if (aprobados != null) {
                System.out.print(aprobados[i]);
            }
            System.out.print(" | ");
        }
        System.out.println();
        System.out.print("Suspensos -> ");
        for (int i = 0; i < suspensos.length; i++) {
            if (suspensos != null) {
                System.out.print(suspensos[i]);
            }
            System.out.print(" | ");
        }
    }

    public static void ejercicio6(String[] valores) {
        String palabra;
        String continuar = "si";
        Boolean correcta = false;

        System.out.println("Hola, a ver si adivinas una de las palabras de 3 letras que tengo almacenadas");

        while (correcta != true) {

            System.out.print("Que palabra crees que es -> ");

            palabra = sc.next();

            palabra = palabra.toLowerCase();

            for (int i = 0; i < valores.length; i++) {
                if (palabra.equals(valores[i])) {
                    correcta = true;
                } else if(correcta != true) {
                    correcta = false;
                }
            }
            
            if (correcta == false){
            System.out.print("No encontrado, ¿deseas volver a intentarlo? -> ");
            continuar = sc.next();
            continuar = continuar.toLowerCase();
            }

            if (correcta == true){
                System.out.print("¡¡¡¡¡ENCONTRADO!!!!!");
            } else if (continuar.equals("no")) {
                System.out.print("Gracias por intentarlo, hasta la proxima");
                correcta = true;
            }
        }
        
    }

    public static void ejercicio7(double[] valores) {
        double media = 0;

        for (double valor : valores) {
            media += valor;
        }

        media = media / valores.length;
        
        System.out.print("La media de las asignaturas de ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
            if (i != valores.length-1) {
                System.out.print(" + ");
            } else {
                System.out.print("= ");
            }
        }
        System.out.print("¡¡"+media+"!!");
    }

    public static void ejercicio8(int[] valores) {

        int[] arInverso = new int[5];
        int j = 0;

        for (int i = valores.length - 1; i >= 0; i--) {

            arInverso[j] += valores[i];

            j++;
        }

        System.out.print("Array 1 -> ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]+" | ");
        }
        
        System.out.println();
        
        System.out.print("Array 2 -> ");
        for (int i = 0; i < arInverso.length; i++) {
            System.out.print(arInverso[i]+ " | ");
        }
    }

    public static void ejercicio9(int[][] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Fila "+(i+1)+" -> ");
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j]+" | ");
            }
            System.out.println();
        }
    }
    public static void ejercicio10(String[][] valores, double[] valores2){

        //vamos a generar el bucle del nombre del alumno
        for (int i = 0; i != 1; i++) {
            for (int j = 0; j <= valores.length; j++) {
                System.out.println(valores[i][j]);

                //vamos a generar el bucle de las asignaturas
                for (int i2 = 1; i2 != 2; i2++) {
                    for (int j2 = 0; j2 < valores[i2].length; j2++) {
                        System.out.print(" -> "+valores[i2][j2]+" = ");

                        double media = 0;
                        switch (j2) {
                            case 0:
                                for (int k = 0; k < valores2.length; k++) {
                                    System.out.print(valores2[k]+" | ");
                                    media += valores2[k];
                                }
                                media = media/valores2.length;
                                System.out.print("Media = "+media);
                                break;
                            case 1:
                                for (int k = 1; k < valores2.length; k+=1) {
                                    System.out.print(valores2[k]+" | ");
                                    media += valores2[k];
                                }
                                media = media/valores2.length;
                                System.out.print("Media = "+media);
                                break;
                            case 2:
                                for (int k = 0; k < valores2.length; k+=2) {
                                    System.out.print(valores2[k]+" | ");
                                    media += valores2[k];
                                }                                
                                media = media/valores2.length;
                                System.out.print("Media = "+media);
                                break;
                            default:
                                break;
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
