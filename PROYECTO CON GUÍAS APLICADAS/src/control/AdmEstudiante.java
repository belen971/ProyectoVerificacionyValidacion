package control;

import Visual.FrmFormatEstudiante;
import datos.DatosEstudiante;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import model.Estudiante;


/**
 * Clase que administra los datos de los estudiantes almacenados en el sistema.
 * @author GRUPO#2
 *
 */
public class AdmEstudiante {
  DatosEstudiante datos = null;
  static AdmEstudiante admEstudiante = null;
  ArrayList<Estudiante> estudiantes = null;
  Estudiante e = null;
  int posicion = 0;

  private AdmEstudiante() {
    estudiantes = new ArrayList<>();
  }

  /**
   * Método de "AdmEstudiante".
   * @return
   */
  public static AdmEstudiante getAdmEstudiante() {
    if (admEstudiante == null) {
      admEstudiante = new AdmEstudiante();
    }
    return admEstudiante;
  }

  public ArrayList<Estudiante> getEstudiantes() {
    return estudiantes;
  }

  public void setLista(ArrayList<Estudiante> estudiantes) {
    this.estudiantes = estudiantes;
  }
    
  /**
   * Método que valida los datos del Estudiante.
   * .
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
   * @param carrera
   * 
   * @param semestre
   * 
   * @param materia
   * 
   * @return
   * 
   */
  
  public boolean validar(String cedula, String nombre, String sexo, Date fechaNac, String telefono, 
          String direccion, String carrera, String semestre, String materia) {
    boolean x = false;
    if (!nombre.isEmpty() && !cedula.isEmpty() && !sexo.isEmpty() && !telefono.isEmpty() 
        && !carrera.isEmpty() && fechaNac != null && !direccion.isEmpty() && !semestre.isEmpty() 
        && !materia.isEmpty()) {
      if (buscarCedula(cedula, posicion) == -1) {
        x = true;               
      } else {
        x = false;
        JOptionPane.showMessageDialog(null, "ESA CEDULA YA EXISTE");
      }
    } else {
      x = false;
    }
    return x;
  }
 
  /**
   * Método que guarda los datos del Estudiante.
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
   * @param carrera
   * 
   * @param semestre
   * 
   * @param materia
   * 
   * @return
   * 
   */
  public String guardar(String cedula, String nombre, String sexo, Date fechaNac, String telefono,
         String direccion, String carrera, String semestre, String materia) {
    String x = "";
    Validacion v = new Validacion();
    char sexoC = v.achar(sexo);
    LocalDate fechaLd = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    e = new Estudiante(cedula, nombre, sexoC, fechaLd, telefono, 
            direccion, carrera, semestre, materia);
    estudiantes.add(e);
    x = e.toString();
    return x;
  }
  
  /**
   * Método que llena la tabla.
   * 
   * @param tblContenido
   * 
   * @param lblTotal
   * 
   */
  public void llenarTabla(JTable tblContenido, JLabel lblTotal) {
    int fila = 0; 
    int n = 0;
    DefaultTableModel modelo = (DefaultTableModel) tblContenido.getModel();
    if (estudiantes.size() > 0) {
      n = estudiantes.size() - 1;
      e = estudiantes.get(n);
      fila = n;
      modelo.addRow(new Object[1]);
      tblContenido.setValueAt(e.getCedula(), fila, 0);
      tblContenido.setValueAt(e.getNombre(), fila, 1);
      tblContenido.setValueAt(e.verSexo(), fila, 2);
      tblContenido.setValueAt(e.getFechaNac(), fila, 3);
      tblContenido.setValueAt(e.getTelefono(), fila, 4);
      tblContenido.setValueAt(e.getDireccion(), fila, 5);
      tblContenido.setValueAt(e.calcularEdad(), fila, 6);
      tblContenido.setValueAt(e.getCarrera(), fila, 7);
      tblContenido.setValueAt(e.getSemestre(), fila, 8);
      tblContenido.setValueAt(e.getMateria(), fila, 9);
      tblContenido.setValueAt(e.pagosMensuales(), fila, 10);
            
      lblTotal.setText(estudiantes.size() + "");
    }
  }
  
