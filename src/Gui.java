import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class Gui extends JFrame {

    JFrame jf = new JFrame();
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();

    public static int width = 1080, height = 900;

    //View
    public void createView(){

        JButton button = createButton();
        JTextField textField = createTextField();

        /*Fenster View*/
        jf.setTitle("Test Fenster");
        jf.setSize(width,height);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);

        /* Button 1 view*/
        p.add(button);
        jf.add(p, BorderLayout.CENTER);

        /* TextField View */
        p1.add(textField);
        jf.add(p1,BorderLayout.WEST);

    }

    /* Button 1 */
    public JButton createButton(){

        JButton button = new JButton("Test");

        button.setPreferredSize(new Dimension(100,40));

        button.setFocusable(false);


        ImageIcon printIcon = new ImageIcon("icons8-stop-24.png");
        button.setIcon(printIcon);



        return button;
    }

    /* TextField 1 */
    public JTextField createTextField(){

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,20));

        return textField;
    }


}
