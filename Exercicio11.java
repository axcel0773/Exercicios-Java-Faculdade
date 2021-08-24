
import javax.swing.JOptionPane;

/*
Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
Ler o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. 
Calcular e exibir o salário final do vendedor.
 */

public class Exercicio11 {
    public static void main(String args [])
    {
        double vendas, valorvendas, salario, comissao, salariofinal;
        
        //Entrada de dados
        vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos:"));
        valorvendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de vendas:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário fixo:"));
        comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão por vendas:"));
        
        //Processamento
        salariofinal =  salario + (vendas * valorvendas * 0.05) +  (comissao * vendas);
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "O valor final do salário é: " + salariofinal);
    }
}
