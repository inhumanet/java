/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informa��o
Disciplina: ALGORITMO E PROGRAMA��O II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************
                 Lista de Exerc�cios de Algoritmo e Program��o II - 3
Quest�o 03: Fa�a um programa em Java que leia quantos n�meros o usu�rio desejar, desde que n�o
ultrapasse de 30 e armazene todos em um vetor, depois crie mais dois vetores um contendo os
n�meros pares do primeiro vetor e o outro os n�meros �mpares, fa�a utilizando a classe
JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine03_Par3Vetores
{
    public static void main(String[] args) 
    {
 	int num[] = new int[30];
	int par[] = new int[30];
	int impar[] = new int[30];
	int a, b, c, contaPar=0, contaImpar=0, cont=0;
	for(a=1;a<=30;a++)
             {
	   	num[a] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: \n\nSAIR: DIGITE 0(ZERO)\n"));        	
		if(num[a]==0)
			break;
		else
		  {
		    cont++;  		
		    if(num[a]%2==0)
		      {
			contaPar++;   	       
			for(b=1;b<=30;b++)
             		   par[b]=num[a];
		      }
		    else
		       {
			  contaImpar++;   
			  for(c=1;c<=30;c++)			
			    impar[c]=num[a];
			 
			}  
		  } 
	     } 
	JOptionPane.showMessageDialog(null, "H� "+cont+" elemento(s) no vetor, sendo "+contaPar+" par(es) e "+contaImpar+" �mpar(es)");
    } 
}
