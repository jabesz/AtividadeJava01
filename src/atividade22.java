import javax.swing.*;

public class atividade22 {
    public static void main(String[] args) {

        double numeroLados = Double.parseDouble(JOptionPane.showInputDialog("| Digite o numero  de lados do poligono convexo |\n"));

        double numeroDiagonais = (numeroLados * (numeroLados - 3)) /3;

        JOptionPane.showMessageDialog(null, "| O numero diagonais do poligono é |\n" +numeroDiagonais);


    }
}
