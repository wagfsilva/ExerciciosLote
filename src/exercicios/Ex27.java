/*OBJETIVO: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos. 
 *AUTOR: Wagner Francisco da Silva
 *DATA: 08/03/19 
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex27 
{
	static int maior, menor;
	public static void main(String[] args) 
	{
		int vetNum[] = new int [100];
		carregaVetor(vetNum);
		verificaValor(vetNum);
	}
	
	static int[] carregaVetor(int[] vet)
	{
		int i;
		for( i = 0; i <100; i++)
		{
			vet[i] = (int) (Math.random() * 1000) + 1;
			System.out.println(vet[i]);
			maior = vet[i];
			menor = vet[i];
		}
		return vet;
	}
	
	static void verificaValor(int[] vet)
	{
		int i;
		
		for(i = 0; i < 100; i++)
		{
			if(vet[i] > maior)
			{
				maior = vet[i];
			}else
				if(vet[i] < menor)
				{
					menor = vet[i];
				}
		}
		
		JOptionPane.showMessageDialog(null, "Maior valor: " + maior + "\nMenor valor: "+ menor);
	}

		
}
