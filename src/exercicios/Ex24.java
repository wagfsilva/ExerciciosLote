/*OBJETIVO: Receba um número inteiro. Calcule e mostre o seu fatorial. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 08/03/
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex24 
{
	public static void main(String[] args) 
	{
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		JOptionPane.showMessageDialog(null, "O fatorial de "+ x + " é: "+ calculaFat(x));
	}
	
	static int calculaFat(int x)
	{
		int fat = 1;
		int i; 
		for( i= 0; i< x; i++)
		{
			fat = (i * fat) + fat;
			
		}
		return fat;
		
	}
}
