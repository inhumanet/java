/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informação
Disciplina: ALGORITMO E PROGRAMAÇÃO II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************
                 Lista de Exercícios de Algoritmo e Programção II - 3
Questão 03: Faça um programa em Java que leia quantos números o usuário desejar, desde que não
ultrapasse de 30 e armazene todos em um vetor, depois crie mais dois vetores um contendo os
números pares do primeiro vetor e o outro os números ímpares, faça utilizando a classe
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
	JOptionPane.showMessageDialog(null, "Há "+cont+" elemento(s) no vetor, sendo "+contaPar+" par(es) e "+contaImpar+" ímpar(es)");
    } 
}
