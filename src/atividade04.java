import javax.swing.*;

public class atividade04 {
    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("| Informe a primeira nota | \n"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("| Informe a segunda nota | \n"));
        double mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;
        JOptionPane.showMessageDialog(null, "| A media ponderada é | \n" +mediaPonderada);

    }
}
