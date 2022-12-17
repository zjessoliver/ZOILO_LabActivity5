package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField tfResult;

    public SimpleCalcGUI(){
        super("Simple Calculator");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = tfNumber1.getText();
                String input2 = tfNumber2.getText();
                int inputNum1 = Integer.parseInt(input1);
                int inputNum2 = Integer.parseInt(input2);

                String operator = (String) cbOperations.getSelectedItem();

                int result = 0;
                switch(operator){
                    case "+":
                        result = inputNum1 + inputNum2;
                        break;
                    case "-":
                        result = inputNum1 - inputNum2;
                        break;
                    case "*":
                        result = inputNum1 * inputNum2;
                        break;
                    case "/":
                        result = inputNum1 / inputNum2;
                        break;
                }

                tfResult.setText(Integer.toString(result));
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
