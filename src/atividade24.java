import javax.swing.*;

public class atividade24 {
    public static void main(String[] args) {

        double dinheiroEmReais = Double.parseDouble(JOptionPane.showInputDialog("| Digite a quantidade de dinheiro em reais |\n"));

        double cotacaoDolar = 1.80;
        double cotacaoMarcoAlemao = 2.00;
        double cotacaoLibraEsterlina = 3.57;

        double dinheiroEmDolares = dinheiroEmReais / cotacaoDolar;
        double dinheiroEmMarcosAlemaes = dinheiroEmReais / cotacaoMarcoAlemao;
        double dinheiroEmLibrasEsterlinas = dinheiroEmReais / cotacaoLibraEsterlina;

        JOptionPane.showMessageDialog(null, "| Quantidade em dolares |\n" +dinheiroEmDolares);
        JOptionPane.showMessageDialog(null, "| Quantidade em marco alemão |\n" +dinheiroEmDolares);
        JOptionPane.showMessageDialog(null, "| Quantidade em libras esterlinas |\n" +dinheiroEmDolares);
    }
}
