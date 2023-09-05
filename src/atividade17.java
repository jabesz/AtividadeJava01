import javax.swing.*;

public class atividade17 {
    public static void main(String[] args) {

        int raio = Integer.parseInt(JOptionPane.showInputDialog("| Informe o valor do raio do circulo |\n"));
        int comprimento = (int) 2 * Math.PI * raio;

        int area = (int) Math.PI * raio * raio;

        int volume = (int) ((int) 4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, "| O comprimento da esfera |\n" +comprimento);
        JOptionPane.showMessageDialog(null, "| A area da esfera é |\n" +area);
        JOptionPane.showMessageDialog(null, "| O volume da esfera é |\n" +volume);

    }
}
