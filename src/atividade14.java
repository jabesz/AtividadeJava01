import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class atividade14 {
    public static void main(String[] args) {


        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("| Digite o ano de nascimento |"));
        int anoAtual = LocalDate.now().getYear();

        int idadeAnos = anoAtual - anoNascimento;

        LocalDate dataNascimento = LocalDate.of(anoNascimento, 1, 1);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);

        long diasTotais = periodo.getDays();
        int idadeSemana = (int) (diasTotais / 7);

        JOptionPane.showMessageDialog(null, "Idade em anos: " +idadeAnos+ " anos");
        JOptionPane.showMessageDialog(null, "Idade em meses: " +periodo.getMonths()+ " meses");
        JOptionPane.showMessageDialog(null, "Idade em dias: " +periodo.getDays()+ " dias");
        JOptionPane.showMessageDialog(null, "Idade em semanas (aproximadamente): " +idadeSemana+ " semanas");

    }

}
