/* OBJETIVO: Receba 2 valores reais. Calcule e mostre o maior deles. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 05/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex17 
{
	public static void main(String[] args)
	{
		float x, y;
		x = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de Y"));
		JOptionPane.showMessageDialog(null, "O maior valor: "+MostraMaior(x,y));
	}
	
	public static float MostraMaior(float x, float y)
	{
		if( x > y)
		{
			return x;
		}else
		{
			return y;
		}
	}

}
