import java.util.Scanner;

public class App {

    static int nota;
    static boolean aprobado;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("Dime la nota del alumno: ");
        comprobacionAprobado(nota);
    }

    public static void comprobacionAprobado(int valores) {
        if (valores >=5) {
            if ((valores == 5)&&(valores == 6) ) {
                System.out.println("Aprobado ");
            } else if ((valores == 7)&&(valores == 8)) {
                System.out.println("Notable");
            }else{
                System.out.println("Sobresaliente");
            }
        } else {
            if (valores >= 3) {
                System.out.println("Te quedaste cerca");
            } else {
                System.out.println("Te quedaste muy lejos de aprobar");
            }
        }
    }


}
