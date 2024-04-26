/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informação
Disciplina: ALGORITMO E PROGRAMAÇÃO II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************11
                 Lista de Exercícios de Algoritmo e Programção II - 3
Questão 06: Faça um programa em Java que leia dos vetores de nomes e depois armazene em um
terceiro vetor os nomes dos dois primeiros vetores intercalados e por fim mostre o terceiro vetor na
tela, faça utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine06_IntercalarNome3Vetores
{
    public static void main(String[] args) 
    {
 	
	//variaveis
	String nome[] = new String[4];
	String nome2[] = new String[4];
	String lista[] = new String[nome.length + nome2.length]; 
	String msg = "";
	int a, indice=1;
	
	//entrada de dados
	JOptionPane.showMessageDialog(null, "LISTA1","ELAINE",JOptionPane.INFORMATION_MESSAGE);        	
	for(a=1;a<4;a++)	   	
		nome[a] = JOptionPane.showInputDialog("NOME: ");
	JOptionPane.showMessageDialog(null, "LISTA2","ELAINE",JOptionPane.INFORMATION_MESSAGE);        	
	for(a=1;a<4;a++)             
	   	nome2[a] = JOptionPane.showInputDialog("Lista 2\n\nNOME: ");

	//criando o terceiro vetor intercalado
	for (a=1; a<nome.length; a++)   
        	{   
            		lista[indice] = nome[a];   
            		indice+=2;   
        	}   
  
        indice=2;
	for (a=1; a<nome2.length; a++)   
        	{   
            		lista[indice] = nome2[a];   
            		indice+=2;   
        	}
	for (a=1; a<lista.length; a++)   
        	{   
			msg += lista[a]+"\n";
        	}

	//exibir  
	JOptionPane.showMessageDialog(null,msg);   
    }
} 
