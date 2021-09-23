
package loja;

import javax.swing.JOptionPane;


public class Loja {

   static String x;
    public static void main(String[] args) {
        x= JOptionPane.showInputDialog(null,"Digite o valor de seu produto");
        Double prod= Double.parseDouble(x);
        Double val= prod/5;
        JOptionPane.showMessageDialog(null,"Você pagará "+val+" reais por mês.");
        
    }
    
}
