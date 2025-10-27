
package juanma.biblioteca;

import javax.swing.JOptionPane;


public class BIBLIOTECA {

    public static void main(String[] args) {
   Libro libro1 = new Libro("El Quijote", "Cervantes", 1605, 863, true);
        Libro libro2 = new Libro("1984", "Orwell", 1949, 328, true);
        Libro libro3 = new Libro("Cien Años de Soledad", "García Márquez", 1967, 417, true);
        Libro libro4 = new Libro("Don Juan Tenorio", "Zorrilla", 1844, 250, true);
        Libro libro5 = new Libro("La Iliada", "Homero", -750, 500, true);

        Libro[] libros = {libro1, libro2, libro3, libro4, libro5};

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "BIBLIOTECA\n" +
                "1. Mostrar libros\n" +
                "2. Prestar libro\n" +
                "3. Devolver libro\n" +
                "4. Salir"));

            switch(opcion) {
                case 1: 
                    int ver = Integer.parseInt(JOptionPane.showInputDialog(
                        "¿Que libro deseas ver?\n" +
                        "1. " + libro1.getTitulo() + "\n" +
                        "2. " + libro2.getTitulo() + "\n" +
                        "3. " + libro3.getTitulo() + "\n" +
                        "4. " + libro4.getTitulo() + "\n" +
                        "5. " + libro5.getTitulo() + "\n" +
                        "6. Cancelar"));

                    switch(ver) {
                        case 1: JOptionPane.showMessageDialog(null, libro1.mostrarInfo()); break;
                        case 2: JOptionPane.showMessageDialog(null, libro2.mostrarInfo()); break;
                        case 3: JOptionPane.showMessageDialog(null, libro3.mostrarInfo()); break;
                        case 4: JOptionPane.showMessageDialog(null, libro4.mostrarInfo()); break;
                        case 5: JOptionPane.showMessageDialog(null, libro5.mostrarInfo()); break;
                        case 6: break;
                        default: JOptionPane.showMessageDialog(null, "Opción inválida"); break;
                    }
                    break;

                case 2:
                    int prestar = Integer.parseInt(JOptionPane.showInputDialog(
                        "¿Que libro deseas prestar?\n" +
                        "1. " + libro1.getTitulo() + "\n" +
                        "2. " + libro2.getTitulo() + "\n" +
                        "3. " + libro3.getTitulo() + "\n" +
                        "4. " + libro4.getTitulo() + "\n" +
                        "5. " + libro5.getTitulo() + "\n" +
                        "6. Cancelar"));

                    switch(prestar) {
                        case 1: 
                            libro1.prestar();
                            break;
                            
                        case 2: 
                            libro2.prestar(); 
                            break;
                            
                        case 3: 
                            libro3.prestar();
                            break;
                            
                        case 4:
                            libro4.prestar(); 
                        break;
                        
                        case 5: 
                            libro5.prestar(); 
                        break;
                        
                        case 6: 
                            break;
                            
                        default: 
                            JOptionPane.showMessageDialog(null, "Opción inválida"); 
                        break;
                    }
                    break;

                case 3:
                    int devolver = Integer.parseInt(JOptionPane.showInputDialog(
                        "¿Que libro deseas devolver?\n" +
                        "1. " + libro1.getTitulo() + "\n" +
                        "2. " + libro2.getTitulo() + "\n" +
                        "3. " + libro3.getTitulo() + "\n" +
                        "4. " + libro4.getTitulo() + "\n" +
                        "5. " + libro5.getTitulo() + "\n" +
                        "6. Cancelar"));

                    switch(devolver) {
                        case 1: 
                            libro1.devolver();
                            break;
                            
                        case 2: 
                            libro2.devolver();
                            break;
                            
                        case 3:
                            libro3.devolver();
                            break;
                            
                        case 4:
                            libro4.devolver();
                            break;
                            
                        case 5:
                            libro5.devolver(); 
                            break;
                            
                        case 6:
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida"); 
                            break;
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Adiós 👋");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }

        } while(opcion != 4);
    }
}