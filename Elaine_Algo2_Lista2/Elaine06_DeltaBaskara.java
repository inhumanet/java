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
Quest�o 06: Fa�a um programa em Java que mostre os valores das ra�zes de uma equa��o de
segundo grau, para isso o usu�rio dever� entrar com tr�s valores a,b e c, fa�a utilizando a classe
JoptionPane.
Obs.: lembre-se que o Delta = b2 � 4ac, e que para ter ra�zes reais o mesmo deve ser maior ou igual
a zero.
*************************************************************************************/
import javax.swing.*;
public class Elaine06_DeltaBaskara
{
    public static void main(String[] args) 
    {
 	int a, b, c;
	double x1,x2,raizdelta;
  	a = Integer.parseInt(JOptionPane.showInputDialog("Digite a: "));
	b = Integer.parseInt(JOptionPane.showInputDialog("Digite b: "));
	c = Integer.parseInt(JOptionPane.showInputDialog("Digite c: "));
	int delta = ((b*b)-(4*a*c));     //teste 6 7 1 em qualquer ordem
  	raizdelta = Math.sqrt(delta);     //raiz quadrada - biblioteca Math
  	x1=(((b* -1)+raizdelta)/(2*a));
 	x2=(((b*-1)-raizdelta)/(2*a));
	if(raizdelta<=0)
       		JOptionPane.showMessageDialog(null,"NAO HA RAIZ DE DELTA VALIDA");
        else
		JOptionPane.showMessageDialog(null,"DELTA: "+delta+"\nX1: "+x1+"\nX2: "+x2);
    } 
}
