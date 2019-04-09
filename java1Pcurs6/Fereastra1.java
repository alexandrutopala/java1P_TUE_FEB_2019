import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra1 extends JFrame {    
    
    private JButton button;
    private JLabel label;
    
    public Fereastra1() {
        super("Fereastra mea");
        
        button = new JButton();
        button.setText("Apasa-ma");
        
        add(button);
        
        label = new JLabel("0");
        
        add(label, BorderLayout.SOUTH);
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                incrementLabel();
            }
        };
        
        button.addActionListener(al);
        
        button.addActionListener(
                ae -> System.out.println("click")
        );
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void incrementLabel() {
        String text = label.getText();
        int x = Integer.parseInt(text);
        x++;
        label.setText(String.valueOf(x));
    }
    
    
    
}