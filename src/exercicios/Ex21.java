/* OBJETIVO: Receba o pre�o atual e a venda mensal de um produto. Calcule e mostre o novo pre�o sabendo que: 
 * Venda Mensal 		Pre�o Atual		 	Pre�o Novo 
 * < 500 				< 30 				+ 10% 
 * >= 500 e < 1000 		>= 30 e < 80 		+15% 
 * >= 1000 				>= 80 				- 5%
 * Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual. 
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
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do produto"));
		vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a media mensal do produto"));
		JOptionPane.showMessageDialog(null, "O novo pre�o do produto: "+ CalculaPreco(precoAtual, vendaMensal));
		
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
