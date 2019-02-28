/* OBJETIVO: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args)
	{
		float c = Float.parseFloat(JOptionPane.showInputDialog("Informe a temperatura em Celsius"));
		JOptionPane.showMessageDialog(null, "A temperatura convertida em Fahrenheit é: "+CalculaTemp(c));
	}
	
	public static float CalculaTemp(float c)
	{
		float f = (9* c +160)/5;
		return f;
	}

}
