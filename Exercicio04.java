
import javax.swing.JOptionPane;

/*
    Ler um valor inteiro e exibir seu antecessor.
*/
public class Exercicio04 {
    public static void main(String args [])
    {
        int x, antecessor;
        
        //Entrada de dados
        x = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: "));
        
        //Processamento de dados
        antecessor = x - 1;
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "O valor do antecessor é: " + antecessor);
    }
}
