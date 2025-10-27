package juanma.biblioteca;

import javax.swing.JOptionPane;

public class Libro {
    private String Titulo;
    private String Autor;
    private int Año;
    private int Paginas;
    private boolean Disponible;

    public Libro(String Titulo, String Autor, int Año, int Paginas, boolean Disponible) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        setAño(Año); // validación
        setPaginas(Paginas); // validación
        this.Disponible = Disponible;
    }

   
    public String getTitulo(){ 
        return Titulo; 
    }
    
    public String getAutor(){
        return Autor; 
    }
    
    public int getAño(){
        return Año; 
    }
    
    public int getPaginas(){
        return Paginas; 
    }
    
    public boolean isDisponible(){
        return Disponible; 
    }

    
    public void setTitulo(String Titulo){ 
        this.Titulo = Titulo; 
    }
    
    public void setAutor(String Autor){
        this.Autor = Autor;
    }

    public void setAño(int Año){
        if(Año >= 1450 && Año <= 2025) {
            this.Año = Año;
        } else {
            System.out.println("Año inválido, no se cambió.");
        }
    }

    public void setPaginas(int Paginas){
        if(Paginas > 0) {
            this.Paginas = Paginas;
        } else {
            System.out.println("Número de páginas inválido, no se cambió.");
        }
    }

    public void setDisponible(boolean Disponible){
        this.Disponible = Disponible; 
    }

    
    public void prestar() {
        if(Disponible) {
            Disponible = false;
            JOptionPane.showMessageDialog(null, "Cuide el Libro.");
        } else {
            JOptionPane.showMessageDialog(null, "El libro ya fue prestado.");
        }
    }

    public void devolver() {
        if(!Disponible) {
            Disponible = true;
            JOptionPane.showMessageDialog(null, "Gracias por cuidar el libro.");
        } else {
            JOptionPane.showMessageDialog(null, "El libro esta en la biblioteca.");
        }
    }

   
    public String mostrarInfo() {
        return "Libro\n" +
               "Título: " + Titulo +
               "\nAutor: " + Autor +
               "\nAño: " + Año +
               "\nPáginas: " + Paginas +
               "\nEstado: " + (Disponible ? "Disponible" : "Prestado");
    }
}
