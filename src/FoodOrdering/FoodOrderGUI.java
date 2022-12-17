package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cSundae;
    private JRadioButton r5;
    private JRadioButton r10;
    private JRadioButton r15;
    private JCheckBox cTea;

    public FoodOrderGUI(){
        super("Food Ordering System");

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (!cPizza.isSelected() && !cBurger.isSelected() && !cFries.isSelected() && !cSoftDrinks.isSelected() && !cTea.isSelected() && !cSundae.isSelected()) {
                        throw new Exception("Please select a food to order");
                    }

                    // Check if a discount radio button is selected
                    if (!r5.isSelected() && !r10.isSelected() && !r15.isSelected() && !rNone.isSelected()) {
                        throw new Exception("Please select a discount");
                    }

                    double price = 0;
                    if (cPizza.isSelected()) {
                        price += 100;
                    }
                    if (cBurger.isSelected()) {
                        price += 80;
                    }
                    if (cFries.isSelected()) {
                        price += 65;
                    }
                    if (cSoftDrinks.isSelected()) {
                        price += 55;
                    }
                    if (cTea.isSelected()) {
                        price += 50;
                    }
                    if (cSundae.isSelected()) {
                        price += 40;
                    }

                    if (r5.isSelected()) {
                        price *= 0.95;
                    }
                    if (r10.isSelected()) {
                        price *= 0.90;
                    }
                    if (r15.isSelected()) {
                        price *= 0.85;
                    }

                    JOptionPane.showMessageDialog(null, String.format("The total price is %.2f", price));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(750, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
