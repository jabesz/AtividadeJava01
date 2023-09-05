import javax.swing.*;

public class atividade02 {

    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("| Informe o primeiro número | \n"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("| Informe o segundo número | \n"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("| Informe o terceiro número | \n"));
        double res = num1 * num2 * num3;
        JOptionPane.showMessageDialog(null, "| O valor é | \n" +res);









    }

}
