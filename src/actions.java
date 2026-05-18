import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actions implements ActionListener {

    public JTextField textField;
    public JLabel error_1;

    //Constructor
    public actions(JTextField textField, JLabel error_1){

        this.textField = textField;
        this.error_1 = error_1;
    }


    /*Button 1 Action*/
    public void actionPerformed(ActionEvent e) {

        String text = textField.getText();

        if(text.equals("Test")){

            error_1.setVisible(false);
            System.out.println("Test wurde abgeschlossen");
        }else if(!text.isBlank()){
            error_1.setVisible(false);

            System.out.println("Test");
        }else{
            error_1.setVisible(true);
            System.out.println("Keine Angaben wurden gemacht");
        }
    }
}
