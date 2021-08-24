
import javax.swing.JOptionPane;

/*
Ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e exibir o valor do novo salário.
 */

public class Exercicio09 {
    public static void main(String args [])
    {
        double salarioatual, reajuste, novosalario;
        
        //Entrada de dados
        salarioatual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário atual:"));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do reajuste em porcentagem:"));
        
        //Processamento
        novosalario =  ((salarioatual * reajuste) / 100) + salarioatual;
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "O valor da salário reajustado é:  " + novosalario);
    }
}
