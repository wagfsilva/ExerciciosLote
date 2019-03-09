/* OBJETIVO: Calcule e mostre o quadrado dos números de 10 a 150. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 08/03/19
 */

package exercicios;

public class Ex23
{
	public static void main(String[] args) 
	{
		int res;
		for (int i = 10; i <= 150; i++) 
		{
			res = i * i;
			System.out.println("O quadrado de "+ i+ " é:  "+ res);
		}
	}
}
