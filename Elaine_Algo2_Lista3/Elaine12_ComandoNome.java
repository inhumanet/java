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
Quest�o 12: Fa�a um programa em Java que obtenha um nome, passado pelo usu�rio usando
argumentos de linha de comando, e mostre quantas vogias existe no nome.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.*;
public class Elaine12_ComandoNome
{
    public static void main(String[] args) 
    {
	//AINDA NAO ENTENDI COMO FUNCIONA ESSA LINHA DE COMANDO
	


int i=0,cont=0;
if (args.length ==1)
{
String nome = args[0].toUpperCase();
for(i=0;i<nome.length();i++)
{
if(nome.charAt(i) == 'A' || nome.charAt(i) == 'E' || nome.charAt(i) == 'I' || nome.charAt(i) == 'O' ||
nome.charAt(i) == 'U')
cont+=1;
}
System.out.println("O n�mero de vogais na string �:"+ cont);
}
else System.out.println("O n�mero de argumentos est� errado, deveria ser 1.");    }
} 
