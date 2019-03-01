/* OBJETIVO: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 01/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex14 
{
	public static void main(String[] args)
	{
		int x, y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro cateto"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo cateto"));
		JOptionPane.showMessageDialog(null, "A hipotenusa é: "+CalculaHip(x,y));
	}
	
	public static double CalculaHip(int x, int y)
	{
		double z = (Math.pow(x, 2)) + (Math.pow(y, 2));
		z = Math.sqrt(z);
		return z;
	}

}
