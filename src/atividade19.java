import javax.swing.*;

public class atividade19 {
    public static void main(String[] args) {
        double largura = Double.parseDouble(JOptionPane.showInputDialog("| Digite a largura do cômodo em metros |\n"));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("| Digite o comprimento do cômodo em metros |\n"));
        double area = largura * comprimento;

        int potenciaIluminacao = (int) (area * 18);

        JOptionPane.showMessageDialog(null, "| A area do comodo é |\n" + area);
        JOptionPane.showMessageDialog(null,  "| A potencia da iluminação necessaria é |\n" +potenciaIluminacao+ "W");

    }
}
