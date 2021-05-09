package window;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LaunchPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Exhange");
    JTextField textField = new JTextField();
    JLabel labelUSD = new JLabel("USD", JLabel.CENTER);
    JLabel dollar = new JLabel("$", JLabel.CENTER);


    LaunchPage(){

        textField.setBounds(100, 50, 200, 40);  
        frame.add(textField);


        labelUSD.setBounds(250, 50, 140, 40);  
        frame.add(labelUSD);

        dollar.setBounds(45, 50, 100, 40);  
        frame.add(dollar);

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener((ActionListener) this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==myButton) {
            frame.dispose();
            Convert conversion = new Convert();
        }   
    }
}   


