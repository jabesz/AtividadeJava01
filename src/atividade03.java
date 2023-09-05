import javax.swing.*;

public class atividade03 {
    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("| Informe o primeiro número | \n"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("| Informe o segundo número | \n"));
        double res = num1 / num2;
        JOptionPane.showMessageDialog(null, "| O resultado da divisão é | \n " +res);

    }
}
