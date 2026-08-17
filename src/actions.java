import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actions implements ActionListener {

    public JTextField textField;
    public JLabel headerLabel;
    public JLabel error_1;
    public JButton number1;
    public JButton number2;
    public JButton number3;
    public JButton number4;
    public JButton number5;
    public JButton number6;
    public JButton number7;
    public JButton number8;
    public JButton number9;
    public JButton number0;
    public JButton minus;
    public JButton plus;
    public JButton multi;
    public JButton divided;
    public JButton enter;
    public JButton delete;
    public JLabel calculatorInsertLabel;

    boolean minusClicked = false;


    //Constructor
    public actions(JTextField textField,JLabel headerLabel, JLabel error_1, JButton number1,JButton number2, JButton number3,JButton number4,
                   JButton number5, JButton number6, JButton number7, JButton number8, JButton number9, JButton number0,
                   JButton minus, JButton plus, JButton multi, JButton divided, JButton enter, JButton delete, JLabel calculatorInsertLabel) {

        this.textField = textField;
        this.headerLabel = headerLabel;
        this.error_1 = error_1;
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
        this.number6 = number6;
        this.number7 = number7;
        this.number8 = number8;
        this.number9 = number9;
        this.number0 = number0;
        this.minus = minus;
        this.plus = plus;
        this.multi = multi;
        this.divided = divided;
        this.enter = enter;
        this.delete = delete;
        this.calculatorInsertLabel = calculatorInsertLabel;
    }

    public actions() {
        textField = new JTextField();
    }


    /*Button 1 Action*/
    public void actionPerformed(ActionEvent e) {

        String text = textField.getText();

        if(text.equals("Calculator") || text.equals("calculator") || text.equals("taschenrechner") || text.equals("Taschenrechner") ){

            error_1.setVisible(false);
            number1.setVisible(true);
            number2.setVisible(true);
            number3.setVisible(true);
            number4.setVisible(true);
            number5.setVisible(true);
            number6.setVisible(true);
            number7.setVisible(true);
            number8.setVisible(true);
            number9.setVisible(true);
            number0.setVisible(true);
            minus.setVisible(true);
            plus.setVisible(true);
            multi.setVisible(true);
            divided.setVisible(true);
            enter.setVisible(true);
            delete.setVisible(true);
            calculatorInsertLabel.setVisible(true);

            headerLabel.setText("Calculator");
            headerLabel.setBounds(500,50,100,20);

            System.out.println("Calculator is open");

            /*Click number 1*/
            number1.addActionListener(event -> {
                String txt = calculatorInsertLabel.getText();
                calculatorInsertLabel.setText(txt + "1");
                System.out.println(txt + "1");
            });

            /*Click number 2*/
            number2.addActionListener(event -> {
                String txt = calculatorInsertLabel.getText();
                calculatorInsertLabel.setText(txt + "2");
                System.out.println(txt + "2");
            });

            /*Click number 3*/
            number3.addActionListener(event -> {
                String txt = calculatorInsertLabel.getText();
                calculatorInsertLabel.setText(txt + "3");
                System.out.println(txt + "3");
            });


            /*Click minus*/
            minus.addActionListener(event -> {

                String number1 = calculatorInsertLabel.getText();

                if(!minusClicked){
                    calculatorInsertLabel.setText(number1 + " - ");
                    System.out.println(number1 + " - ");

                    minusClicked = true;

                } else if(!calculatorInsertLabel.getText().endsWith(" - ")) {
                    System.out.println("Zahl kann wieder eingegeben werden");

                    minusClicked = false;

                } else{
                    System.out.println("Minus wurde schon einmal geklickt");
                }

            });



        }else if(!text.isBlank()){
            error_1.setVisible(false);

            number1.setVisible(false);
            number2.setVisible(false);
            number3.setVisible(false);
            number4.setVisible(false);
            number5.setVisible(false);
            number6.setVisible(false);
            number7.setVisible(false);
            number8.setVisible(false);
            number9.setVisible(false);
            number0.setVisible(false);
            minus.setVisible(false);
            plus.setVisible(false);
            multi.setVisible(false);
            divided.setVisible(false);
            enter.setVisible(false);
            delete.setVisible(false);
            calculatorInsertLabel.setVisible(false);

            System.out.println("Test");
        }else{
            error_1.setVisible(true);

            number1.setVisible(false);
            number2.setVisible(false);
            number3.setVisible(false);
            number4.setVisible(false);
            number5.setVisible(false);
            number6.setVisible(false);
            number7.setVisible(false);
            number8.setVisible(false);
            number9.setVisible(false);
            number0.setVisible(false);
            minus.setVisible(false);
            plus.setVisible(false);
            multi.setVisible(false);
            divided.setVisible(false);
            enter.setVisible(false);
            delete.setVisible(false);
            calculatorInsertLabel.setVisible(false);

            headerLabel.setVisible(false);

            System.out.println("Keine Angaben wurden gemacht");
        }
    }
}
