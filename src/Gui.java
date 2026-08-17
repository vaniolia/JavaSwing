import javax.swing.*;

public class Gui extends JFrame{

    JFrame jf = new JFrame();
    JPanel p = new JPanel(); //Panel for every object to see

    public static String title = "Test with Java Swing";
    public static int width = 1080, height = 900;

    public static String calulatorInsert = "";

    //View
    public void createView(){

        actions a = new actions();
        a.textField = createTextField();

        //JTextField textField_1 = createTextField();
        JLabel error_1 = showError_1();

        JLabel label1 = showTitle();

        JLabel calculatorInsertLabel = calculatorInsert();

        JButton number1 = calculatorButtons("1", 400, 200);
        JButton number2 = calculatorButtons("2", 500,200);
        JButton number3 = calculatorButtons("3",600,200);
        JButton number4 = calculatorButtons("4",400,300);
        JButton number5 = calculatorButtons("5",500,300);
        JButton number6 = calculatorButtons("6",600,300);
        JButton number7 = calculatorButtons("7",400,400);
        JButton number8 = calculatorButtons("8",500,400);
        JButton number9 = calculatorButtons("9",600,400);
        JButton number0 = calculatorButtons("0",400,500);
        JButton minus = calculatorButtons("-",500,500);
        JButton plus = calculatorButtons("+",600,500);
        JButton multi = calculatorButtons("*",700,500);
        JButton divided = calculatorButtons(":",700,400);
        JButton enter = calculatorOperationEnter("Enter", 700,200);
        JButton delete = calculatorDeleteButton("Delete", 600,600);



        JButton button_1 = createButton(a.textField,label1,error_1, number1,number2,number3,number4,number5,number6,number7,
                number8,number9,number0,minus,plus,multi,divided,enter,delete, calculatorInsertLabel);

        /*Fenster View*/
        jf.setTitle("Test Fenster");
        jf.setSize(width,height);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(p); /*JF added the panel to the view*/

        p.setLayout(null); //Layout is null to set bounds

        /* Adding everything in the panel to connect it with the view*/
        p.add(button_1);
        p.add(a.textField);
        p.add(label1);
        p.add(error_1);
        p.add(calculatorInsertLabel);


        p.add(number1);
        p.add(number2);
        p.add(number3);
        p.add(number4);
        p.add(number5);
        p.add(number6);
        p.add(number7);
        p.add(number8);
        p.add(number9);
        p.add(number0);
        p.add(minus);
        p.add(plus);
        p.add(multi);
        p.add(divided);
        p.add(enter);
        p.add(delete);

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
    }

    /* Button 1 : size/visibility */
    public JButton createButton
    (JTextField textField, JLabel headerLabel,JLabel error_1, JButton number1,JButton number2, JButton number3,JButton number4,
     JButton number5, JButton number6, JButton number7, JButton number8, JButton number9, JButton number0,
     JButton minus, JButton plus, JButton multi, JButton divided, JButton enter,JButton delete, JLabel calculatorInsertLabel){

        JButton button_1 = new JButton("Button 1");

        button_1.setBounds(250,100,100,20); //Set Location bound and size

        button_1.setFocusable(false); //No focus anymore

        //Connect to actions
        button_1.addActionListener(new actions(textField,headerLabel,error_1,number1,number2,number3,number4,number5,number6,number7,
                number8,number9,number0,minus,plus,multi,divided,enter,delete, calculatorInsertLabel));

        return button_1;
    }

    /* Set buttons for calculator: size/visibility */
    public JButton calculatorButtons(String number, int x, int y){
        JButton numberX = new JButton(number);

        numberX.setBounds(x,y,80,80);
        numberX.setFocusable(false);

        return numberX;
    }

    /* Enter Button: size/visibility */
    public JButton calculatorOperationEnter(String enter, int x, int y){
        JButton operationEnter = new JButton(enter);

        operationEnter.setText("<html>E<br>N<br>T<br>E<br>R</html>");

        operationEnter.setBounds(x,y, 80,180);

        operationEnter.setFocusable(false);

       return operationEnter;
    }

    /* Delete Button: size/visibility */
    public JButton calculatorDeleteButton(String delete, int x, int y){
        JButton deleteButton = new JButton(delete);

        deleteButton.setText("DELETE");
        deleteButton.setBounds(x,y,180,80);
        deleteButton.setFocusable(false);

        return  deleteButton;
    }

    /* TextField 1: size/visibility */
    public JTextField createTextField(){

        JTextField textField_1 = new JTextField();
        textField_1.setBounds(30,100,200,20); //Set Location bound and size

        return textField_1;
    }

    /* Automatic Label: size/visibility */
    public JLabel calculatorInsert(){
        JLabel calculatorInsert = new JLabel(calulatorInsert);

        calculatorInsert.setBounds(450, 100, 200, 20);

        return calculatorInsert;
    }


    /* Title: size/visibility */
    public JLabel showTitle(){

        JLabel label1 = new JLabel(title); //Add Text
        label1.setBounds(450, 30, 200, 30); //Set Location bound and size


        return label1;
    }

    /* Error Message: size/visibility */
    public JLabel showError_1(){

        JLabel error_1 = new JLabel("Keine Angabe wurde gemacht"); //Add Error Text
        error_1.setBounds(30,115,200,30);
        error_1.setVisible(false);


        return error_1;
    }

}
