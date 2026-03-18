public class UD04_Switch {

//Variables 
    static boolean aprobado;
    static double nota1;
    static double nota2;

//
    public static void main(String[] args) {
        double media = calcularMedia(nota1, nota2);


    }

//Funciones
    static boolean esAprobado (double nota){
        if(nota < 5){
            return false;
        } else {
            return true;
        }
    }
}
