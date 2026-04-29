public class UD03_Scanner_If {

    //Variables fijas
    static final int FAMILIA_NUMEROSA = 3;
    static final double IVA = 0.21;
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    //Varaiables modificables
    static int hijos = 0;

    static void main(String[] args) {
        if(hijos == 0){
            System.out.println("Datos Incorrectos");
            numeroHijos();
        } else if(hijos > 3) {
            System.out.println("Eres una familia numerosa");
        } else {
            System.out.println("No eres familia numerosa, tienes " + hijos + "hijos");
        }
        
        
        casteo();
    }

    static void numeroHijos(){
        System.out.println("Cuantos hijos tienes?");
        int hijos = sc.nextInt();
        
    }

    static void casteo(){
    //Forma correcta 
        int a = 10;
        double b = a;
        
        System.out.println(a);
        System.out.println(b);


    //Perdida de informacion 
        double c = 10.0;
        int d = (int) c;
        System.out.println(c);
        System.out.println(d);
    }

}
