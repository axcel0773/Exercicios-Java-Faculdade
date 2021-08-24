
import javax.swing.JOptionPane;

/*
Ler 4 números, calcular o quadrado para cada um, somar todos os
quadrados e mostrar o resultado.
*/
public class Exercicio02 {
    public static void main(String args [])
    {
        int numero1, numero2, numero3, numero4, resultado;
        
        //Entrada de dados
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número 2: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número 3: "));
        numero4 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número 4: "));
        
        //Processamento
        resultado = ((numero1 * numero1) + (numero2 * numero2) + (numero3 * numero3) + (numero4 * numero4));
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "Resultado da soma dos quadrados é: " + resultado);
    }
}
