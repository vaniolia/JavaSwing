import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actions implements ActionListener {

    /*Button 1 Action*/
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Button 1")){
            System.out.println("Button wurde geklickt");
        }
    }


}
