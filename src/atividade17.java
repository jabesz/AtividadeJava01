import javax.swing.*;

public class atividade17 {
    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog("| Informe o valor do raio do circulo |\n"));
        double comprimento = 2 * Math.PI * raio;

        double area = Math.PI * raio * raio;

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, "| O comprimento da esfera |\n" +comprimento);
        JOptionPane.showMessageDialog(null, "| A area da esfera é |\n" +area);
        JOptionPane.showMessageDialog(null, "| O volume da esfera é |\n" +volume);

    }
}
