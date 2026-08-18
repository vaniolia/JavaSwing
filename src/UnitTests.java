import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTests {
    @Test
    void TxtFieldAddedCalculator(){
        Gui gui = new Gui();

        gui.textField_1.setText("Calculator");
        assertTrue(gui.textField_1.isEnabled());
    }

    @Test
    void TxtFieldNull(){
        Gui gui = new Gui();

        gui.textField_1.setText(null);
        assertTrue(gui.textField_1.isEnabled());
    }


    @Test
    void buttonPressed(){
        actions a = new actions();
        //in 
    }
}
