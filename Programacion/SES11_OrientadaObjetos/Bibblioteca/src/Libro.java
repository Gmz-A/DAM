public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro {");
        sb.append("Libro = ").append(titulo).append('\'');
        sb.append(", Autor = ").append(autor).append('\'');
        sb.append(", Disponible = ").append(disponible);
        sb.append('}');
        return sb.toString();
    }   
}