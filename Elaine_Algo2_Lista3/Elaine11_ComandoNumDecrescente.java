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
Quest�o 11: Fa�a um programa em Java que obtenha quatro n�meros, passado pelo usu�rio usando
argumentos de linha de comando, e mostre eles em ordem decrescente.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.*;
public class Elaine11_ComandoNumDecrescente
{
    public static void main(String[] args) 
    {
	//AINDA NAO ENTENDI COMO FUNCIONA ESSA LINHA DE COMANDO
	int i=0,j=0, aux=0;
int [] vet;
String msg="";
vet = new int[4];
if (args.length ==4)
{
for(i=0;i<4;i++)
vet[i]= Integer.parseInt(args[i]);
for(i=0;i<4;i++)
for(j=i+1;j<4;j++)
{
if (vet[i]>vet[j])
{
aux = vet[i];
vet[i] = vet[j];
vet[j] = aux;
}
}
for(i=0;i<4;i++)
msg+=vet[i]+" ";
System.out.println("Os elementos ordenados s�o:"+ msg);
}
else System.out.println("O n�mero de argumentos est� errado, deveria ser 4.");
    }
} 
