import javax.swing.*;

public class atividade11 {
    public static void main(String[] args) {

        double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("| Digite o valor da diagonal maior |\n"));
        double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("| Digite o valor da diagonal menor |\n"));
        double area = (diagonalMaior * diagonalMaior) /2;

        JOptionPane.showMessageDialog(null, "| A area do losango é |\n" +area);




    }
}
