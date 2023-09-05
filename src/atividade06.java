import javax.swing.*;

public class atividade06 {
    public static void main(String[] args) {
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("| Informe o salario | \n"));
        double valorDasVendas = Double.parseDouble(JOptionPane.showInputDialog("| Informe o valor das vendas | \n"));
        double comissao = valorDasVendas * 0.04;

        double salarioFinal = salarioFixo + comissao;
        JOptionPane.showMessageDialog(null, "| A comissao do funcionario é | \n" +comissao);
        JOptionPane.showMessageDialog(null, "| O salario final é de | \n " +salarioFinal);



    }
}
