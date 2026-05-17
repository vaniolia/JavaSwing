import java.awt.event.ActionEvent;

public class actions {

    /*Button 1 Action*/
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Test")){
            System.out.println("Button wurde geklickt");
        }
    }


}
