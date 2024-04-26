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
Questão 11: Faça um programa em java que mostre na tela um menu de opções de sanduiches, onde
cada sanduíche possui um código, quando o usuário escolher um dos sanduíches, digitando um
código, mostre os ingredientes do sanduíche escolhido, faça com que o usuário possa ficar
utilizando o sistema até entrar com o código da opção sair, faça utilizando a classe JoptionPane.
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
			JOptionPane.showMessageDialog(null, "MISTO QUENTE\n\n02 fatias de pão de forma\n01 fatia de queijo mussarela\n01 fatia de presunto");
                   	break;	      
                     case 2:
               		JOptionPane.showMessageDialog(null, "CACHORRO QUENTE\n\n01 pão francês\n02 salsichas\nbatata palha,\nsalada\npurê de batata\nmaionese\nketchup\nmostarda");
                   	break;
                     case 3:
               		JOptionPane.showMessageDialog(null, "X-BURGER\n\n01 pão de hamburger\n01 hamburger\n01 fatia de queijo cheddar");
                   	break;	      
                     case 4:
               		JOptionPane.showMessageDialog(null, "BIG-MAC\n\n02 hamburgueres\nalface\nqueijo\nmolho especial\ncebola e picles\n01 pão com gergilim");
			break;
		     case 9: break;
                     default: JOptionPane.showMessageDialog(null,"A OPCAO ESCOLHIDA E INVALIDA!");
                   	break;
                 } 
	   }	
    } 
}
