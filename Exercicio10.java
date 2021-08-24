
import javax.swing.JOptionPane;

/*
 O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
ler o custo de fábrica de um carro, 
calcular e escrever o custo final ao consumidor.
 */

public class Exercicio10 {
    public static void main(String args [])
    {
        double valorfabrica, custo, custofinal;
        
        //Entrada de dados
        valorfabrica = Double.parseDouble(JOptionPane.showInputDialog("Digital o valor de fábrica do carro: "));
        
        //Processamento
        custo = 1.73 * valorfabrica;
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "O valor final para o consumidor é: " + custo);
    }
}
