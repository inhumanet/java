/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informação
Disciplina: ALGORITMO E PROGRAMAÇÃO II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************
                 Lista de Exercícios de Algoritmo e Programção II - 2
Questão 06: Faça um programa em Java que mostre os valores das raízes de uma equação de
segundo grau, para isso o usuário deverá entrar com três valores a,b e c, faça utilizando a classe
JoptionPane.
Obs.: lembre-se que o Delta = b2 – 4ac, e que para ter raízes reais o mesmo deve ser maior ou igual
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
