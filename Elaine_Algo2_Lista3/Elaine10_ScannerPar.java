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
Quest�o 10: Fa�a um programa em Java que obtenha tr�s n�meros, passado pelo usu�rio usando
argumentos de linha de comando, e mostre qual deles � o maior.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.*;
public class Elaine10_ScannerPar
{
    public static void main(String[] args) 
    {
	//AINDA NAO ENTENDI COMO FUNCIONA ESSA LINHA DE COMANDO
	int n1,n2,n3;
if (args.length ==3)
{
n1= Integer.parseInt(args[0]);
n2= Integer.parseInt(args[1]);
n3= Integer.parseInt(args[2]);
if((n1>n2 && n2>=n3) || (n1>n2 && n3>=n2))
System.out.println("O maior n�mero � "+args[0]+".");
else
if((n2>n1 && n1>=n3) || (n2>n3 && n3>=n1))
System.out.println("O maior n�mero � "+args[1]+".");
else
System.out.println("O maior n�mero � "+args[2]+".");
}
else System.out.println("A quantidade de n�meros est� errada, deve ser 3.");


    }
} 
