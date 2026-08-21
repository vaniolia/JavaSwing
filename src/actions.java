import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actions implements ActionListener {

    Gui gui = new Gui();

    boolean minusClicked = false;


    //Constructor

    public actions() {

    }

    public actions(JTextField textField,JLabel label1, JLabel error_1,JButton number1,JButton number2,JButton number3,JButton number4,JButton number5,JButton number6,JButton number7,
                   JButton number8,JButton number9,JButton number0,JButton minus,JButton plus,JButton multi,JButton divided,JButton enter,JButton delete, JLabel calculatorInsertLabel) {

        gui.textField_1 = textField;
        gui.label_1 = label1;
        gui.error_1 = error_1;
        gui.number1 = number1;
        gui.number2 = number2;
        gui.number3 = number3;
        gui.number4 = number4;
        gui.number5 = number5;
        gui.number6 = number6;
        gui.number7 = number7;
        gui.number8 = number8;
        gui.number9 = number9;
        gui.number0 = number0;
        gui.minus = minus;
        gui.plus = plus;
        gui.multi = multi;
        gui.divided = divided;
        gui.enter = enter;
        gui.delete = delete;
        gui.calculatorInsertLabel = calculatorInsertLabel;
    }



    /*Button 1 Action*/
    public void actionPerformed(ActionEvent e) {

        String text = gui.textField_1.getText();

        if(text.equals("Calculator") || text.equals("calculator") || text.equals("taschenrechner") || text.equals("Taschenrechner") ){

            gui.error_1.setVisible(false);
            gui.number1.setVisible(true);
            gui.number2.setVisible(true);
            gui.number3.setVisible(true);
            gui.number4.setVisible(true);
            gui.number5.setVisible(true);
            gui.number6.setVisible(true);
            gui.number7.setVisible(true);
            gui.number8.setVisible(true);
            gui.number9.setVisible(true);
            gui.number0.setVisible(true);
            gui.minus.setVisible(true);
            gui.plus.setVisible(true);
            gui.multi.setVisible(true);
            gui.divided.setVisible(true);
            gui.enter.setVisible(true);
            gui.delete.setVisible(true);
            gui.calculatorInsertLabel.setVisible(true);

            gui.label_1.setText("Calculator");
            gui.label_1.setBounds(500,50,100,20);

            System.out.println("Calculator is open");

            /*Click number 1*/
            gui.number1.addActionListener(event -> {
                String txt = gui.calculatorInsertLabel.getText();
                gui.calculatorInsertLabel.setText(txt + "1");
                System.out.println(txt + "1");
            });

            /*Click number 2*/
            gui.number2.addActionListener(event -> {
                String txt = gui.calculatorInsertLabel.getText();
                gui.calculatorInsertLabel.setText(txt + "2");
                System.out.println(txt + "2");
            });

            /*Click number 3*/
            gui.number3.addActionListener(event -> {
                String txt = gui.calculatorInsertLabel.getText();
                gui.calculatorInsertLabel.setText(txt + "3");
                System.out.println(txt + "3");
            });


            /*Click minus*/
            gui.minus.addActionListener(event -> {

                String number1 = gui.calculatorInsertLabel.getText();

                if(!minusClicked){
                    gui.calculatorInsertLabel.setText(number1 + " - ");
                    System.out.println(number1 + " - ");

                    minusClicked = true;

                } else if(!gui.calculatorInsertLabel.getText().endsWith(" - ")) {
                    System.out.println("Zahl kann wieder eingegeben werden");

                    minusClicked = false;

                } else{
                    System.out.println("Minus wurde schon einmal geklickt");
                }

            });



        }else if(!text.isBlank()){
            gui.error_1.setVisible(false);

            gui.number1.setVisible(false);
            gui.number2.setVisible(false);
            gui.number3.setVisible(false);
            gui.number4.setVisible(false);
            gui.number5.setVisible(false);
            gui.number6.setVisible(false);
            gui.number7.setVisible(false);
            gui.number8.setVisible(false);
            gui.number9.setVisible(false);
            gui.number0.setVisible(false);
            gui.minus.setVisible(false);
            gui.plus.setVisible(false);
            gui.multi.setVisible(false);
            gui.divided.setVisible(false);
            gui.enter.setVisible(false);
            gui.delete.setVisible(false);
            gui.calculatorInsertLabel.setVisible(false);

            System.out.println("Test");
        }else{
            gui.error_1.setVisible(true);

            gui.number1.setVisible(false);
            gui.number2.setVisible(false);
            gui.number3.setVisible(false);
            gui.number4.setVisible(false);
            gui.number5.setVisible(false);
            gui.number6.setVisible(false);
            gui.number7.setVisible(false);
            gui.number8.setVisible(false);
            gui.number9.setVisible(false);
            gui.number0.setVisible(false);
            gui.minus.setVisible(false);
            gui.plus.setVisible(false);
            gui.multi.setVisible(false);
            gui.divided.setVisible(false);
            gui.enter.setVisible(false);
            gui.delete.setVisible(false);
            gui.calculatorInsertLabel.setVisible(false);

            gui.label_1.setVisible(false);

            System.out.println("Keine Angaben wurden gemacht");
        }
    }
}
