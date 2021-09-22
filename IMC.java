/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;


public class IMC { 
      static String x ;
public static void main(String[] args) {
x = JOptionPane.showInputDialog(null,"Digite seu peso");
int peso = Integer.parseInt(x);
x= JOptionPane.showInputDialog(null, "Digite sua altura ") ;
Double altura= Double.parseDouble(x);
double imc;
 imc = peso/(altura*altura);
 if(imc < 18.5){
JOptionPane.showMessageDialog(null, " Seu IMC é " + imc+" abaixo do peso ideal");

}else if (imc<24.9){
JOptionPane.showMessageDialog(null, " Você está no seu peso ideal");
}else if (imc<29.9){
JOptionPane.showMessageDialog(null, " Você está acima do peso (sobrepeso)");
}else if(imc<34.9){
JOptionPane.showMessageDialog(null, " Obesidade grau 1");
}else if(imc<39.9){
JOptionPane.showMessageDialog(null, " Obesidade grau 2");
}else if(imc<40){
JOptionPane.showMessageDialog(null, " Obesidade grau 3");
}else{
JOptionPane.showMessageDialog(null, " Operação Inválida");
}

 }

}


