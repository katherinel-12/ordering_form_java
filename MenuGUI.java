import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MenuGUI implements ActionListener {
   
    static int count1 = 0;
    static int count2 = 0;
    static int count3 = 0;
    static int count4 = 0;
    static int count5 = 0;
    static int count6 = 0;
    
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;
    JLabel label11;
    JLabel label12;
    
    JFrame frame;
    JPanel panel;
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    
    double price1 = 5.89;
    double price2 = 5.99;
    double price3 = 3.29;
    double price4 = 3.19;
    double price5 = 2.25;
    double price6 = 1.75;
    
    double itemAmount1;
    double itemAmount2;
    double itemAmount3;
    double itemAmount4;
    double itemAmount5;
    double itemAmount6;
    
    int countTotal;
    double allSubtotal;
    double taxAmount;
    double totalCost;
   
   
    public MenuGUI() {
       
        frame = new JFrame();
       
        // Button 1
        button1 = new JButton("<html><div style='text-align: center;'>Burger<br>Price: $5.89</div></html>");
        button1.addActionListener(this);
       
        label1 = new JLabel("<html>Burger count: 0. <br>Amount: $0.00");
       
        // Button 2
        button2 = new JButton("<html><div style='text-align: center;'>Taco Trio<br>Price: $5.99</div></html>");
        button2.addActionListener(this);
       
        label2 = new JLabel("<html>Taco Trio count: 0. <br>Amount: $0.00");
        
        // Button 3
        button3 = new JButton("<html><div style='text-align: center;'>Fries<br>Price: $3.29</div></html>");
        button3.addActionListener(this);
       
        label3 = new JLabel("<html>Fries count: 0. <br>Amount: $0.00");
        
        // Button 4
        button4 = new JButton("<html><div style='text-align: center;'>Salad<br>Price: $3.19</div></html>");
        button4.addActionListener(this);
       
        label4 = new JLabel("<html>Salad count: 0. <br>Amount: $0.00");
        
        // Button 5
        button5 = new JButton("<html><div style='text-align: center;'>Soda<br>Price: $2.25</div></html>");
        button5.addActionListener(this);
       
        label5 = new JLabel("<html>Soda count: 0. <br>Amount: $0.00");
        
        // Button 6
        button6 = new JButton("<html><div style='text-align: center;'>Iced Tea<br>Price: $1.75</div></html>");
        button6.addActionListener(this);
       
        label6 = new JLabel("<html>Iced Tea count: 0. <br>Amount: $0.00");
        
        label7 = new JLabel();
        label8 = new JLabel("Item Count: 0");
        label9 = new JLabel("Subtotal: $0.00");
        label10 = new JLabel("Tax: $0.00");
        label11 = new JLabel("Total: $0.00");
        label12 = new JLabel("Thank you!");
        label12.setFont(new Font("Garamond", Font.BOLD | Font.ITALIC, 24));
        label12.setHorizontalAlignment(JLabel.CENTER);
        label12.setForeground(new Color (225, 89, 185));
        
       
        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(new Color (111, 111, 255), 7));
        panel.setLayout(new GridLayout(0, 3));

        // Set minimum size for labels
        label1.setMinimumSize(new Dimension(200, 150));
        label2.setMinimumSize(new Dimension(200, 150));
        label3.setMinimumSize(new Dimension(200, 150));
        label4.setMinimumSize(new Dimension(200, 150));
        label5.setMinimumSize(new Dimension(200, 150));
        label6.setMinimumSize(new Dimension(200, 150));
        label7.setMinimumSize(new Dimension(200, 150));
        label8.setMinimumSize(new Dimension(200, 150));
        label9.setMinimumSize(new Dimension(200, 150));
        label10.setMinimumSize(new Dimension(200, 150));
        label11.setMinimumSize(new Dimension(200, 150));
        label12.setMinimumSize(new Dimension(200, 150));
        
        panel.add(button1);
        panel.add(label1);
        panel.add(label7);
        panel.add(button2);
        panel.add(label2);
        panel.add(label8);
        panel.add(button3);
        panel.add(label3);
        panel.add(label9);
        panel.add(button4);
        panel.add(label4);
        panel.add(label10);
        panel.add(button5);
        panel.add(label5);
        panel.add(label11);
        panel.add(button6);
        panel.add(label6);
        panel.add(label12);
        
        panel.setBackground(new Color (175, 175, 255));
       
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Katherine's Menu Order Form");
        frame.setSize(700,350);
        frame.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            count1++;
            itemAmount1 = price1 * count1;
            label1.setText("<html>Burger count: " + count1 + ". <br>Amount: $" + String.format("%.2f", itemAmount1));
            }
        else if (e.getSource() == button2) {
            count2++;
            itemAmount2 = price2 * count2;
            label2.setText("<html>Taco Trio count: " + count2 + ". <br>Amount: $" + String.format("%.2f", itemAmount2));
            }
        else if (e.getSource() == button3) {
            count3++;
            itemAmount3 = price3 * count3;
            label3.setText("<html>Fries count: " + count3 + ". <br>Amount: $" + String.format("%.2f", itemAmount3));
            }
        else if (e.getSource() == button4) {
            count4++;
            itemAmount4 = price4 * count4;
            label4.setText("<html>Salad count: " + count4 + ". <br>Amount: $" + String.format("%.2f", itemAmount4));
            }
        else if (e.getSource() == button5) {
            count5++;
            itemAmount5 = price5 * count5;
            label5.setText("<html>Soda count: " + count5 + ". <br>Amount: $" + String.format("%.2f", itemAmount5));
            }
        else if (e.getSource() == button6) {
            count6++;
            itemAmount6 = price6 * count6;
            label6.setText("<html>Iced Tea count: " + count6 + ". <br>Amount: $" + String.format("%.2f", itemAmount6));
            }
            
        countTotal = count1 + count2 + count3 + count4 + count5 + count6;
        label8.setText("Item Count: " + countTotal);
        
        allSubtotal = itemAmount1 + itemAmount2 + itemAmount3 + itemAmount4 + itemAmount5 + itemAmount6;
        label9.setText("Subtotal: $" + String.format("%.2f", allSubtotal));
        
        taxAmount = 0.1 * allSubtotal;
        label10.setText("Tax: $" + String.format("%.2f", taxAmount));
        
        totalCost = allSubtotal + taxAmount;
        label11.setText("Total: $" + String.format("%.2f", totalCost));
        
    }
    
    public static void main(String[] args) {
        new MenuGUI();
        
    }
}