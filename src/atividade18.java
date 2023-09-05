import javax.swing.*;

public class atividade18 {
    public static void main(String[] args) {

        double temperaturaGrausCelsius = Double.parseDouble(JOptionPane.showInputDialog("| Informe a temperatura em graus celsius |\n"));
        double temperaturaFahrenheit = (temperaturaGrausCelsius * 9/5) + 32;

        JOptionPane.showMessageDialog(null, "| Temperatura em farenheit é |\n " +temperaturaFahrenheit);

    }
}
