import javax.swing.*;

public class atividade12 {
    public static void main(String[] args) {

        double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("| Digite o valor do salario minimo |\n"));
        double salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("| Digite o valor do salario do funcionario |\n"));
        double quantidadeDeSalarioMinimo = salarioFuncionario / salarioMinimo;

        JOptionPane.showMessageDialog(null, "O funcionario ganha " +quantidadeDeSalarioMinimo+ " salarios minimos");

    }

}

