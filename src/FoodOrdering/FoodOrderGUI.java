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
                    double price = 0;
                    boolean selectedFood = false;
                    boolean selectedDiscount = false;
                    if (cPizza.isSelected()) {
                        price += 100;
                        selectedFood = true;
                    }
                    if (cBurger.isSelected()) {
                        price += 80;
                        selectedFood = true;
                    }
                    if (cFries.isSelected()) {
                        price += 65;
                        selectedFood = true;
                    }
                    if (cSoftDrinks.isSelected()) {
                        price += 55;
                        selectedFood = true;
                    }
                    if (cTea.isSelected()) {
                        price += 50;
                        selectedFood = true;
                    }
                    if (cSundae.isSelected()) {
                        price += 40;
                        selectedFood = true;
                    }

                    if (r5.isSelected()) {
                        price *= 0.95;
                        selectedDiscount = true;
                    }
                    if (r10.isSelected()) {
                        price *= 0.90;
                        selectedDiscount = true;
                    }
                    if (r15.isSelected()) {
                        price *= 0.85;
                        selectedDiscount = true;
                    }

                    if(!selectedFood && !selectedDiscount){
                        throw new Exception(("Please select food and discount to complete your order."));
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
