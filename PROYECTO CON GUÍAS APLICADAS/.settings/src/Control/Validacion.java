package Control;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
public class Validacion {
    public int leerEntero(String msj){
        int x=0;
        boolean flag=false;
        do{
            try{
                //x=Integer.parseInt(JOptionPane.showMessageDialog(null, msj));
                flag=true;
            }catch(NumberFormatException mabel){
                flag=false;
            }
        }while(flag==false);
        
        return x;
    }
    
    public double leerReal(String msj){
        double x=0.0;
        boolean flag=false;
        
        do{
            try{
                x=Double.parseDouble(JOptionPane.showInputDialog(null, msj));
                flag=true;
            }catch(InputMismatchException mabel){
                flag=false;
            }
        }while(flag==false);
        
        return x;
    }
    
    public String leerLetras(String msj){
        String x=" ";
        int n=10, i=0;
        boolean flag=false;
        
        do{
           x=JOptionPane.showInputDialog(null, msj);
            if(x.length()==n){
                for(i=0; i<x.length(); i++){
                    if(!Character.isDigit(x.charAt(i))){
                        flag=true;
                    }
                    else{
                        flag=false;
                    }
                }
            }
            
        }while(flag==false);
        return x;
    }
    
    public char leerSexo(String msj){
        char x=' ';
        do{
            x=JOptionPane.showInputDialog(null, msj).charAt(0);
        }while(x!='M' && x!='m' && x!='F' && x!='f');
        return x;
    }
    
    public LocalDate leerFecha(String msj){
        LocalDate x= LocalDate.now();
        boolean flag =false;
        
        do{
            try{
                x=LocalDate.parse(JOptionPane.showInputDialog(null, msj));
                flag=true;
            }catch(DateTimeParseException mabel){
                flag=false;
            }  
        }while(flag==false);
        return x;
    }

    double aDouble(String entrada) {
        double x=0.0;
        boolean flag=false;
        
        try{
            x=Double.parseDouble(entrada);
            if(x>0){
                flag=true;                
            }else{
                flag=false;
            }
        }catch(NumberFormatException mabel){
            JOptionPane.showMessageDialog(null, "Error,.... se esperaba un número real");
            flag=false;
            
        }
        return x; 
    }
    
    char aChar(String sexo) {
       char x=' ';
       if(sexo.compareToIgnoreCase("Femenino")==0){
           x='F';
       }else if(sexo.compareToIgnoreCase("Masculino")==0){
           x='M';
       }
       return x;
    }
    
    int aEntero(String edad) {
        int x=0;
        boolean flag = false;
        
        try{
            x= Integer.parseInt(edad);
        }catch(NumberFormatException mabel){
            JOptionPane.showMessageDialog(null, "Error,... Ingrese un entero");
            flag=false;
        }
        return x;
    }
}
