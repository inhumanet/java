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
Quest�o 11: Fa�a um programa em java que mostre na tela um menu de op��es de sanduiches, onde
cada sandu�che possui um c�digo, quando o usu�rio escolher um dos sandu�ches, digitando um
c�digo, mostre os ingredientes do sandu�che escolhido, fa�a com que o usu�rio possa ficar
utilizando o sistema at� entrar com o c�digo da op��o sair, fa�a utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine11_Sanduiche
{
    public static void main(String[] args) 
    {
 	int op=0;
	while(op!=9)
           {
		op = Integer.parseInt(JOptionPane.showInputDialog("QUAL O SANDUICHE?\n\n1- MISTO QUENTE\n2- CACHORRO QUENTE\n3- X-BURGER\n4- BIG MAC\n\n9- SAIR\n"));
		switch(op)
           	  {
               	     case 1:              		
			JOptionPane.showMessageDialog(null, "MISTO QUENTE\n\n02 fatias de p�o de forma\n01 fatia de queijo mussarela\n01 fatia de presunto");
                   	break;	      
                     case 2:
               		JOptionPane.showMessageDialog(null, "CACHORRO QUENTE\n\n01 p�o franc�s\n02 salsichas\nbatata palha,\nsalada\npur� de batata\nmaionese\nketchup\nmostarda");
                   	break;
                     case 3:
               		JOptionPane.showMessageDialog(null, "X-BURGER\n\n01 p�o de hamburger\n01 hamburger\n01 fatia de queijo cheddar");
                   	break;	      
                     case 4:
               		JOptionPane.showMessageDialog(null, "BIG-MAC\n\n02 hamburgueres\nalface\nqueijo\nmolho especial\ncebola e picles\n01 p�o com gergilim");
			break;
		     case 9: break;
                     default: JOptionPane.showMessageDialog(null,"A OPCAO ESCOLHIDA E INVALIDA!");
                   	break;
                 } 
	   }	
    } 
}
