/* OBJETIVO: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 05/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex19
{
	public static void main(String[] args) 
	{
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		VerificaValor(x);
	}
	
	public static void VerificaValor(int x)
	{
		if (x % 2 == 0)
		{
			JOptionPane.showMessageDialog(null, x+" é divisível por 2");
		}else
			if( x % 3 == 0)
			{
				JOptionPane.showMessageDialog(null, "é divisível por 3");
			}
	}
}
