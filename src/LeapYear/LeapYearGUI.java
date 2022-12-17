package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
        super("Leap Year Checker");
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String input = tfYear.getText();
                    int inputYear = Integer.parseInt(input);
                    if (inputYear % 400 == 0) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else if (inputYear % 100 == 0) {
                        JOptionPane.showMessageDialog(null, "Not a Leap year");
                    } else if (inputYear % 4 == 0) {
                        JOptionPane.showMessageDialog(null, "Leap Year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a Leap Year");
                    }
                } catch(NullPointerException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Please enter a year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(750, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }


}


