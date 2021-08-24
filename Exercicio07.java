
import javax.swing.JOptionPane;

/*
    Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a
    idade dessa pessoa expressa apenas em dias. Considerar ano com 365
    dias e mês com 30 dias.
 */

public class Exercicio07 {
    public static void main(String args [])
    {
        int anos, meses, dias, diasTotal;
        
        //Entrada de dados
        anos = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade expressa em anos: "));
        meses = Integer.parseInt(JOptionPane.showInputDialog("..mais quantos meses?: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog("..mais quantos dias?: "));
        
        //Processamento
        diasTotal = anos * 365 + meses * 30 + dias;
        
        //Saída de dados
        JOptionPane.showMessageDialog(null, "Você viveu aproximadamente " + diasTotal + " dias");

    }
}
