package Model;

import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;

public final class Docente extends Persona{
    private String Titulo;
    private String Facultad;
    private String Materia;

    public Docente(String cedula, String nombre,char sexo, LocalDate fechaNac, 
            String telefono, String direccion, String Titulo, String Facultad, String Materia){
        super(cedula, nombre, sexo, fechaNac, telefono, direccion);
        this.Titulo = Titulo;
        this.Facultad = Facultad;
        this.Materia = Materia;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getFacultad() {
        return Facultad;
    }
    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }
    public String getMateria() {
        return Materia;
    }
    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    @Override
    public String toString() {
        return  super.toString()+"\nTitulo: " + Titulo + "\nFacultad: " + Facultad + "\nMateria: " + Materia ;
    }
    public String impartirClase(int dia){        
           do{
               JOptionPane.showMessageDialog(null,"Día que imparte clases"
                   + "\n1. Lunes "
                   + "\n2. Martes "
                   + "\n3. Miércoles "
                   + "\n4. Jueves "
                   + "\n5. Viernes "
                   + "\n6. Sábado \n");
            dia=Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opción: "));
        
            switch(dia){
                case 1: System.out.print("\nEl docente "+nombre+" imparte clases el día Lunes\n"+"\nEL dia: "+Materia+"\nEn la facultad de: "+Facultad);
                break;
                case 2: System.out.print("\nEl docente "+nombre+" imparte clases el día Martes\n"+"\nEL dia: "+Materia+"\nEn la facultad de: "+Facultad);
                break;
                case 3: System.out.print("\nEl docente "+nombre+" imparte clases el día Miércoles\n"+"\nEL dia: "+Materia+"\nEn la facultad de: "+Facultad);
                break;
                case 4: System.out.print("\nEl docente "+nombre+" imparte clases el día Jueves\n"+"\nEL dia: "+Materia+"\nEn la facultad de: "+Facultad);
                break;
                case 5: System.out.print("\nEl docente "+nombre+" imparte clases el día Viernes\n"+"\nEL dia: "+Materia+"\nEn la facultad de: "+Facultad);
                break;
                case 6: System.out.print("\nEl docente "+nombre+" imparte clases el día Sábado\n"+"\nEL dia: "+Materia+"\nEn la facultad de: "+Facultad);
                break;
                default: System.out.print("Error,.. Ingrese número del 1 al 6");
            }     
           }while(dia<1 && dia>6);
        return " ";
     }
    @Override
    public double pagosMensuales() {
        Random alt = new Random();
        return alt.nextDouble()*1000;
    }
    @Override
    public String horario() {
         String x="";
        return x;
    }
    public String Capacitar(){
        return "El Docente "+nombre+" capacita a los estudiantes";

    }   
}
