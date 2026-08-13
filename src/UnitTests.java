import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTests {
    @Test
    void TxtFieldAddedCalculator(){
        actions a = new actions();

        a.textField.setText("Calculator");
        assertTrue(a.textField.isEnabled());

    }

    @Test
    void TxtFieldNull(){
        actions a = new actions();

        a.textField.setText(null);
        assertTrue(a.textField.isEnabled());


    }


    @Test
    void buttonPressed(){
        actions a = new actions();
        //in 
    }
}
