import javax.swing.JFrame;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LaunchPage implements AncestorListener{

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");


    LaunchPage(){

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
    public void ancestorRemoved(AncestorEvent event) {
        
    }
    
}   


