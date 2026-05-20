import javax.swing.*;

public class Gui extends JFrame{

    JFrame jf = new JFrame();
    JPanel p = new JPanel(); //Panel for Button 1

    public static int width = 1080, height = 900;

    //View
    public void createView(){

        JTextField textField_1 = createTextField();
        JLabel error_1 = showError_1();
        JButton button_1 = createButton(textField_1,error_1);
        JLabel label1 = showTitle();
        JButton number1 = calculatorButtons("1", 400, 100);
        JButton number2 = calculatorButtons("2", 500,100);
        JButton number3 = calculatorButtons("3",600,100);
        JButton number4 = calculatorButtons("4",400,200);
        JButton number5 = calculatorButtons("5",500,200);
        JButton number6 = calculatorButtons("6",600,200);
        JButton number7 = calculatorButtons("7",400,300);
        JButton number8 = calculatorButtons("8",500,300);
        JButton number9 = calculatorButtons("9",600,300);
        JButton number0 = calculatorButtons("0",400,400);

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
        p.add(textField_1);
        p.add(label1);
        p.add(error_1);
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

    }

    /* Button 1 */
    public JButton createButton(JTextField textField, JLabel error_1){

        JButton button_1 = new JButton("Button 1");

        button_1.setBounds(250,100,100,20); //Set Location bound and size

        button_1.setFocusable(false); //No focus anymore

        //Connect to actions
        button_1.addActionListener(new actions(textField,error_1));

        return button_1;
    }

    //Set buttons for calculator
    public JButton calculatorButtons(String number, int x, int y){
        JButton numberX = new JButton(number);

        numberX.setBounds(x,y,80,80);
        numberX.setFocusable(false);

        return numberX;
    }



    /* TextField 1 */
    public JTextField createTextField(){

        JTextField textField_1 = new JTextField();
        textField_1.setBounds(30,100,200,20); //Set Location bound and size

        return textField_1;
    }


    /*Title*/
    public JLabel showTitle(){

        JLabel label1 = new JLabel("Test with Java Swing"); //Add Text
        label1.setBounds(450, 30, 200, 30); //Set Location bound and size


        return label1;
    }

    public JLabel showError_1(){

        JLabel error_1 = new JLabel("Keine Angabe wurde gemacht"); //Add Error Text
        error_1.setBounds(30,115,200,30);
        error_1.setVisible(false);


        return error_1;
    }

}
