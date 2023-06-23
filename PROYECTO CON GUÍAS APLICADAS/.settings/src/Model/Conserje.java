package Model;
import java.time.LocalDate;
import java.util.Random;
public class Conserje extends Persona{
    protected String instruccion;
    protected LocalDate fechaIng;
    protected String sector;
    protected String Turno;

    public Conserje(String cedula, String nombre, char sexo, LocalDate fechaNac, 
            String telefono, String direccion, String instruccion, LocalDate fechaIng, String sector, String turno) {
        super(cedula, nombre, sexo, fechaNac, telefono, direccion);
        this.instruccion = instruccion;
        this.fechaIng = fechaIng;
        this.sector = sector;
    }
    public String getInstruccion() {
        return instruccion;
    }
    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }
    public LocalDate getFechaIng() {
        return fechaIng;
    }
    public void setFechaIng(LocalDate fechaIng) {
        this.fechaIng = fechaIng;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public String getTurno() {
        return Turno;
    }
    public void setTurno(String Turno) {
        this.Turno = Turno;
    }
    @Override
    public String toString() {
        return super.toString()+"\nNivel academico "+instruccion+"\nComenzo a laborar " 
                +fechaIng+"\nTiempo de Servicio: "+aniosServicio()+" años "+"\nSector de aseo"+sector+
                "\nTurno: "+Turno+"\nPago por recibir: "+pagosMensuales();
    }

    public int aniosServicio(){
        int x=0;
        LocalDate hoy=LocalDate.now();
        x=hoy.getYear()-fechaIng.getYear();
        return x;
    }
    @Override
    public double pagosMensuales() {
        Random alt = new Random();
        return alt.nextDouble()*400;
    }
    @Override
    public String horario() {
       String x= " ";
       
       
       
       return x;
    }
   
}