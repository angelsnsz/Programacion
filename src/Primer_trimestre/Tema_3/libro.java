/*
Define una clase libro que pueda ser utilizada para representar los libros que hay en una biblioteca.
Supón que cada libro tiene los siguientes atributos:
Título
Autor
Año de publicación
Editorial
ISBN
Escribe una clase con un metodo main que cree varios objetos de la clase libro,
y al final muestre los datos de cada uno de ellos sobreescribiendo el metodo toString.
 */
package Primer_trimestre.Tema_3;

public class libro {

        private String titulo;
        private String autor;
        private int anioPublicacion;
        private String editorial;
        private int ISBN;
    public libro(String titulo, int ISBN){
        this.titulo=titulo;
        this.ISBN = ISBN;
    }
    public libro(String titulo,String autor, int anioPublicacion, String editorial,int ISBN){
        this.titulo =titulo;
        this.autor= autor;
        this.anioPublicacion= anioPublicacion;
        this.editorial=editorial;
        this.ISBN=ISBN;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        String comprobarAutor =autor!= null ? autor : "sin autor";
        return titulo + "("+ISBN+")de" +comprobarAutor;
    }
}