  /**
   * Método que llena con contenido.
   * @param tblContenido
   * 
   * @param lblTotal
   * 
   */
  public void llenar(JTable tblContenido, JLabel lblTotal) {
    int fila = 0; 
    int n = 0;

    DefaultTableModel modelo = (DefaultTableModel) tblContenido.getModel();
    if (estudiantes.size() > 0) {
      fila = estudiantes.size() - 1;
      e = estudiantes.get(estudiantes.size() - 1);
      for (Estudiante mabel : estudiantes) {
        modelo.addRow(new Object[1]);
        tblContenido.setValueAt(e.getCedula(), fila, 0);
        tblContenido.setValueAt(e.getNombre(), fila, 1);
        tblContenido.setValueAt(e.verSexo(), fila, 2);
        tblContenido.setValueAt(e.getFechaNac(), fila, 3);
        tblContenido.setValueAt(e.getTelefono(), fila, 4);
        tblContenido.setValueAt(e.getDireccion(), fila, 5);
        tblContenido.setValueAt(e.calcularEdad(), fila, 6);
        tblContenido.setValueAt(e.getCarrera(), fila, 7);
        tblContenido.setValueAt(e.getSemestre(), fila, 8);
        tblContenido.setValueAt(e.getMateria(), fila, 9);
        tblContenido.setValueAt(e.pagosMensuales(), fila, 10);
        fila++;
      }
      lblTotal.setText(estudiantes.size() + "");
    }
  }

  
  /**
   * Método que elimina el contenido de la tabla.
   * 
   * @param tblContenido
   * 
   * @param lblTotal
   * 
   */
  public void eliminarTabla(JTable tblContenido, JLabel lblTotal) {
    DefaultTableModel modelo = (DefaultTableModel) tblContenido.getModel();
    int i = tblContenido.getSelectedRow();
    if (i != -1) {
      modelo.removeRow(i);
      estudiantes.remove(i);
      lblTotal.setText(estudiantes.size() + "");
    } else {
      JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
    }
  }
   
  /**
   * Método que busca por el número de cedula.
   * 
   * @param cedula
   * 
   * @param posicion
   * 
   * @return
   * 
   */
  
  public int buscarCedula(String cedula, int posicion) {
    int i = -1;
    for (Estudiante mabel : estudiantes) {
      if (mabel.getCedula().compareToIgnoreCase(cedula) == 0) {
        i = estudiantes.indexOf(mabel);   
      }
    }
    return i;
  }
  
  /**
   * Método para visualizar.
   * 
   * @param frmFormatEstudiante
   */
  public void visualizarUltimo(FrmFormatEstudiante frmFormatEstudiante) {
    if (estudiantes.size() > 0) {
      e = estudiantes.get(estudiantes.size() - 1);
      llenarCampos(frmFormatEstudiante);
      bloquearCampos(frmFormatEstudiante);
    }
  }
  
  /**
   * Método para visualizar.
   * 
   * @param frmFormatEstudiante
   * 
   */
  public void visualizarAtras(FrmFormatEstudiante frmFormatEstudiante) {
    if (estudiantes.size() > 0 && estudiantes.size() - 1 > posicion) {
      posicion = posicion - 1;
      llenarCampos(frmFormatEstudiante);
      bloquearCampos(frmFormatEstudiante); 
    }
  }
  
  /**
   * Método para visualizar.
   * 
   * @param frmFormatEstudiante
   * 
   */
  public void visualizarPrimero(FrmFormatEstudiante frmFormatEstudiante) {
    if (estudiantes.size() > 0) {
      e = estudiantes.get(0);
      llenarCampos(frmFormatEstudiante);
      bloquearCampos(frmFormatEstudiante);
    }
  }
  
