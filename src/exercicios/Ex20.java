/* OBJETIVO: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor. 
 * AUTOR: Wagner Francisco da Silva
 * Data: 05/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex20
{
	public static void main(String[] args)
	{
		int x,y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y"));
		VerificaMaior(x,y);
	
	}
	
	public static int VerificaMaior(int x, int y)
	{
		int maior, menor;
		if (x > y)
		{
			maior = x;
			menor = y;
		}else
		{
			maior = y;
			menor = x;
		}
		return VerificaValor(maior, menor);
	}
	
	public static int VerificaValor(int maior, int menor)
	{
		if (maior % menor == 0)
		{
			  JOptionPane.showMessageDialog(null, maior +" é múltiplo de " + menor);
		
		}else
		{
			JOptionPane.showMessageDialog(null, maior+ " não é múltiplo de "+ menor);
		
		}
		return 0;
	}
}
