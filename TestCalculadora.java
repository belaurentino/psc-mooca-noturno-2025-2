import javax.swing.JOptionPane;

public class TestCalculadora {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        int op = Integer.parseInt(JOptionPane.showInputDialog("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão"));
        
        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o primeiro operando ?"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o segundo operando ?"));
        double resultado;

        if (op == 1) {
            resultado = operando1 + operando2;
            JOptionPane.showMessageDialog(null, resultado);
        }
        else if(op == 2) {
            resultado = operando1 - operando2;
            JOptionPane.showMessageDialog(null, resultado);
        }
        else if(op == 3) {
            resultado = operando1 * operando2;
            JOptionPane.showMessageDialog(null, resultado);
        }
        else if(op == 4) {
            resultado = operando1 / operando2;
            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}