import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

    JFrame jf = new JFrame();
    JPanel p = new JPanel(); //Panel for Button 1
    JPanel p1 = new JPanel(); //Panel for TextField 1
    JPanel p2 = new JPanel(); //Panel for Txt 1

    public static int width = 1080, height = 900;

    //View
    public void createView(){

        JButton button = createButton();
        JTextField textField = createTextField();
        JLabel label1 = showTitle();

        /*Fenster View*/
        jf.setTitle("Test Fenster");
        jf.setSize(width,height);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);

        /* Button 1 view*/
        p.add(button);
        jf.add(p, BorderLayout.CENTER);

        /* TextField 1 View */
        p1.add(textField);
        jf.add(p1,BorderLayout.WEST);

        /*Text 1*/
        p2.add(label1);
        jf.add(p2,BorderLayout.NORTH);

    }

    /* Button 1 */
    public JButton createButton(){

        JButton button = new JButton("Button 1");

        button.setPreferredSize(new Dimension(100,20));

        button.setFocusable(false);


        ImageIcon printIcon = new ImageIcon("icons8-stop-24.png");
        button.setIcon(printIcon);

        //Connect to actions
        button.addActionListener(new actions());

        return button;
    }

    /* TextField 1 */
    public JTextField createTextField(){

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,20));

        return textField;
    }


    public JLabel showTitle(){

        JLabel label1 = new JLabel("Test with Java Swing"); //Add Text
        label1.setBounds(100, 50, 200, 30); //Set Location


        return label1;
    }
}
