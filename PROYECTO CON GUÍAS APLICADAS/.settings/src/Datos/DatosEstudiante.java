package Datos;

import Model.Estudiante;
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

public class DatosEstudiante {
    public String leerArchivo() {
        String x="", aux="", cedula="", nombre="", sexo="", fecha="", direccion="", telefono="", carrera="", semestre="", materia="";
        JFileChooser cuadro = null;
        File ubicar = null;
        FileReader lectura = null;
        BufferedReader entrada = null;
        
        try{
            cuadro = new JFileChooser();
            cuadro.showOpenDialog(null);
            ubicar=cuadro.getSelectedFile();
            if(ubicar!=null){
                lectura = new FileReader(ubicar);
                entrada = new BufferedReader(lectura);
                while((aux = entrada.readLine()) != null){
                    cedula = "Cedula: "+aux;
                    nombre = "Nombre: "+entrada.readLine();
                    sexo = "Sexo: "+entrada.readLine();
                    fecha = "Fecha Nac: "+entrada.readLine();
                    telefono = "Teléfono: "+entrada.readLine();
                    direccion = "Dirección: "+entrada.readLine();
                    carrera = "Carrera: "+entrada.readLine();
                    semestre = "Semestre: "+entrada.readLine();
                    materia = "Materia: "+entrada.readLine();
                    //if(sexo.compareTo("F")==0)
                    x=x+cedula+"\n"+nombre+"\n"+sexo+"\n"+fecha+"\n"+telefono+"\n"+direccion+"\n"+carrera+"\n"+semestre+"\n"+materia+"\n";
                }
                entrada.close();
                lectura.close();
            }
        }catch(IOException mabel){
            x=mabel.getMessage();
        }
        return x;
    }

    public String guardarArchivo(ArrayList<Estudiante> lista) {
        String x="";
        JFileChooser cuadro = null;
        File guardar = null;
        FileWriter escribir = null;
        
        try{
            cuadro = new JFileChooser();
            cuadro.showSaveDialog(null);
            guardar = cuadro.getSelectedFile();
            if(guardar != null){
                escribir = new FileWriter(guardar+".mabel", false);
                for(Estudiante e: lista){
                    escribir.write(e.getCedula()+"\n");
                    escribir.write(e.getNombre()+"\n");
                    escribir.write(e.getSexo()+"\n");
                    escribir.write(e.getFechaNac().toString()+"\n");
                    escribir.write(e.getTelefono()+"\n");
                    escribir.write(e.getDireccion()+"\n");
                    escribir.write(e.getCarrera()+"\n");
                    escribir.write(e.getSemestre()+"\n");
                    escribir.write(e.getMateria()+"\n");
                }
                escribir.close();   
            }
            x="1";
        }catch(IOException mabel){
            x="0"+mabel.getMessage();
        }
        return x;
    }

    public String lecturaArchivo() {
        String x="", aux="";
        JFileChooser cuadro = null;
        File ubicar = null;
        FileReader lectura = null;
        BufferedReader entrada = null;
        
        try{
            cuadro = new JFileChooser();
            cuadro.showOpenDialog(null);
            ubicar=cuadro.getSelectedFile();
            if(ubicar!=null){
                lectura = new FileReader(ubicar);
                entrada = new BufferedReader(lectura);
                while((aux = entrada.readLine()) != null){
                    x=x+aux+",";
                }
                entrada.close();
                lectura.close();
            }
        }catch(IOException mabel){
            x=mabel.getMessage();
        }
        return x;    }

    public ArrayList<Estudiante> abrirArchivoB(File selectedFile) {
        ArrayList<Estudiante> lista = new ArrayList<>();
        Estudiante e = null;
        File archivo = selectedFile;
        FileInputStream lectura = null;
        ObjectInputStream leer = null;
        
        try{
           lectura = new FileInputStream(archivo);
           leer = new ObjectInputStream(lectura);
           while(true){
               e=(Estudiante)leer.readObject();
               lista.add(e);
           }
        }catch(IOException mabel){
            System.out.println("fin de archivo"+mabel.getMessage());
        }catch(ClassNotFoundException mabel){
            System.out.println(mabel.getMessage());
        }finally{
            try{
                lectura.close();
                leer.close();
            }catch(IOException mabel){
                System.out.println(mabel.getMessage());
            }
        }
        return lista;
    }

    public String guardarArchivoB(ArrayList<Estudiante> lista, File selectedFile)  {
        String x = "";
        File archivo = selectedFile;
        FileOutputStream guardar = null;
        ObjectOutputStream escribir = null;
        
        try{
            guardar = new FileOutputStream(archivo);
            escribir = new ObjectOutputStream(guardar);
            if(escribir!=null){
                for(Estudiante e: lista){
                    escribir.writeObject(e);
                }
            }
            x = "1";
        }catch(IOException mabel){
            x = "0"+mabel.getMessage();
        }finally {
            try{
                escribir.close();
                guardar.close();
            }catch(IOException mabel){
                System.out.println("ERROR"+mabel.getMessage());
            }
        }
        return x ;
    }
    
}
