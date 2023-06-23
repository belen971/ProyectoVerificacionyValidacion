package Hilos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread{
    private JLabel etiqueta;
    private  FrmCarrera c ;

    public Carrera(JLabel etiqueta, FrmCarrera c) {
        this.etiqueta = etiqueta;
        this.c = c;
    }
    
    public void run(){
        int c1=0, c2=0;
        
        while(true){
            try{
                sleep((int)(Math.random()*1000));
                c1 = c.getLblAuto1().getLocation().x;
                c2 = c.getLblAuto2().getLocation().x;
                if(c1<c.getLblMeta().getLocation().x-10 && c2<c.getLblMeta().getLocation().x-10){
                    etiqueta.setLocation(etiqueta.getLocation().x+10, etiqueta.getLocation().y);
                    c.repaint();
                }else{
                    break;
                }
            }catch(InterruptedException mabel){
                
            }
            if(etiqueta.getLocation().x >= c.getLblMeta().getLocation().x-10){
                if(c1 > c2){
                    JOptionPane.showMessageDialog(null, "GANÓ AUTO 1");
                }else if(c2 > c1){
                    JOptionPane.showMessageDialog(null, "GANÓ AUTO 2");
                }else{
                    JOptionPane.showMessageDialog(null, "EMPATE");
                }
            }
        }
    }
    
}