  /**
   * Método para visualizar.
   * 
   * @param frmFormatEstudiante
   */
  public void visualizarSiguiente(FrmFormatEstudiante frmFormatEstudiante) {
    if (estudiantes.size() > 0 && estudiantes.size() - 1 > posicion) {
      posicion = posicion + 1;
      llenarCampos(frmFormatEstudiante);
      bloquearCampos(frmFormatEstudiante);
    }
  }
  
 
  private void llenarCampos(FrmFormatEstudiante frmFormatEstudiante) {
    Date x = null;
    frmFormatEstudiante.getTxtCedula().setText(e.getCedula());
    frmFormatEstudiante.getTxtNombre().setText(e.getNombre());
    frmFormatEstudiante.getCmbSexo().setSelectedItem(e.verSexo());
    x = Date.from(e.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant());
    frmFormatEstudiante.getDtcFechaNac().setDate(x);
    frmFormatEstudiante.getTxtTelefono().setText(e.getTelefono());
    frmFormatEstudiante.getTxtDireccion().setText(e.getDireccion());
    frmFormatEstudiante.getCmbCarrera().setSelectedItem(e.getCarrera());
    frmFormatEstudiante.getCmbSemestre().setSelectedItem(e.getSemestre());
    frmFormatEstudiante.getTxtMateria().setText(e.getMateria());
  }
  
 
  private void bloquearCampos(FrmFormatEstudiante frmFormatEstudiante) { 
    frmFormatEstudiante.getTxtCedula().setEditable(false);
    frmFormatEstudiante.getTxtNombre().setEditable(false);
    frmFormatEstudiante.getCmbSexo().setEditable(false);
    frmFormatEstudiante.getCmbSexo().setEnabled(false);
    frmFormatEstudiante.getDtcFechaNac().setEnabled(false);
    frmFormatEstudiante.getTxtTelefono().setEditable(false);
    frmFormatEstudiante.getTxtDireccion().setEditable(false);
    frmFormatEstudiante.getCmbCarrera().setEditable(false);
    frmFormatEstudiante.getCmbCarrera().setEnabled(false);   
    frmFormatEstudiante.getCmbSemestre().setEditable(false);
    frmFormatEstudiante.getCmbSemestre().setEnabled(false);
    frmFormatEstudiante.getTxtMateria().setEditable(false);
  }
  
  /**
   * Método que valida los datos que se requieren editar.
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
   * @param carrera
   * 
   * @param semestre
   * 
   * @param materia
   * 
   * @return
   * 
   */
  public boolean validarEditar(String cedula, String nombre, String sexo, 
          Date fechaNac, String telefono, String direccion, String carrera, 
          String semestre, String materia) {
    Validacion v = new Validacion();
    boolean x = false;
        
    if (!nombre.isEmpty() && !cedula.isEmpty() && !sexo.isEmpty() && !telefono.isEmpty() 
        && !carrera.isEmpty() && fechaNac != null && !direccion.isEmpty() 
        && !semestre.isEmpty() && !materia.isEmpty()) {
      LocalDate fechaLd = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      estudiantes.set(posicion, e);
      estudiantes.get(posicion).setNombre(nombre);
      estudiantes.get(posicion).setSexo(v.achar(sexo));           
      estudiantes.get(posicion).setFechaNac(fechaLd);
      estudiantes.get(posicion).setTelefono(telefono);
      estudiantes.get(posicion).setDireccion(direccion);
      estudiantes.get(posicion).setCarrera(carrera);
      estudiantes.get(posicion).setSemestre(semestre);
      estudiantes.get(posicion).setMateria(materia);
      x = true;
    } else {
      x = false;
    }
    return x;
  }

  /**
   * Método que lee el archivo con los datos de Estudiante.
   * 
   * @param txtContenido
   * 
   * @return
   * 
   */
  public boolean leerArchivo(JTextArea txtContenido) {
    boolean x = false;
    String contenido = "";
    datos = new DatosEstudiante();
    contenido = datos.leerArchivo();
        
    if (!contenido.isEmpty()) {
      txtContenido.append(contenido);
      txtContenido.setEditable(false);
      x = true;
    } else {
      x = false;
    }
    return x;
  }
  
  /**
   * Método para abrir el archivo.
   * @param txtContenido
   * 
   * @param lblTotal
   * 
   * @return
   * 
   */
  public boolean abrirArchivo(JTextArea txtContenido, JLabel lblTotal) {
    boolean x = false;
    String contenido  = "";
    int i = 0; 
    int suma = 0; 
    int contaL = 0;
    int contaV = 0; 
    int c = 0;
    datos = new DatosEstudiante();
    contenido = datos.lecturaArchivo();
        
    if (!contenido.isEmpty()) {
      String[] cadenas = contenido.split(","); //Útil para total de lineas
      //JOptionPane.showMessageDialog(null, cadenas);
      for (i = 0; i < cadenas.length; i++) {
        txtContenido.append(cadenas[i] + ",\n");           
      } 
      for (i = 0; i < contenido.length(); i++) {
        if (Character.isDigit(contenido.charAt(i))) {
          //suma = suma+Integer.parseInt(contenido.charAt(i)+"");
          suma = suma + contenido.charAt(i);
          //c=contenido.charAt(i);
          //JOptionPane.showMessageDialog(null, c);
        }
        if (Character.isLetter(contenido.charAt(i))) {
          contaL = contaL + contenido.charAt(i);
        }
        if ((contenido.charAt(i) == 'A' || contenido.charAt(i) == 'a') 
            || (contenido.charAt(i) == 'E' || contenido.charAt(i) == 'e') 
            || (contenido.charAt(i) == 'I' || contenido.charAt(i) == 'i') 
            || (contenido.charAt(i) == 'O' || contenido.charAt(i) == 'o')
            || (contenido.charAt(i) == 'U' || contenido.charAt(i) == 'u')) {                    
          contaV = contaV + contenido.charAt(i);
        }
      }
      txtContenido.append("La suma de los dígitos es: " + suma);
      txtContenido.append("\nEl total de letras es: " + contaL); 
      txtContenido.append("\nEl total de vocales es: " + contaV);
      txtContenido.setEditable(false);
      lblTotal.setText(cadenas.length + "");
      x = true;
    }
    return x;
  }
  
