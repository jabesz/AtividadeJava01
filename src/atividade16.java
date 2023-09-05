import javax.swing.*;

public class atividade16 {
    public static void main(String[] args) {

        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("| Informe o valor do primeiro cateto |\n"));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("| Informe o valor do segundo cateto |\n"));
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        JOptionPane.showMessageDialog(null, "| O valor da hipotenusa é |\n" +hipotenusa);
    }
}
