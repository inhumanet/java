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
Quest�o 04: Fa�a um programa em Java que leia quantos nomes o usu�rio desejar, desde que n�o
ultrapasse de 30 e armazene todos em um vetor e depois leia um nome para ser procurado, depois
quantas vezes este nome aparece no vetor, fa�a utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine04_NomeVetorBuscar
{
    public static void main(String[] args) 
    {
 	String nome[] = new String[31];
	String busca;
	int x, contaNome=0;
	for(x=1;x<31;x++)
             {
	   	nome[x] = JOptionPane.showInputDialog("Digite um nome: \n\nSAIR: <ENTER>\n");        	
		if(nome[x].equals(""))
			break;	
	     } 
	busca = JOptionPane.showInputDialog("Nome a ser procurado: \n");	
	for(x=1;x<4;x++)
             {
		if(nome[x].equals(busca))
			contaNome++;	
	     } 
	JOptionPane.showMessageDialog(null, "O nome "+busca+" aparece "+contaNome+" vez(es)");
	
        
    } 
}
 