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
Quest�o 02: Fa�a um programa em Java que leia quantos n�meros o usu�rio desejar, desde que n�o
ultrapasse de 30 e armazene todos em um vetor, depois mostre quantos elementos existem no vetor
e quantos s�o m�ltiplos de 3, fa�a utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine02_Multiplo3Vetor
{
    public static void main(String[] args) 
    {
 	int num[] = new int[30];
	int x, cont=0, mult=0;
	for(x=1;x<=30;x++)
             {
	   	num[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: \n\nSAIR: DIGITE 0(ZERO)\n"));        	
		if(num[x]==0)
		     break;
		else
		  {
		     cont++;
		     if(num[x]%3==0)
			mult++;
		  }	
	     }
	JOptionPane.showMessageDialog(null, "H� "+cont+" elemento(s) no vetor, sendo "+mult+" multiplo(s) de 3");
    } 
}
