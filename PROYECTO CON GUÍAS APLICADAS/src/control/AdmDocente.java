package control;

import Visual.FrmFormatDocente;
import datos.DatosDocente;
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
import model.Docente;


/**
 * Clase que administra los datos de los  docentes almacenados en el sistema.
 * 
 * @author GRUPO#2
 *
 */
public class AdmDocente {
  DatosDocente datos = null;
  ArrayList<Docente> docentes = null;
  static AdmDocente admDocente = null;
  Docente d = null;
  int posicion = 0;
    
  private AdmDocente() {
    docentes = new ArrayList<>();
  }
  
  /**
   * Método de "AdmDocente".
   *
   * @return
   * 
   */
  
  public static AdmDocente getAdmDocente() {
    if (admDocente == null) {
      admDocente = new AdmDocente(); 
    }
    return admDocente;
  }
  
  public ArrayList<Docente> getDocentes() {
    return docentes;
  }
  
  public void setDocentes(ArrayList<Docente> docentes) {
    this.docentes = docentes;
  }

  /**
   * Método que valida los datos del Docente.
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
   * @param materia
   * 
   * @param titulo
   * 
   * @param facultad
   * 
   * @return
   * 
   */
  public boolean validar(String cedula, String nombre, String sexo, Date fechaNac, String telefono, 
        String direccion, String materia, String titulo, String facultad) {
    boolean x = false;
        
    if (!cedula.isEmpty() && !nombre.isEmpty() && !sexo.isEmpty() && fechaNac != null 
        && !telefono.isEmpty() && !direccion.isEmpty()
        && !materia.isEmpty() && !titulo.isEmpty() && !facultad.isEmpty()) {
      x = true;
    } else {
      x = false;
    }
    return x;
  }

  /**
   * Método que guarda los datos del Docente.
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
   * @param materia
   * 
   * @param titulo
   * 
   * @param facultad
   * 
   * @return
   * 
   */
  
  public String guardar(String cedula, String nombre, String sexo, Date fechaNac, 
      String telefono, String direccion, String materia, String titulo, String facultad) {
    String x = "";
    Validacion v = new Validacion();
    char sexoC = v.achar(sexo);
    LocalDate fechaLd = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    d = new Docente(cedula, nombre, sexoC, fechaLd, telefono, 
       direccion, titulo, facultad, materia);
    docentes.add(d);
    x = d.toString();
    return x;
  }

