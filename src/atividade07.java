import javax.swing.*;

public class atividade07 {
    public static void main(String[] args) {

        double peso = Double.parseDouble(JOptionPane.showInputDialog("| Informe o peso | \n"));
        double pesoEngordar = peso + (peso * 0.15);
        double pesoEmagrecer = peso - (peso * 0.20);

        JOptionPane.showMessageDialog(null, "Se a pessoa engordar 15%, o novo peso sera:\n " +pesoEngordar);
        JOptionPane.showMessageDialog(null, "Se a pessoa emagrecer 20%, o novo peso sera:\n " +pesoEmagrecer);
    }
}
