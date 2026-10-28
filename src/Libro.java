public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro() {
        disponible = true;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido.");
        }
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

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro\"" + titulo + "\" fue prestado.");
            return true;
        } else {
            System.out.println("El libro\"" + titulo + "\" ya esta prestado,");
            return false;
        }
    }

    public void devolver() {
        if (!disponible){
            disponible = true;
            System.out.println("libro devuelto");
        }else{
            System.out.println("le libro ya estaba disponible");
        }
    }
}