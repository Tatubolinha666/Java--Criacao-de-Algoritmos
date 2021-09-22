import javax.swing.JOptionPane;


public class Calculadora {

 static String x , op;
public static void main(String[] args) {
x = JOptionPane.showInputDialog(null,"Digite o primeiro valor");
int valor1 = Integer.parseInt(x);
x = JOptionPane.showInputDialog(null, "Selecione a operação\n1 - Soma\n2-Divisão\n3-Multiplicação\n4- Subtração") ;
int operacao = Integer.parseInt(x);

 x = JOptionPane.showInputDialog(null,"Digite o segundo valor");
int valor2 = Integer.parseInt(x);

if(operacao == 1){
JOptionPane.showMessageDialog(null, " O resultado é " + (valor1+valor2));

}else if(operacao == 2){
JOptionPane.showMessageDialog(null, " O resultado é " + (valor1/valor2));
}else if(operacao ==3){
JOptionPane.showMessageDialog(null, " O resultado é " + (valor1*valor2));
}else if(operacao == 4){
JOptionPane.showMessageDialog(null, " O resultado é " + (valor1-valor2));
}else{
JOptionPane.showMessageDialog(null, " Operação Inválida");
}

 }

}