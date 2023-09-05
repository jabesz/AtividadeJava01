import javax.swing.*;

public class atividade09 {
    public static void main(String[] args) {

        double baseMaior = Double.parseDouble(JOptionPane.showInputDialog("| Informe a maior base do trapezio |\n"));
        double baseMenor = Double.parseDouble(JOptionPane.showInputDialog("| Informe a menor base do trapezio |\n"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("| Informe a altura base do trapezio |\n"));

        double area = ((baseMaior + baseMenor) * altura) / 2;
        JOptionPane.showMessageDialog(null, "| A área do trapézio é |\n" +area);



    }
}
