
package control;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Secretaria;

/**
 * Clase que administra los datos de las secretarias almacenadas en el sistema.
 * @author GRUPO#2
 *
 */
public class AdmSecretaria {
  ArrayList<Secretaria> lista = null;
  static AdmSecretaria admSecretaria = null;
  Secretaria s = null;
    
  private AdmSecretaria() {
    lista = new ArrayList<>();
  }
  
  /**
   * Método de AdmSecretaria. 
   * 
   * @return
   * 
   */
  public static AdmSecretaria getAdmSecretaria() {
    if (admSecretaria == null) {
      admSecretaria = new AdmSecretaria();
    }
    return admSecretaria;
  }
  
  public ArrayList<Secretaria> getSecretaria() {
    return lista;
  }
  
  public void setSecretaria(ArrayList<Secretaria> lista) {
    this.lista = lista;
  }

  /**
   * Método que llena los datos de la tabla.
   * 
   * @param tblContenido
   * 
   * @param sexo
   * 
   * @param edad
   * 
   */
  public void llenar(JTable tblContenido, String sexo, String edad) {
    Validacion v = new Validacion();
    //char sexoI=v.aChar(sexo);
    int edadI = v.aentero(edad);
    int fila = 0;
    boolean x = false;
        
    if (sexo.compareTo("Todos") == 0) {
      x = true;
    }
    if (lista.size() > 0) {
      for (Secretaria s : lista) {
        if (x == false) {
          if (edadI >= s.getEdad() && sexo.compareTo(s.verSexo()) == 0) {
            llenarTabla(tblContenido, fila, s);
            fila++;
          }
        }
      }
    } else if (s.getEdad() <= edadI) {
      llenarTabla(tblContenido, fila, s);
      fila++;
    }
  }

  private void llenarTabla(JTable tblContenido, int fila, Secretaria s) {
    DefaultTableModel modelo = (DefaultTableModel) tblContenido.getModel();
    modelo.addRow(new Object[1]);
    tblContenido.setValueAt(s.getCedula(), fila, 0);
    tblContenido.setValueAt(s.getNombre(), fila, 1);
    tblContenido.setValueAt(s.verSexo(), fila, 2);
    tblContenido.setValueAt(s.getFechaNac(), fila, 3);
    tblContenido.setValueAt(s.getTelefono(), fila, 4);
    tblContenido.setValueAt(s.getDireccion(), fila, 5);
    tblContenido.setValueAt(s.calcularEdad(), fila, 6);
  }
}
