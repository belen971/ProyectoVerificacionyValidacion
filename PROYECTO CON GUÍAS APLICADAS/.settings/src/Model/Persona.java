package Model;
import java.time.LocalDate;
public abstract class Persona {
    protected String cedula;
    protected String nombre;
    protected char sexo;
    protected LocalDate fechaNac;
    protected int edad;
    protected String telefono;
    protected String direccion;
    protected double monto;

    public Persona(String cedula, String nombre, char sexo, LocalDate fechaNac, 
            String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.direccion = direccion;
        edad=calcularEdad();
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int calcularEdad() {
        int x=0;
        LocalDate hoy= LocalDate.now();
        x=hoy.getYear()-fechaNac.getYear();
        return x;
    }
    public String verSexo(){
        String x="";
        if(sexo=='F' || sexo=='f'){
            x="Femenino";
        }else if(sexo=='M' || sexo=='m'){
            x="Masculino";
        }
        return x;
    }
    public abstract double pagosMensuales();
    public abstract String horario();

    @Override
    public String toString() {
        return "Cedula: "+cedula+"\nNombre: "+nombre+"\nSexo: "+verSexo()
                + "\nFecha Nac: "+fechaNac+"\nEdad: "+calcularEdad()+"\nTeléfono: "
                +telefono+"\nDirección: "+direccion + "\nMonto mensual"+pagosMensuales()+"\nHorario: "+horario();
    }
    
    
}
