package Model;

import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;

public final class Secretaria extends Persona{
    private int aniosExperiencia;
    private String dia;

    public Secretaria(String cedula, String nombre, char sexo, LocalDate fechaNac, 
            String telefono, String direccion, int aniosExperiencia, String dia){
        super(cedula, nombre, sexo, fechaNac, telefono, direccion);
        this.aniosExperiencia = aniosExperiencia;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String atenderConsutas(){
        return nombre+" atiende consultas por correo: consultas@hotmail.com de lunes a viernes";
    }
    @Override
    public final double pagosMensuales(){
        Random alt = new Random();
        return alt.nextDouble()*1000;
    }
    @Override
    public final String horario(){
        String x="";
        int i=0;
        String dias[]={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String hora[]={"7:00 AM ", "8:00 AM", "7:00 AM", "8:00 AM", "10:00 AM"};
        
        x=JOptionPane.showInputDialog(null, "Ingrese día para saber la hora de ingreso");
        for(i=0; i<dias.length; i++){
            if(dia.compareToIgnoreCase(dias[i])==0){
            x=hora[i];
            }
        }  
        return x;
    }
    public String realizarInformes(){
        return "\nSecretaria "+nombre+" realiza informes mensuales";
    }
    @Override
    public String toString() {
        return super.toString()+"\nAños Experiencia: "+aniosExperiencia+"Día: "+horario();
    }  
}
