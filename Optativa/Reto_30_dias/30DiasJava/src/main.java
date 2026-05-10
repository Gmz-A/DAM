import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        selector();
    }




    public static void dia01() {
        String nombre;
        int nacimiento = 0;
        String ciudad;
        int edad = 2026 - nacimiento;

        System.out.print("Dime tu nombre -> ");
        nombre = sc.next();
        System.out.print("En que año naciste -> ");
        nacimiento = sc.nextInt();
        System.out.print("En que ciudad naciste -> ");
        ciudad = sc.next();

        System.out.println("---- FICHA DE USUARIO ----");
        System.out.print("Nombre: ");
        System.out.println(nombre);
        System.out.print("Ciudad: ");
        System.out.println(ciudad);
        System.out.print("Edad: ");
        System.out.println(edad);
    }

    public static void dia02() {
        String nombreProducto;
        double precio = 0;
        double cantidad = 0;

        double precioTotal = precio*cantidad;
        double iva = precioTotal*0.21;
        double precioFinal = precioTotal + iva;

        System.out.print("Dime el nombre del producto ->");
        nombreProducto = sc.next();
        System.out.print("Dime su precio unitario -> ");
        precio = sc.nextDouble();
        System.out.print("Dime la cantidad -> ");
        cantidad = sc.nextDouble();

        System.out.println("---- TICKET ----");
        System.out.print("Producto: ");
        System.out.println(nombreProducto);
        System.out.print("Cantidad: ");
        System.out.println(cantidad);
        System.out.print("Precio Unitario: ");
        System.out.println(precio);
        System.out.print("Subtotal: ");
        System.out.println(precioTotal);
        System.out.print("Iva: ");
        System.out.println(iva);
        System.out.print("Total: ");
        System.out.println(precioFinal);
    }

    public static void selector() {
        int ejercicio = 1;

        while (ejercicio != 0) {
            System.out.print("Dime que ejercicio quiere ver (0 para salir) -> ");
            ejercicio = sc.nextInt();
            switch (ejercicio) {
                case 1:
                    dia01();
                    break;

                case 2:
                    dia02();
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:

                    break;

                case 13:

                    break;

                case 14:

                    break;

                case 15:

                    break;

                case 16:

                    break;

                case 17:

                    break;

                case 18:

                    break;

                case 19:

                    break;

                case 20:

                    break;

                case 21:

                    break;

                case 22:

                    break;

                case 23:

                    break;

                case 24:

                    break;

                case 25:

                    break;

                case 26:

                    break;

                case 27:

                    break;

                case 28:

                    break;

                case 29:

                    break;

                case 30:

                    break;
                
                default:
                    break;
            }
        }
        System.out.println("Gracias por interactuar :)");
    }
}
