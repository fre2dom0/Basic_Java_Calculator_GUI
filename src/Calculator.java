import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Gui gui = new Gui();

    public Calculator(){
        for(JButton button : gui.functionButtons){
            button.addActionListener(this);
        }

        for(JButton button : gui.numberButtons){
            button.addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            for(JButton button : gui.numberButtons){
                if(e.getSource() == button){
                    gui.textField.setText(gui.textField.getText().concat(String.valueOf(button.getText())));
                }
            }

            if(e.getSource() == gui.decButton){
                gui.textField.setText(gui.textField.getText().concat(String.valueOf(gui.decButton.getText())));
            }
            else if(e.getSource() == gui.addButton){
                num1 = Double.parseDouble(gui.textField.getText());
                operator = '+';
                gui.textField.setText("");
            }
            else if(e.getSource() == gui.subButton){
                num1 = Double.parseDouble(gui.textField.getText());
                operator = '-';
                gui.textField.setText("");
            }
            else if(e.getSource() == gui.mulButton){
                num1 = Double.parseDouble(gui.textField.getText());
                operator = '*';
                gui.textField.setText("");
            }
            else if(e.getSource() == gui.divButton){
                num1 = Double.parseDouble(gui.textField.getText());
                operator = '/';
                gui.textField.setText("");
            }
            else if(e.getSource() == gui.equButton){
                num2 = Double.parseDouble(gui.textField.getText());

                switch (operator){
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;

                }

                gui.textField.setText(String.valueOf(result));
                num1 = result;
            }
            else if(e.getSource() == gui.clrButton){
                num1 = 0;
                num2 = 0;
                result = 0;
                gui.textField.setText("");
            }
            else if(e.getSource() == gui.delButton){
                String string = gui.textField.getText();
                gui.textField.setText("");
                for(int i = 0; i<string.length()-1; i++){
                    gui.textField.setText(gui.textField.getText() + string.charAt(i));
                }
            }
            else if(e.getSource() == gui.negButton){
                double temp = Double.parseDouble(gui.textField.getText());
                temp*=-1;
                gui.textField.setText(String.valueOf(temp));
            }
        }

        catch(Exception ignored){

        }

    }
}
