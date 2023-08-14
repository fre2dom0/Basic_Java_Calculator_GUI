
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui {
    protected JFrame frame;
    protected JTextField textField;
    protected JButton[] numberButtons = new JButton[10];
    protected JButton[] functionButtons = new JButton[9];
    protected JButton addButton, subButton, mulButton, divButton;
    protected JButton decButton, equButton, delButton, clrButton, negButton;
    protected JPanel panel;

    protected Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Gui(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setMaximumSize(new Dimension(420, 550));
        frame.setLayout(null);
        frame.setResizable(false);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for(JButton button : functionButtons){
            button.setFont(myFont);
            button.setFocusable(false);
        }

        for(int i = 0; i < 10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50, 430 , 100, 50);
        delButton.setBounds(150, 430 , 100, 50);
        clrButton.setBounds(250, 430 , 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10 , 10));
        panel.setBackground(Color.gray);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        panel.add(divButton);

        frame.add(negButton);
        frame.add(panel);
        frame.add(textField);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);


    }

}
