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
                 Lista de Exercícios de Algoritmo e Programção II - 2
Questão 10: Faça um programa em Java onde o usuário digite um número inteiro inicio e um fim,
depois mostre na tela todos os números ímpares entre inicio e fim, faça utilizando a classe
JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine10_ForImpar
{
    public static void main(String[] args) 
    {
  	int ini=0,fim=0,x;
	ini = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inicial: "));
	fim = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero final: "));
	for(x=ini;x<=fim;x++)
             {
     		if(x%2!=0)
	 	JOptionPane.showMessageDialog(null,"Numeros impares de "+ini+" a "+fim+": \n"+x);        	           		
             }	
    } 
}
