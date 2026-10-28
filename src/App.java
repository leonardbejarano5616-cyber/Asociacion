public class App {
    public static void main(String[] args) throws Exception {
        ////////LIBRO///////
        Libro libro1 = new Libro("It", "Stephen King");
        Libro libro2 = new Libro("Carrie", "Stephen King");

        ///////LECTOR//////
        Lector lector1 = new Lector("Ana Torres", "1040586325");
        Lector lector2 = new Lector("Jennie Jackson", "1001546378");

        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();

        System.out.println();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();
    }
}
