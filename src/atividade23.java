import javax.swing.*;

public class atividade23 {
    public static void main(String[] args) {

        double primeiroAngulo = Double.parseDouble(JOptionPane.showInputDialog("| Informe a medida do primeiro angulo |\n"));
        double segundoAngulo = Double.parseDouble(JOptionPane.showInputDialog("| Informe a medida do segundo angulo |\n"));
        double terceiroAngulo = 180 - (primeiroAngulo + segundoAngulo);

        JOptionPane.showMessageDialog(null, "| A medida do terceiro angulo é |\n" +terceiroAngulo+ " graus");
    }
}
