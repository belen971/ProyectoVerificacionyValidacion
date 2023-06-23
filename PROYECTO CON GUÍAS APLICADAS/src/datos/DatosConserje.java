package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import model.Conserje;

/**
 * Clase que esta relacionada con la manipulación de archivos.
 * 
 * @author GRUPO#2
 *
 */
public class DatosConserje {

  /**
  * Método recibe una lista de objetos Conserje y guarda los datos en un archivo.
  * 
  * @param conserjes
  * 
  * @return
  * 
  */
  public String guardarArchivo(ArrayList<Conserje> conserjes) {
    String x = "";
    JFileChooser cuadro = null;
    File guardar = null;
    FileWriter escribir = null;
        
    try {
      cuadro = new JFileChooser();
      cuadro.showSaveDialog(null);
      guardar = cuadro.getSelectedFile();
      if (guardar != null) {
        escribir = new FileWriter(guardar + ".mabel", false);
        for (Conserje c : conserjes) {
          escribir.write(c.getCedula() + "\n");
          escribir.write(c.getNombre() + "\n");
          escribir.write(c.getSexo() + "\n");
          escribir.write(c.getFechaNac().toString() + "\n");
          escribir.write(c.getTelefono() + "\n");
          escribir.write(c.getDireccion() + "\n");
          escribir.write(c.getFechaIng() + "\n");
          escribir.write(c.getTurno() + "\n");
          escribir.write(c.getInstruccion() + "\n");
          escribir.write(c.getSector() + "\n");
        }
        escribir.close();   
      }
      x = "1";
    } catch (IOException mabel) {
      x = "0" + mabel.getMessage();
    }
    return x;
  }

  /**
   * Método que lee el contenido del archivo.
   * 
   * @return
   * 
   */
  public String leerArchivo() {
    String x = "";
    String aux = ""; 
    String cedula = ""; 
    String nombre = "";
    String sexo = "";
    String fecha = ""; 
    String direccion = ""; 
    String telefono = ""; 
    String fechaIng = ""; 
    String turno = "";
    String instruccion = ""; 
    String sector = "";
    JFileChooser cuadro = null;
    File ubicar = null;
    FileReader lectura = null;
    BufferedReader entrada = null;
        
    try {
      cuadro = new JFileChooser();
      cuadro.showOpenDialog(null);
      ubicar = cuadro.getSelectedFile();
      if (ubicar != null) {
        lectura = new FileReader(ubicar);
        entrada = new BufferedReader(lectura);
        while ((aux = entrada.readLine()) != null) {
          cedula = "Cedula: " + aux;
          nombre = "Nombre: " + entrada.readLine();
          sexo = "Sexo: " + entrada.readLine();
          fecha = "Fecha Nac: " + entrada.readLine();
          telefono = "Teléfono: " + entrada.readLine();
          direccion = "Dirección: " + entrada.readLine();
          fechaIng = "fecha Ing: " + entrada.readLine();
          turno = "Turno: " + entrada.readLine();
          instruccion = "Instruccion: " + entrada.readLine();
          sector = "Sector: " + entrada.readLine();
          //if(sexo.compareTo("F")==0)
          x = x + cedula + "\n" + nombre + "\n" + sexo + "\n" + fecha + "\n" 
                    + telefono + "\n" + direccion + "\n" + fechaIng + "\n" 
                    + turno + "\n" + instruccion + "\n" + sector + "\n";
        }
        entrada.close();
        lectura.close();
      }
    } catch (IOException mabel) {
      x = mabel.getMessage();
    }
    return x;
  }

  /**
   * Método que concatena los datos en una sola cadena y los separa por comas.
   * 
   * @return
   * 
   */
  public String lecturaArchivo() {
    String x = ""; 
    String aux = "";
    JFileChooser cuadro = null;
    File ubicar = null;
    FileReader lectura = null;
    BufferedReader entrada = null;
        
    try {
      cuadro = new JFileChooser();
      cuadro.showOpenDialog(null);
      ubicar = cuadro.getSelectedFile();
      if (ubicar != null) {
        lectura = new FileReader(ubicar);
        entrada = new BufferedReader(lectura);
        while ((aux = entrada.readLine()) != null) {
          x = x + aux + ",";
        }
        entrada.close();
        lectura.close();
      }
    } catch (IOException mabel) {
      x = mabel.getMessage();
    }
    return x;
  }

  /**
   * Método recibe un objeto File que representa un archivo guardado en formato binario.
   * 
   * @param selectedFile
   * 
   * @return
   * 
   */
  public ArrayList<Conserje> abrirArchivoB(File selectedFile) throws ClassNotFoundException {
    ArrayList<Conserje> conserjes = new ArrayList<>();
    Conserje c = null;
    File archivo = selectedFile;
    FileInputStream lectura = null;
    ObjectInputStream leer = null;
        
    try {
      lectura = new FileInputStream(archivo);
      leer = new ObjectInputStream(lectura);
      while (true) {
        c = (Conserje) leer.readObject();
        conserjes.add(c);
      }
    } catch (IOException mabel) {
      System.out.println("FIN DE ARCHIVO" + mabel.getMessage());
    } finally {
      try {
        lectura.close();
        leer.close();
      } catch (IOException mabel) {
        System.out.println(mabel.getMessage());
      }
    }
    return conserjes;
  }

  /**
   * Método que recibe una lista de objetos 'Conserje'.
   * 
   * @param conserjes
   * 
   * @param selectedFile
   * 
   * @return
   * 
   */
  public String guardarArchivoB(ArrayList<Conserje> conserjes, File selectedFile) {
    String x = "";
    File archivo = selectedFile;
    FileOutputStream guardar = null;
    ObjectOutputStream escribir = null;
        
    try {
      guardar = new FileOutputStream(archivo);
      escribir = new ObjectOutputStream(guardar);
      if (escribir != null) {
        for (Conserje d : conserjes) {
          escribir.writeObject(d);
        }
      }
      x = "1";
    } catch (IOException mabel) {
      x = "0" + mabel.getMessage();
    } finally {
      try {
        escribir.close();
        guardar.close();
      } catch (IOException mabel) {
        System.out.println("ERROR" + mabel.getMessage());
      }
    }
    return x;
  }
    
}
