import javax.swing.JFrame;
import javax.swing.JLabel;

public class Convert {
    JFrame frame2 = new JFrame();
    JLabel CAD = new JLabel("CAD", JLabel.CENTER);


    Convert(){
        CAD.setBounds(45, 50, 100, 40);  
        frame2.add(CAD);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(420,420);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}
