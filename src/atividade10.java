import javax.swing.*;

public class atividade10 {
    public static void main(String[] args) {

        double lado = Double.parseDouble(JOptionPane.showInputDialog("| Digite o valor do lado do quadrado |\n"));

        double area = lado * lado;
        JOptionPane.showMessageDialog(null, "| A area do quadrado é |\n" +area);

    }
}
