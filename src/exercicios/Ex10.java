/* OBJETIVO: Receba 2 números reais. Calcule e mostre a diferença desses valores. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex10 
{
	public static void main(String[] args) 
	{
		double x,y;
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Y"));
		JOptionPane.showMessageDialog(null, "A diferença dos valores: "+CalculaDiferenca(x,y));
	}
	
	public static double CalculaDiferenca(double x, double y)
	{
		double z =  x - y;
		return z;
	}

}
