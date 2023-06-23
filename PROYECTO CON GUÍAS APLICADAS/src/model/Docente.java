package model;

import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Clase que almacena "Docentes".
 * 
 *  
 *  @author GRUPO#2
 *
 */

public final class Docente extends Persona {
  private String titulo;
  private String facultad;
  private String materia;

  /**
   * Constructor de la clase Docente.
   * 
   * @param cedula
   * 
   * @param nombre
   * 
   * @param sexo
   * 
   * @param fechaNac
   * 
   * @param telefono
   * 
   * @param direccion
   * 
   * @param titulo
   * 
   * @param facultad
   * 
   * @param materia
   * 
   */
  public Docente(String cedula, String nombre, char sexo, LocalDate fechaNac, 
            String telefono, String direccion, String titulo, String facultad, String materia) {
    super(cedula, nombre, sexo, fechaNac, telefono, direccion);
    this.titulo = titulo;
    this.facultad = facultad;
    this.materia = materia;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  public String getFacultad() {
    return facultad;
  }
  
  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }
  
  public String getMateria() {
    return materia;
  }
  
  public void setMateria(String materia) {
    this.materia = materia;
  }
  
  @Override
    public String toString() {
    return  super.toString() + "\nTitulo: " + titulo + "\nFacultad: "
      + facultad + "\nMateria: " + materia;
  }
  
  /**
   * Método que muestra un cuadro de diálogo con opciones.
   * 
   * @param dia
   * 
   * @return
   * 
   */
  public String impartirClase(int dia) {        
    do {
      JOptionPane.showMessageDialog(null, "Día que imparte clases"
                   + "\n1. Lunes "
                   + "\n2. Martes "
                   + "\n3. Miércoles "
                   + "\n4. Jueves "
                   + "\n5. Viernes "
                   + "\n6. Sábado \n");
      dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opción: "));
        
      switch (dia) {
        case 1: System.out.print("\nEl docente " + nombre + " imparte clases el día Lunes\n" 
            + "\nEL dia: " + materia + "\nEn la facultad de: " + facultad);
                break;
        case 2: System.out.print("\nEl docente " + nombre + " imparte clases el día Martes\n" 
                + "\nEL dia: " + materia + "\nEn la facultad de: " + facultad);
                break;
        case 3: System.out.print("\nEl docente " + nombre + " imparte clases el día Miércoles\n" 
                + "\nEL dia: " + materia + "\nEn la facultad de: " + facultad);
                break;
        case 4: System.out.print("\nEl docente " + nombre + " imparte clases el día Jueves\n" 
                + "\nEL dia: " + materia + "\nEn la facultad de: " + facultad);
                break;
        case 5: System.out.print("\nEl docente " + nombre + " imparte clases el día Viernes\n" 
                + "\nEL dia: " + materia + "\nEn la facultad de: " + facultad);
                break;
        case 6: System.out.print("\nEl docente " + nombre + " imparte clases el día Sábado\n"
                + "\nEL dia: " + materia + "\nEn la facultad de: " + facultad);
                break;
        default: System.out.print("Error,.. Ingrese número del 1 al 6");
      }     
    } while (dia < 1 && dia > 6);
    return " ";
  }
  
  @Override
    public double pagosMensuales() {
    Random alt = new Random();
    return alt.nextDouble() * 1000;
  }
  
  @Override
    public String horario() {
    String x = "";
    return x;
  }
  
  public String capacitar() {
    return "El Docente " + nombre + " capacita a los estudiantes";
  }   
}
