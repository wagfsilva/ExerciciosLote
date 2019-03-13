/*OBJETIVO: Receba 2 n�meros inteiros. Verifique e mostre todos os n�meros primos existentes entre eles.
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
			System.out.println("Os n�meros primos entre " + menor +" e " + maior +" s�o: ");
			for(i = menor; i <= maior; i++)
			{
				if((i % 2 ==1) &&(i % 3 == 1))
				{
					System.out.println(i);
				}
			}
	}

}
