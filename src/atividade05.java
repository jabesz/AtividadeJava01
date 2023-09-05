import javax.swing.*;

public class atividade05 {
    public static void main(String[] args) {

        double Price = Double.parseDouble(JOptionPane.showInputDialog("| Informe o preço | \n"));
        double newPrice = Price * 0.9;

        JOptionPane.showMessageDialog(null, "| O novo preço é | \n" +newPrice);

    }
}
