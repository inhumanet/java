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
                 Lista de Exerc�cios de Algoritmo e Program��o II
Quest�o 10: O custo ao consumidor de um carro novo � a soma do custo de
f�brica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo
que a porcentagem do distribuidor seja 17% e a dos impostos 40%, fa�a um programa em Java que
l� o custo de f�brica do carro e mostre tr�s mensagens uma contendo o valor da porcentagem do
distribuido, outra o valor do imposto e por fim uma contendo o custo do carro
para o consumidor, fa�a primeiro utilizando a classe Scanner e depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine10_CarroNovo
{
    public static void main(String[] args) 
    {
//Scanner
	double carronovo=0, custofab=0, distrib=0, imposto=0;
  	Scanner sc = new Scanner(System.in);  
	System.out.println("Digite o custo de fabrica: ");
        float custoFab = sc.nextFloat();
        distrib = ((custoFab/100) * 17);
	imposto = ((custoFab/100) * 40);
	carronovo = custoFab + distrib + imposto;        
        System.out.println("O valor da porcentagem do distribuido: R$"+distrib);
	System.out.println("O valor do imposto: R$"+imposto);
        System.out.println("\n\n\nCusto do carro para o consumidor: R$"+carronovo);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
	carronovo=0;
	custofab=0;
	distrib=0;
	imposto=0;
	custoFab = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo de fabrica: "));
        distrib = ((custoFab/100) * 17);
	imposto = ((custoFab/100) * 40);
	carronovo = custoFab + distrib + imposto;        
        JOptionPane.showMessageDialog(null,"O valor da porcentagem do distribuidor: R$"+distrib);
        JOptionPane.showMessageDialog(null,"O valor do imposto: R$"+imposto);
        JOptionPane.showMessageDialog(null,"Custo do carro para o consumidor: R$"+carronovo);
    } 
}


