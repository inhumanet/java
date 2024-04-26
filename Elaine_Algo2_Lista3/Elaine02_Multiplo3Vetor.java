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
Questão 02: Faça um programa em Java que leia quantos números o usuário desejar, desde que não
ultrapasse de 30 e armazene todos em um vetor, depois mostre quantos elementos existem no vetor
e quantos são múltiplos de 3, faça utilizando a classe JoptionPane.
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
	JOptionPane.showMessageDialog(null, "Há "+cont+" elemento(s) no vetor, sendo "+mult+" multiplo(s) de 3");
    } 
}
