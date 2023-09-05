import javax.swing.*;

public class atividade08 {
    public static void main(String[] args) {

        double pesoKilo = Double.parseDouble(JOptionPane.showInputDialog("| Informe o peso da pessoa em quilos |\n"));
        double pesoGrama = pesoKilo * 1000;
        JOptionPane.showMessageDialog(null, "| O pessoo da pessoa em gramas é |\n " +pesoGrama);





    }
}
