import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        int eleitor, branco, nulo, voto, tVoto, tNulo, tBranco;
        eleitor = Integer.parseInt(JOptionPane.showInputDialog("Quantos eleitores tem na sua cidade? "));
        voto = Integer.parseInt(JOptionPane.showInputDialog("Quantos tiveram votos válidos? "));
        nulo = Integer.parseInt(JOptionPane.showInputDialog("Quantos votaram nulo? "));
        branco = Integer.parseInt(JOptionPane.showInputDialog("Quantos votaram em branco? "));

        tVoto = (voto * 100) / eleitor;
        tBranco = (branco * 100) / eleitor;
        tNulo = (nulo * 100) / eleitor;

        JOptionPane.showMessageDialog(null, "O percentual de votos válidos, "
                + "brancos e nulos  foram de " + tVoto + "%, " + tBranco + "%, " 
                + tNulo + "%.");
    }
}