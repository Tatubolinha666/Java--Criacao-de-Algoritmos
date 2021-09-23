
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Rendimento {
    
    static String x;
  
    public static void main(String[] args) {
      
      x = JOptionPane.showInputDialog(null,"Digite o valor depositado");
Double val1= Double.parseDouble(x);
Double rend= val1*(0.7/100);
DecimalFormat formatador = new DecimalFormat("0.00");
JOptionPane.showMessageDialog(null, " Seu rendimento por mês foi de "+formatador.format(rend)+" reais");
    }
    
}

   
