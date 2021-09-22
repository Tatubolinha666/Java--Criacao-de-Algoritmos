
package rendimento;

import javax.swing.JOptionPane;

public class Rendimento {
static String x;
  
    public static void main(String[] args) {
      x = JOptionPane.showInputDialog(null,"Digite o valor depositado");
Double val1= Double.parseDouble(x);
Double rend= val1*(0.7/100);
JOptionPane.showMessageDialog(null, " Seu rendimento por mês foi de: " + rend+" reais");
    }
    
}
