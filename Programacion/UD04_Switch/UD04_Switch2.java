public class UD04_Switch2 {
    
    static java.util.Scanner sc = new java.util.Scanner(System.in); 

    public static void main(String[] args) {
        
        System.out.println(obtenerCalificacion(7));
        
    }

    static  void mostrarDiaSemana (int dia){
        
    }

    static  void mostrarDiaSemanaNuevo (int dia){

        switch (dia) {
            
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            
            case 3, 4, 5, 6 -> System.out.println("Dia laborable");
            case 7, 8, 9 -> System.out.println("Dia festivo");


            default -> System.out.println("Opción incorrecta");

        }    
    }

    static String obtenerCalificacion (int nota){

        return switch (nota){
            case 10, 9 -> "Sobresaliente";
            case 8,7 -> "Notable";
            case 6,5 -> "Aprobado";
            default -> "Suspenso";
        };
    }
}
