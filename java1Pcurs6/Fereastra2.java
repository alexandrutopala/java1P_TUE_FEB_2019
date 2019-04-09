import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Fereastra2 extends JFrame {
    private JButton red;
    private JButton green;
    private JButton blue;
    
    private JPanel colorPanel;
    private JPanel buttonsPanel;
    
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1;
    private JMenuItem mi2;
    
    public Fereastra2() {
        super("Fereastra 2");
        
        initComponents();
        initMenu();
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initMenu() {
        mb = new JMenuBar();
        m1 = new JMenu("Optiuni");
        mi1 = new JMenuItem("Reseteaza");
        mi2 = new JMenuItem("Inchide");
        
        m1.add(mi1);
        m1.add(mi2);
        
        mb.add(m1);
        
        setJMenuBar(mb);
        
        mi1.addActionListener(ae -> colorPanel.setBackground(Color.GRAY));
        mi2.addActionListener(ae -> dispose());
    }
    
    private void initComponents() {
        colorPanel = new JPanel();
        add(colorPanel);
        
        buttonsPanel = new JPanel();
        red = new JButton("RED");
        green = new JButton("GREEN");
        blue = new JButton("BLUE");
        
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(red);
        buttonsPanel.add(blue);
        buttonsPanel.add(green);
        
        add(buttonsPanel, BorderLayout.SOUTH);
        
        red.addActionListener(
            ae -> colorPanel.setBackground(Color.RED)
        );
        
        green.addActionListener(
            ae -> colorPanel.setBackground(Color.GREEN)
        );
        
        blue.addActionListener(
            ae -> colorPanel.setBackground(Color.BLUE)
        );
        
    }
    
    
    
}