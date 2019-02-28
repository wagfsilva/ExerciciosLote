/* OBJETIVO: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex11 
{
	public static void main(String[] args) 
	{
		float r = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do raio"));
		JOptionPane.showMessageDialog(null, "O valor do comprimento é: " +CalculaComp(r));
	}
	
	public static float CalculaComp(float r)
	{
		float c = r * 2;
		return c;
	}

}
