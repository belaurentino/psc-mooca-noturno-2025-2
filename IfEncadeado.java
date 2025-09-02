import javax.swing.JOptionPane;

public class IfEncadeado {
    public static void main(String[] args) {
        Double nota = Double.parseDouble(JOptionPane.showInputDialog(" Digite a nota do aluno: "));
        if(nota >= 7) {
            JOptionPane.showMessageDialog(null,"Você foi " + nota + " é aprovado");
        }
        else if (nota <5) {
        
            JOptionPane.showMessageDialog
            (null,"Você está " + nota + " é reprovado");
        }
        else if (nota >5 ) {
            JOptionPane.showMessageDialog
            (null,"Você está " + nota + " em recuperação");
        }
}
}

