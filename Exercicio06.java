
import javax.swing.JOptionPane;

/*
    Ler a idade de uma pessoa expressa em anos e exibir expressa em dias
   (considere que um ano tem 365 dias.
 */

public class Exercicio06 {
    public static void main(String args [])
    {
        int anos, dias;
        
        //Entrada de dados
        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade em anos"));
        
        //Processamento
        dias =  anos * 365;
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "A sua idade em dias é: " + dias);
    }
}
