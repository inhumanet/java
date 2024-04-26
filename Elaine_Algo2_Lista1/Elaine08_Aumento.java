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
Quest�o 08: Fa�a um programa em Java que leia o nome do funcion�rio, o n�mero de horas
trabalhadas e o valor da hora trabalhada, calcule o valor do sal�rio bruto e acrescente 15% , mostre
duas mensagens uma contendo o valor do sal�rio bruto sem aumento e outra com o aumento, fa�a
primeiro utilizando a classe Scanner e depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine08_Aumento
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
	System.out.print("\n\n\nNome do funcionario: ");
	String nome = sc.next();
        System.out.print("Numero de horas trabalhadas: ");
        int hora = sc.nextInt();
	System.out.print("Valor da hora trabalhada: ");
        double valor = sc.nextDouble();
        double salBruto = hora*valor;
	double aumento = ((salBruto/100)*15)+salBruto;
        System.out.println("\n\n\nO salario bruto do(a) "+nome+" e: "+salBruto);
        System.out.println("\nO salario do(a) "+nome+" com o aumento e: "+aumento);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
	nome = (JOptionPane.showInputDialog("Nome do funcion�rio: "));
	hora = Integer.parseInt(JOptionPane.showInputDialog("Numero de horas trabalhadas: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora trabalhada: "));
        salBruto = hora*valor;
	aumento = ((salBruto/100)*15)+salBruto;
        JOptionPane.showMessageDialog(null, "O salario bruto do(a) "+nome+" e: "+salBruto); 
	JOptionPane.showMessageDialog(null, "O salario do(a) "+nome+" com o aumento e: "+aumento); 
    } 
}
