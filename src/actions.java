import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actions implements ActionListener {

    public JTextField textField;

    //Constructor
    public actions(JTextField textField){
        this.textField = textField;
    }


    /*Button 1 Action*/
    public void actionPerformed(ActionEvent e) {

        String text = textField.getText();

        if(text.equals("Test")){

            System.out.println("Test wurde abgeschlossen");
        }

        /*if(e.getActionCommand().equals("Button 1")){
            System.out.println("Button wurde geklickt");
        }*/
    }


}
