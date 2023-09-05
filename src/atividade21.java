import javax.swing.*;

public class atividade21 {
    public static void main(String[] args) {
        double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("| Informe o numero de horas trabalhadas |"));
        double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("| Informe o valor de salario minimo |"));
        double horasExtras = Double.parseDouble(JOptionPane.showInputDialog("| Informe o numero de horas extras trabalhadas |"));

        double valorHoraTrabalhada = salarioMinimo / 8.0;

        double valorHoraExtra = salarioMinimo / 4.0;

        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;

        double quantiaHorasExtras = horasExtras * valorHoraExtra;

        double salarioTotal = salarioBruto + quantiaHorasExtras;

        JOptionPane.showMessageDialog(null, "| O salario a receber é |\n" +salarioTotal);


    }
}
