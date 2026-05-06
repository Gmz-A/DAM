public class Usuario {

    private String nombre;
    private int edad;

    public Usuario(String n, int e){
        this.nombre = n;
        setEdad(e);
    }

    public Usuario (String n){
        this.nombre = n;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int e){
        if (e > 0) {
            this.edad = 0;
        } else {
            System.out.println("Edad no valida, se asignara 1");
            this.edad = 1;
        }
    }

    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario: ");
        sb.append("Nombre = ").append(this.nombre);
        sb.append(", edad = ").append(this.edad);

        return sb.toString();
    }
}
