import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

    JFrame jf = new JFrame();
    JPanel p = new JPanel(); //Panel for Button 1

    public static int width = 1080, height = 900;

    //View
    public void createView(){

        JTextField textField = createTextField();
        JButton button = createButton(textField);
        JLabel label1 = showTitle();

        /*Fenster View*/
        jf.setTitle("Test Fenster");
        jf.setSize(width,height);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(p); /*JF added the panel to the view*/

        p.setLayout(null); //Layout is null to set bounds

        /* Adding everything in the panel to connect it with the view*/
        p.add(button);
        p.add(textField);
        p.add(label1);

    }

    /* Button 1 */
    public JButton createButton(JTextField textField){

        JButton button = new JButton("Button 1");

        //button.setPreferredSize(new Dimension(100,20));
        button.setBounds(250,100,100,20); //Set Location bound and size

        button.setFocusable(false); //No focus anymore

        //Connect to actions
        button.addActionListener(new actions(textField));

        return button;
    }

    /* TextField 1 */
    public JTextField createTextField(){

        JTextField textField_1 = new JTextField();
        textField_1.setBounds(30,100,200,20); //Set Location bound and size

        return textField_1;
    }


    /*Title*/
    public JLabel showTitle(){

        JLabel label1 = new JLabel("Test with Java Swing"); //Add Text
        label1.setBounds(450, 30, 200, 30); //Set Location bound and size


        return label1;
    }
}
