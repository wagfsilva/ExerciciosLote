/*OBJETIVO: Calcule e mostre quantos anos serão necessários para que Ana seja maior que
 * Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m, e cresce 2 cm ao ano.
*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex29 
{
	public static void main(String[] args)
	{
		double maria = 1.50;
		double ana = 1.10;
		JOptionPane.showMessageDialog(null, "Ana demorará: "+calculaAnos(maria, ana)+" anos para ser maior que Maria");
	}

	static double calculaAnos(double maria, double ana)
	{
		int anos=0;
		do
		{
			ana += 0.03;
			maria += 0.02;
			anos++;
		}while ( ana < maria);
		return anos;
	}

}

