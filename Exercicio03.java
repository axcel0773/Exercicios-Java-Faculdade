
import javax.swing.JOptionPane;

/* 
 Calcular o pagamento de comissão de vendedores de peças, levando-se em
consideração que sua comissão será de 5% do total da venda e que
você tem os seguintes dados: preço unitário da peça e quantidade
vendida.
*/
public class Exercicio03 {
    public static void main(String args [])
    {
        double comissao, preco, venda;
        
        //Entrada de dados
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário da peça: "));
        
        venda = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas da peça: "));
        
        //Processamento
        comissao = (0.05) * (venda * preco) ;
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "O valor da comissão é de: R$ " + comissao);
    }
}
