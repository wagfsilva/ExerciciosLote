/* OBJETIVO: Receba o raio de uma circunfer�ncia. Calcule e mostre o comprimento da circunfer�ncia. 
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
		JOptionPane.showMessageDialog(null, "O valor do comprimento �: " +CalculaComp(r));
	}
	
	public static float CalculaComp(float r)
	{
		float c = r * 2;
		return c;
	}

}
