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
Quest�o 05: Fa�a um programa em Java que leia dos vetores de nomes e depois fa�a a uni�o dos
mesmos e armazene em um terceiro vetor e por fim mostre o terceiro vetor na tela, fa�a utilizando a
classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine05_Nome3Vetores
{
    public static void main(String[] args) 
    {
 	String nome[] = new String[4];
	String nome2[] = new String[4];
	int a;
	JOptionPane.showMessageDialog(null, "LISTA1","ELAINE",JOptionPane.INFORMATION_MESSAGE);        	
	for(a=1;a<4;a++)	   	
		nome[a] = JOptionPane.showInputDialog("NOME: ");
	JOptionPane.showMessageDialog(null, "LISTA2","ELAINE",JOptionPane.INFORMATION_MESSAGE);        	
	for(a=1;a<4;a++)             
	   	nome2[a] = JOptionPane.showInputDialog("Lista 2\n\nNOME: ");		
	String lista[] = new String[nome.length + nome2.length];   
	System.arraycopy(nome, 0, lista, 0, nome.length);   
    	System.arraycopy(nome2, 0, lista, nome.length, nome2.length);
	JOptionPane.showMessageDialog(null,lista,"VETOR 3 - LISTA 1 e 2",JOptionPane.INFORMATION_MESSAGE);        	
    }
} 