  /**
   * Método que edita el registro del Docente.
   * 
   * @param frmFormatDocente
   * 
   * @param posicion
   * 
   */
  public void editarRegistro(FrmFormatDocente frmFormatDocente, int posicion) {
    d = docentes.get(posicion);
    llenarCampos(frmFormatDocente);
    bloquearCedula(frmFormatDocente);
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
   * @param materia
   * 
   * @param titulo
   * 
   * @param facultad
   * 
   * @return
   * 
   */
  public boolean validarEditar(String cedula, String nombre, String sexo, Date fechaNac, 
       String telefono, String direccion, String materia, String titulo, String facultad) {
    Validacion v = new Validacion();
    boolean x = false;
        
    if (!nombre.isEmpty() && !cedula.isEmpty() && !sexo.isEmpty() && !telefono.isEmpty() 
        && !materia.isEmpty() && fechaNac != null && !direccion.isEmpty() && !titulo.isEmpty() 
        && !facultad.isEmpty()) {
      LocalDate fechaLd = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      docentes.set(posicion, d);
      docentes.get(posicion).setNombre(nombre);
      docentes.get(posicion).setSexo(v.achar(sexo));           
      docentes.get(posicion).setFechaNac(fechaLd);
      docentes.get(posicion).setTelefono(telefono);
      docentes.get(posicion).setDireccion(direccion);
      docentes.get(posicion).setTitulo(titulo);
      docentes.get(posicion).setFacultad(facultad);
      docentes.get(posicion).setMateria(materia);
      x = true;
    } else {
      x = false;
    }
    return x;
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
    int i = - 1;
    for (Docente mabel : docentes) {
      if (mabel.getCedula().compareToIgnoreCase(cedula) == 0) {
        i = docentes.indexOf(mabel);   
      }
    }
    return i;
  }

  /**
   * Método que elimina el contenido de la tabla.
   * @param tblContenido
   * 
   * @param lblTotal
   * 
   */
  public void eliminarTabla(JTable tblContenido, JLabel lblTotal) {
    DefaultTableModel modelo = (DefaultTableModel) tblContenido.getModel();
    int i = tblContenido.getSelectedRow();
    if (i != - 1) {
      modelo.removeRow(i);
      docentes.remove(i);
      lblTotal.setText(docentes.size() + "");
    } else {
      JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
    }
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
    if (docentes.size() > 0) {
      n = docentes.size() - 1;
      d = docentes.get(n);
      fila = n;
      modelo.addRow(new Object[1]);
      tblContenido.setValueAt(d.getCedula(), fila, 0);
      tblContenido.setValueAt(d.getNombre(), fila, 1);
      tblContenido.setValueAt(d.verSexo(), fila, 2);
      tblContenido.setValueAt(d.getFechaNac(), fila, 3);
      tblContenido.setValueAt(d.getTelefono(), fila, 4);
      tblContenido.setValueAt(d.getDireccion(), fila, 5);
      tblContenido.setValueAt(d.calcularEdad(), fila, 6);
      tblContenido.setValueAt(d.getTitulo(), fila, 7);
      tblContenido.setValueAt(d.getFacultad(), fila, 8);
      tblContenido.setValueAt(d.getMateria(), fila, 9);
      tblContenido.setValueAt(d.pagosMensuales(), fila, 10);
            
      lblTotal.setText(docentes.size() + "");
    }
  }

  /**
   * Método para visualizar.
   * 
   * @param frmFormatDocente
   * 
   */
  public void visualizarPrimero(FrmFormatDocente frmFormatDocente) {
    if (docentes.size() > 0) {
      d = docentes.get(0);
      llenarCampos(frmFormatDocente);
      bloquearCampos(frmFormatDocente);
    }
  }

  /**
   * Método para visualizar.
   * 
   * @param frmFormatDocente
   * 
   */
  public void visualizarAtras(FrmFormatDocente frmFormatDocente) {
    if (docentes.size() > 0 && docentes.size() - 1 > posicion) {
      posicion = posicion - 1;
      llenarCampos(frmFormatDocente);
      bloquearCampos(frmFormatDocente); 
    }
  }

  /**
   * Método para visualizar.
   * 
   * @param frmFormatDocente
   */
  public void visualizarSiguiente(FrmFormatDocente frmFormatDocente) {
    if (docentes.size() > 0 && docentes.size() - 1 > posicion) {
      posicion = posicion + 1;
      llenarCampos(frmFormatDocente);
      bloquearCampos(frmFormatDocente);
    }
  }

  /**
   * Método que visualiza. 
   * @param frmFormatDocente
   */
  public void visualizarUltimo(FrmFormatDocente frmFormatDocente) {
    if (docentes.size() > 0) {
      d = docentes.get(docentes.size() - 1);
      llenarCampos(frmFormatDocente);
      bloquearCampos(frmFormatDocente);
    }
  }

  /**
   * Método que guarda el archivo con los datos del Docente.
   */
  public void guardarArchivoD() {
    String resultado = "";
        
    if (docentes.size() > 0) {
      datos = new DatosDocente();
      resultado = datos.guardarArchivo(docentes);
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
   * Método que lee el archivo con los datos del Docente.
   * 
   * @param txtContenido
   * 
   * @return
   * 
   */
  public boolean leerArchivo(JTextArea txtContenido) {
    boolean x = false;
    String contenido = "";
    datos = new DatosDocente();
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
   * 
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
    datos = new DatosDocente();
    contenido = datos.lecturaArchivo();
        
    if (!contenido.isEmpty()) {
      String[] cadenas = contenido.split(","); //Útil para total de lineas
      //JOptionPane.showMessageDialog(null, cadenas);
      for (i = 0; i < cadenas.length; i++) {
        txtContenido.append(cadenas[i] + ",\n");  
      }         
      for (i =  0; i < contenido.length(); i++) {
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

  private void llenarCampos(FrmFormatDocente frmFormatDocente) {
    Date x = null;
    frmFormatDocente.getTxtCedula().setText(d.getCedula());
    frmFormatDocente.getTxtNombre().setText(d.getNombre());
    frmFormatDocente.getCmbSexo().setSelectedItem(d.verSexo());
    x = Date.from(d.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant());
    frmFormatDocente.getDtcFechaNac().setDate(x);
    frmFormatDocente.getTxtTelefono().setText(d.getTelefono());
    frmFormatDocente.getTxtDireccion().setText(d.getDireccion());
    frmFormatDocente.getTxtFacultad().setText(d.getFacultad());
    frmFormatDocente.getTxtTitulo().setText(d.getTitulo());
    frmFormatDocente.getTxtMateria().setText(d.getMateria());
  }

  private void bloquearCampos(FrmFormatDocente frmFormatDocente) {
    frmFormatDocente.getTxtCedula().setEditable(false);
    frmFormatDocente.getTxtNombre().setEditable(false);
    frmFormatDocente.getCmbSexo().setEditable(false);
    frmFormatDocente.getCmbSexo().setEnabled(false);
    frmFormatDocente.getDtcFechaNac().setEnabled(false);
    frmFormatDocente.getTxtTelefono().setEditable(false);
    frmFormatDocente.getTxtDireccion().setEditable(false);
    frmFormatDocente.getTxtFacultad().setEditable(false); 
    frmFormatDocente.getTxtTitulo().setEditable(false);
    frmFormatDocente.getTxtMateria().setEditable(false);
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
  public boolean abrirArchivoBinario(JTable tblEstudiante, JLabel lblTotal) 
      throws ClassNotFoundException {
    boolean x = false;
    int resp = 0; 
    int r = 0;
    JFileChooser cuadro = new JFileChooser();
    resp = cuadro.showOpenDialog(null);
    if (resp == JFileChooser.APPROVE_OPTION) {
      datos = new DatosDocente();
      if (docentes.size() == 0) {
        docentes = datos.abrirArchivoB(cuadro.getSelectedFile());
      } else {
        r = JOptionPane.showConfirmDialog(null, "EXISTE INFORMACIÓN QUE NO HA GUARDADO " 
      + "DESEA REEMPLAZARLA?");
        if (r == JOptionPane.YES_OPTION) {
          docentes = datos.abrirArchivoB(cuadro.getSelectedFile());
        } else {
          x = false;
        }
      } 
      if (docentes.size() > 0) {
        x = true;
        llenarTabla(tblEstudiante, lblTotal);
      }
    }
        
    return x;
  }
  
  /**
   * Método que guarda el archivo.
   */
  
  public void guardarArchivoB() {
    String contenido = "";
    int resp = 0;
    JFileChooser cuadro = null;
    if (docentes.size() > 0) {
      cuadro = new JFileChooser();
      resp = cuadro.showOpenDialog(null);
    }
    if (resp == JFileChooser.APPROVE_OPTION) {
      datos = new DatosDocente();
      contenido = datos.guardarArchivoB(docentes, cuadro.getSelectedFile());
    } else if (contenido.charAt(0) == '1') {
      JOptionPane.showMessageDialog(null, "DATOS GUARDADOS EXITOSAMENTE");
    } else if (contenido.charAt(0) == '0') {
      JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LA INFORMACIÓN" + contenido);
    } else {
      JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS POR GUARDAR");
    }
  }

  private void bloquearCedula(FrmFormatDocente frmFormatDocente) {
    frmFormatDocente.getTxtCedula().setEditable(false);
  }
}
