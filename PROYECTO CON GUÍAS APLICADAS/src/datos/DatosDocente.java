
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
import model.Docente;

/**
 * Clase que esta relacionada con la manipulación de archivos.
 * @author GRUPO#2
 *
 */
public class DatosDocente {

  /**
   * Método que lee el contenido del archivo.
   * @return
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
    String titulo = ""; 
    String facultad = "";
    String materia = "";
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
          titulo = "Titulo: " + entrada.readLine();
          facultad = "Facultad: " + entrada.readLine();
          materia = "Materia: " + entrada.readLine();
          //if(sexo.compareTo("F")==0)
          x = x + cedula + "\n" + nombre + "\n" + sexo + "\n" 
            + fecha + "\n" + telefono + "\n" + direccion + "\n" 
            + titulo + "\n" + facultad + "\n" + materia + "\n";
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
   * Método recibe una lista de objetos Docente y guarda los datos en un archivo.
   * @param docentes
   * 
   * @return
   * 
   */
  public String guardarArchivo(ArrayList<Docente> docentes) {
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
        for (Docente d : docentes) {
          escribir.write(d.getCedula() + "\n");
          escribir.write(d.getNombre() + "\n");
          escribir.write(d.getSexo() + "\n");
          escribir.write(d.getFechaNac().toString() + "\n");
          escribir.write(d.getTelefono() + "\n");
          escribir.write(d.getDireccion() + "\n");
          escribir.write(d.getFacultad() + "\n");
          escribir.write(d.getTitulo() + "\n");
          escribir.write(d.getMateria() + "\n");
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
   */
  public ArrayList<Docente> abrirArchivoB(File selectedFile) throws ClassNotFoundException {
    ArrayList<Docente> lista = new ArrayList<>();
    Docente d = null;
    File archivo = selectedFile;
    FileInputStream lectura = null;
    ObjectInputStream leer = null;
        
    try {
      lectura = new FileInputStream(archivo);
      leer = new ObjectInputStream(lectura);
      while (true) {
        d = (Docente) leer.readObject();
        lista.add(d);
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
    return lista;
  }

  /**
   * Método que recibe una lista de objetos 'Docente'.
   * 
   * @param docentes
   * 
   * @param selectedFile
   * 
   * @return
   * 
   */
  public String guardarArchivoB(ArrayList<Docente> docentes, File selectedFile)  {
    String x = "";
    File archivo = selectedFile;
    FileOutputStream guardar = null;
    ObjectOutputStream escribir = null;
        
    try {
      guardar = new FileOutputStream(archivo);
      escribir = new ObjectOutputStream(guardar);
      if (escribir != null) {
        for (Docente d : docentes) {
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
