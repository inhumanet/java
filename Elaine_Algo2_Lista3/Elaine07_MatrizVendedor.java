/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informação
Disciplina: ALGORITMO E PROGRAMAÇÃO II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************11
                 Lista de Exercícios de Algoritmo e Programação II - 3
Questão 07: Faça um programa em Java que carregue uma matriz 3 x 3 com os valores das vendas
de uma loja supondo 3 meses e 3 vendedores. Calcule e mostre: em cada mês qual foi o vendedor
que vendeu mais, faça utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine07_MatrizVendedor
{
    public static void main(String[] args) 
    {
	//variaveis
	int matriz[][] = new int [4][4];	
	int a, b, vendedor=0, maior=0;
	int vencedor[]= new int[4];
	int vendeMais[]= new int[4];	
	//entrada de dados
	for(a=1;a<4;a++)	   	
	   for(b=1;b<4;b++)	   	
	     	matriz[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da venda do mês "+a+" do vendedor "+b+": "));

	//analise
	for(a=1;a<4;a++)             
	   {
	   	for(b=1;b<4;b++)	   	
		   if(matriz[a][b] > maior)
		   	{
			   maior = matriz[a][b];
			   vendedor=b;
		   	}
		vencedor[a]=vendedor;
		vendeMais[a]=maior;
		maior=0;
	   }

	//exibir 
	for(a=1;a<4;a++)             
	   JOptionPane.showMessageDialog(null,"Quem vendeu mai no mes "+a+" foi o Vendedor "+vencedor[a]+" com o valor de R$ "+vendeMais[a]);  
    }
} 
