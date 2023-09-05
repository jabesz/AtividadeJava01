import javax.swing.*;

public class atividade15 {
    public static void main(String[] args) {

    double  salarioJoao = Double.parseDouble(JOptionPane.showInputDialog(" | Digite o valor do salario de joao |\n"));
        double  primeiraConta = Double.parseDouble(JOptionPane.showInputDialog("| Digite o valor da primeira conta |\n"));
        double  segundoConta = Double.parseDouble(JOptionPane.showInputDialog("| Digite o valor da segunda conta |\n"));

        double multa = 0.02;
        double multaPrimeiraConta = primeiraConta * multa;
        double multaSegundaConta = segundoConta * multa;
        double totalApagar = primeiraConta + segundoConta + multaPrimeiraConta + multaSegundaConta;

        double saldoRestante = salarioJoao - totalApagar;

        JOptionPane.showMessageDialog(null, "| Apos o pagamento das contas, joão tera um saldo restante de |\n " + saldoRestante + "reais");

    }
}
