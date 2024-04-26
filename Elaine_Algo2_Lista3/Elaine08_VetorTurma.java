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
                 Lista de Exercícios de Algoritmo e Programação II - 3
Questão 08: Faça um programa em Java para receber os alunos de uma turma com as suas
respectivas notas finais. Após a entrada exiba os nomes cuja notas sejam maiores do que a média da
turma e que ao mesmo tempo sejam maiores do que a média de aprovação que é igual a 7.0, faça
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
