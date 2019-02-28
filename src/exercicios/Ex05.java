/*OBJETIVO: Receba os coeficientes A, B e C de uma equa��o do 2� grau (AX�+BX+C=0). 
 * Calcule e mostre as ra�zes reais (considerar que a equa��o possue2 ra�zes). 
 * AUTOR: Wagner Francisco
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex05 
{
	static double delta;
	public static void main(String[] args)
	{
		double a,b,c;
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe os valor de A"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe os valor de B"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe os valor de C"));
		CalculaDelta(a,b,c);
		CalculaRaiz(a,b);
		
	}
	
	public static double CalculaDelta(double a, double b, double c)
	{
		 delta = Math.pow(b, 2) - (4*a*c);
		if (delta < 0)
		{
			JOptionPane.showMessageDialog(null, "N�o existe raiz");
			System.exit(0);
			return 0;
		}else 
		{ 
			return delta;
		}
		
	}
	
	public static void CalculaRaiz(double a, double b)
	{
		double x1, x2;
		x1 = (-b + Math.sqrt(delta)) / (2* a);
		x2 = (-b - Math.sqrt(delta))/ (2 * a);
		JOptionPane.showMessageDialog(null, "As ra�zes s�o: "+x1 + ", " + x2);
		
	}

}
