/* OBJETIVO: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 08/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex26
{

	public static void main(String[] args)
	{
		int x,y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y"));
		verificaMaior(x,y);
	}
	
	static void verificaMaior(int x, int y)
	{
		int maior, menor;
		if ( x > y)
		{
			maior = x;
			menor = y;
		}else
		{
			maior = y;
			menor = x;
		}
		JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre esses valores: "+calculaSoma(maior, menor));
	}
	
	static int calculaSoma(int maior, int menor)
	{
		int i;
		int	z = 0;
		for(i = menor +1; i < maior; i++)
		{
			if(i % 2 == 1)
			{
				z += i;
			}
		}
		return z;
	}

}
