import java.util.Scanner;

    public class UD07_While {
    public static void main(String[] args) {
        validarNumero();
        contadorNumeros();
    }

    public static void validarNumero () {
        Scanner sc = new Scanner(System.in);
        int numero;
            
        System.out.print("\nIntroduce un numero positivo: ");
        numero = sc.nextInt();

        while (numero <= 0) {
            System.out.print("Error, tiene que se positivo: ");
            numero = sc.nextInt();
        }

        System.out.println("Numero: " + numero);
    }

    public static void contadorNumeros() {
        int n = 1;

        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        
    }
}