  /**
   * Método que guarda el archivo.
   */
  public void guardarArchivoE() {
    String resultado = "";
        
    if (estudiantes.size() > 0) {
      datos = new DatosEstudiante();
      resultado = datos.guardarArchivo(estudiantes);
      if (resultado.charAt(0) == '1') {
        JOptionPane.showMessageDialog(null, "DATOS GUARDADOS SATISFACTORIAMENTE");
      } else if (resultado.charAt(0) == '0') {
        JOptionPane.showMessageDialog(null, "NO SE GUARDÓ LA INFORMACIÓN " + resultado,
             "¡ADVERTENCIA! ", JOptionPane.ERROR_MESSAGE);
      }
    } else {
      JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS POR GUARDAR");
    }
  }
  
  /**
   * Método que lee el archivo.
   * @param tblEstudiante
   * 
   * @param lblTotal
   * 
   * @return
   * 
   */
  public boolean abrirArchivoBinario(JTable tblEstudiante, JLabel lblTotal) {
    boolean x = false;
    int resp = 0; 
    int r = 0;
    JFileChooser cuadro = new JFileChooser();
    resp = cuadro.showOpenDialog(null);
    if (resp == JFileChooser.APPROVE_OPTION) {
      datos = new DatosEstudiante();
      if (estudiantes.size() == 0) {
        estudiantes = datos.abrirArchivoB(cuadro.getSelectedFile());
      } else {
        r = JOptionPane.showConfirmDialog(null, "EXISTE INFORMACIÓN QUE NO HA GUARDADO" 
      + "DESEA REEMPLAZARLA?");
        if (r == JOptionPane.YES_OPTION) {
          estudiantes = datos.abrirArchivoB(cuadro.getSelectedFile());
        } else {
          x = false;
        }
      }
      if (estudiantes.size() > 0) {
        x = true;
        llenarTabla(tblEstudiante, lblTotal);
      }
    } 
    return x;
  }
  
  /**
   *  Método que guarda el archivo.
   */
  public void guardarArchivoB() {
    String contenido = "";
    int resp = 0;
    JFileChooser cuadro = null;
    if (estudiantes.size() > 0) {
      cuadro = new JFileChooser();
      resp = cuadro.showOpenDialog(null);
    }
    if (resp == JFileChooser.APPROVE_OPTION) {
      datos = new DatosEstudiante();
      contenido = datos.guardarArchivoB(estudiantes, cuadro.getSelectedFile());
    } else if (contenido.charAt(0) == '1') {
      JOptionPane.showMessageDialog(null, "DATOS GUARDADOS EXITOSAMENTE");
    } else if (contenido.charAt(0) == '0') {
      JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LA INFORMACIÓN" + contenido);
    } else {
      JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS POR GUARDAR");
    }
  }
  /**
   *  Método que edita el registro del Estudiante.
   * 
   * @param frmFormatEstudiante
   * 
   * @param posicion
   * 
   */
  
  public void editarRegistro(FrmFormatEstudiante frmFormatEstudiante, int posicion) {
    e = estudiantes.get(posicion);
    llenarCampos(frmFormatEstudiante);
    bloquearCedula(frmFormatEstudiante);
  }
  

  private void bloquearCedula(FrmFormatEstudiante frmFormatEstudiante) {
    frmFormatEstudiante.getTxtCedula().setEditable(false);
  }
}
