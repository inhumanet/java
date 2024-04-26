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
                 Lista de Exercícios de Algoritmo e Programção II
Questão 10: O custo ao consumidor de um carro novo é a soma do custo de
fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo
que a porcentagem do distribuidor seja 17% e a dos impostos 40%, faça um programa em Java que
lê o custo de fábrica do carro e mostre três mensagens uma contendo o valor da porcentagem do
distribuido, outra o valor do imposto e por fim uma contendo o custo do carro
para o consumidor, faça primeiro utilizando a classe Scanner e depois a classe JoptionPane.
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


