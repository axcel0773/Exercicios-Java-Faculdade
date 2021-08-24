
import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String args [])
    {
        double dolares, reais, conversao;
        //Entrada de dados
        dolares = Double.parseDouble( 
                JOptionPane.showInputDialog("Entre com o número de dólares:"));
        conversao = Double.parseDouble( 
                JOptionPane.showInputDialog("Entre com a taxa de conversão:"));
        
        //Processamento
        reais = dolares * conversao;
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "R$  " + reais);
    }
}
