import javax.swing.*;

public class atividade25 {
    public static void main(String[] args) {

        double hora = Double.parseDouble(JOptionPane.showInputDialog("| Informe a hora |\n"));
        double minutos = Double.parseDouble(JOptionPane.showInputDialog("| Informe os minutos |\n"));

        double horaEmMinutos = hora * 60;

        double totalMinutos = minutos + horaEmMinutos;

        double totalSegundos = totalMinutos * 60;

        JOptionPane.showMessageDialog(null, "| Hora digitada convertida em minutos |\n" +horaEmMinutos+ " minutos");
        JOptionPane.showMessageDialog(null, "| Total de minutos |\n" +totalMinutos+ " minutos");
        JOptionPane.showMessageDialog(null, "| total de minutos convertidos em segundos |\n" +totalSegundos+ " segundos");
    }
}
