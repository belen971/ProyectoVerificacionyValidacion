package model;

import java.time.LocalDate;
import java.util.Random;
/**
 * Clase que almacena a los estudiantes y utiliza la interface tutorizacion.
 * 
 * @author GRUPO#2
 * 
 */

public final class Estudiante extends Persona implements Itutorizacion {

  protected String carrera;
  protected String semestre;
  protected String materia;

  /**
  * Clase que almacena a los estudiantes.
  * 
  */
  public Estudiante(String cedula, String nombre, char sexo, LocalDate fechaNac, String telefono,
      String direccion, String carrera, String semestre, String materia) {
    super(cedula, nombre, sexo, fechaNac, telefono, direccion);
    this.carrera = carrera;
    this.semestre = semestre;
    this.materia = materia;      
  }

  public String getCarrera() {
    return carrera;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public String getSemestre() {
    return semestre;
  }

  public void setSemestre(String semestre) {
    this.semestre = semestre;
  }

  public String getMateria() {
    return materia;
  }

  public void setMateria(String materia) {
    this.materia = materia;
  }
    
  @Override
    public double pagosMensuales() {
    Random alt = new Random();
    return alt.nextDouble() * 100;
  }
  
  @Override
    public String horario() {
    String x = "";
    return x;
  }
  
  public String estudiar(String asignatura) {
    return nombre + " está estudiando las tutorias de " + asignatura;
  }
  
  @Override
    public String asistirTutorizacion() {
    return "Estudiante " + nombre + " recibe tutorización en la carrera " 
      + carrera + "del " + semestre + " semestre.";
  }

  @Override
    public String toString() {
    return super.toString() + "\nCarrera: " + carrera + "\nSemestre: " + semestre + "\nMateria: " 
      + materia + "\nPago por realizar: " + pagosMensuales();
  }
    
}
