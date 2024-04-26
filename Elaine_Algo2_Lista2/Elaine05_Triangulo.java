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
Quest�o 05: Fa�a um programa em Java que leia tr?s n�meros inteiros e depois mostre uma
mensagem dizendo se eles formam ou n�o um tri�ngulo, se eles formarem diga qual tipo de
tri�ngulo: equil�tero, is�sceles, escaleno, fa�a utilizando a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine05_Triangulo
{
    public static void main(String[] args) 
    {
 	int a,b,c;
	a = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado a: "));
	b = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado b: "));
	c = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado c: "));
 	if((a>b+c) != (b>a+c) != (c>a+b))
            JOptionPane.showMessageDialog(null,"NAO FORMA UM TRIANGULO");
 	else if(a==b && a==c)
           JOptionPane.showMessageDialog(null,"TRIANGULO EQUILATERO");
	else if(a!=b && a!=c && b!=c)
            JOptionPane.showMessageDialog(null,"TRIANGULO ESCALENO");
	else     
	    JOptionPane.showMessageDialog(null,"TRIANGULO ISOCELES");
    } 
}
