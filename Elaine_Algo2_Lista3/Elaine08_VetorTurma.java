/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informa��o
Disciplina: ALGORITMO E PROGRAMA��O II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************11
                 Lista de Exerc�cios de Algoritmo e Programa��o II - 3
Quest�o 08: Fa�a um programa em Java para receber os alunos de uma turma com as suas
respectivas notas finais. Ap�s a entrada exiba os nomes cuja notas sejam maiores do que a m�dia da
turma e que ao mesmo tempo sejam maiores do que a m�dia de aprova��o que � igual a 7.0, fa�a
utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine08_VetorTurma
{
    public static void main(String[] args) 
    {
	//variaveis
	String aluno [] = new String [4];	
	Double nota[]= new Double[4];	
	Double notaMaior[]= new Double[4];
	int a, b;
	Double soma = new Double(0);
	Double media;
	String msg = new String("");

	//entrada de dados
	for(a=1;a<4;a++)
	   {	   	
	   	aluno[a]= JOptionPane.showInputDialog("Aluno(a) "+a+": "); 	   	
	     	nota[a] = Double.parseDouble(JOptionPane.showInputDialog("Nota : "));
		soma += nota[a];
	   }
	
	//analise
	media = soma/3;
	
	//exibir 
	for(a=1;a<4;a++)             
	     if(nota[a]>media && nota[a]>=7)
		   msg += (aluno[a]+" teve a nota "+nota[a]+"\n");  
	JOptionPane.showMessageDialog(null, "Media da turma: "+media+"\n"+msg);  
    }
} 
