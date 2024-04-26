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
Questão 08: Faça um programa em Java que leia o nome do funcionário, o número de horas
trabalhadas e o valor da hora trabalhada, calcule o valor do salário bruto e acrescente 15% , mostre
duas mensagens uma contendo o valor do salário bruto sem aumento e outra com o aumento, faça
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
	nome = (JOptionPane.showInputDialog("Nome do funcionário: "));
	hora = Integer.parseInt(JOptionPane.showInputDialog("Numero de horas trabalhadas: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora trabalhada: "));
        salBruto = hora*valor;
	aumento = ((salBruto/100)*15)+salBruto;
        JOptionPane.showMessageDialog(null, "O salario bruto do(a) "+nome+" e: "+salBruto); 
	JOptionPane.showMessageDialog(null, "O salario do(a) "+nome+" com o aumento e: "+aumento); 
    } 
}
