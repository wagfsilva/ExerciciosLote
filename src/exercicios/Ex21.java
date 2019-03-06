/* OBJETIVO: Receba o preço atual e a venda mensal de um produto. Calcule e mostre o novo preço sabendo que: 
 * Venda Mensal 		Preço Atual		 	Preço Novo 
 * < 500 				< 30 				+ 10% 
 * >= 500 e < 1000 		>= 30 e < 80 		+15% 
 * >= 1000 				>= 80 				- 5%
 * Obs.: para outras condições, preço novo será igual ao preço atual. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 06/03/19 
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex21 
{
	public static void main(String[] args) 
	{
		double precoAtual, vendaMensal;
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto"));
		vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a media mensal do produto"));
		JOptionPane.showMessageDialog(null, "O novo preço do produto: "+ CalculaPreco(precoAtual, vendaMensal));
		
	}
	
	public static double CalculaPreco(double preco, double venda)
	{
		double novo = preco;
		if((venda < 500) && (preco < 30))
		{
			novo = (preco * 1.10);
			
		}else
			if((venda >= 500) && (venda <1000) && (preco >=30) && (preco <80))
			{
				novo = (preco * 1.15);
			}else
				if((venda >= 1000) && (preco >= 80))
				{
					novo = preco * 0.05;
					novo = preco - novo;
				}
		return novo;
	}

}
