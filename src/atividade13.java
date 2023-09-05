
import javax.swing.*;

public class atividade13 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("| Informe um numero |"));
        JOptionPane.showMessageDialog(null, "Tabuada do " +numero);
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;

            JOptionPane.showMessageDialog(null, (numero+ " x " +i+ " = " +resultado));
        }

    }
}
