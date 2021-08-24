
import javax.swing.JOptionPane;

/*
  Ler as dimensões de um retângulo (base e altura), calcular e escrever
a área do retângulo.
 */

public class Exercicio05 {
    public static void main(String args [])
    {
        double base, altura, area;
        
        //Entrada de dados
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
        altura =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura:"));
        
        //Processamento
        area = base * altura;
        
        //Saíde de dados
        JOptionPane.showMessageDialog(null, "O valor da área é:  " + area);
    }
}
