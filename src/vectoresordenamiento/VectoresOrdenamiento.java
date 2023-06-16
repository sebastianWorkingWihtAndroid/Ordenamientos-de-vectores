
package vectoresordenamiento;

import javax.swing.JOptionPane;


public class VectoresOrdenamiento {

  
    public static void main(String[] args) {
      
        double mayor;
        double salario[] = new double[5];
        
        for (int i = 0; i < 5; i++) {
            salario[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite salario del trabajador"));
        }
        for (int i = 0; i < 5; i++) {
            
            mayor=salario[i];
            if (salario[i]>mayor) {
                System.out.println("");   
            }
             
        }
    }
    
}
