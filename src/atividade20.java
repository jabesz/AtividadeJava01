
import javax.swing.*;

public class atividade20 {
    public static void main(String[] args) {

        double distanciaParede = Double.parseDouble(JOptionPane.showInputDialog("| Informe a distancia da parede (em metros) |\n "));
        double alturaDesejada = Double.parseDouble(JOptionPane.showInputDialog("| Informe a altura desejada (em metros) |\n "));
        double medidaEscada = Math.sqrt(distanciaParede * distanciaParede + alturaDesejada * alturaDesejada);

        JOptionPane.showMessageDialog(null, "| A medida da escada necessaria é |\n" +medidaEscada+ " Metros");
    }
}
