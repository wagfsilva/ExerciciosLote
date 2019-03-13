/*OBJETIVO: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 *AUTOR: Wagner Francisco da Silva
 *DATA: 11/03/19
*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex28 
{
	public static void main(String[] args)
	{
		int x, y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y"));
		verificaMaior(x,y);
	}
			
	static void verificaMaior(int x, int y)
	{
		int maior, menor;
		if(x > y)
		{
			maior = x;
			menor = y;
		}else
		{
			maior = y;
			menor = x;
		}
			verificaPrimos(maior,menor);
		}
			
		static void verificaPrimos(int maior, int menor)
		{
			int i;
			System.out.println("Os números primos entre " + menor +" e " + maior +" são: ");
			for(i = menor; i <= maior; i++)
			{
				if((i % 2 ==1) &&(i % 3 == 1))
				{
					System.out.println(i);
				}
			}
	}

}
