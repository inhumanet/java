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
                 Lista de Exerc�cios de Algoritmo e Program��o II - 2
Quest�o 10: Fa�a um programa em Java onde o usu�rio digite um n�mero inteiro inicio e um fim,
depois mostre na tela todos os n�meros �mpares entre inicio e fim, fa�a utilizando a classe
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
