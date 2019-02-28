/* OBJETIVO: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/0219
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex09
{
	public static void main(String[] args) 
	{
		int x,y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y"));
		JOptionPane.showMessageDialog(null, "A soma dos quadrados é: "+CalculaSoma(x,y));
	}
	
	public static double CalculaSoma(int x, int y)
	{
		double z = (Math.pow(x, 2)) + (Math.pow(y, 2));
		return z;
	}

}
