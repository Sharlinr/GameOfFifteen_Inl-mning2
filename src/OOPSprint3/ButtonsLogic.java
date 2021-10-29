package OOPSprint3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonsLogic extends JButton implements ActionListener {

    final int finalPlacement;
    int myDestination;
    ArrayList<ButtonsLogic> buttons;
    Panel panel;

    public ButtonsLogic(String buttonName, int finalPlacement, int myDestination,
                        ArrayList<ButtonsLogic> buttons, Panel panel) {
        setText(buttonName);
        this.finalPlacement = finalPlacement;
        this.myDestination = myDestination;
        this.buttons = buttons;
        this.panel = panel;
        addActionListener(this);


    }

    public void swap(ButtonsLogic buttonSwap) {
        buttonSwap.myDestination = myDestination;
        buttonSwap.setText(buttonSwap.myDestination + "");
        myDestination = 0;
        setText("");

    }

    public void setDestination(int myDestination) {
        this.myDestination = myDestination;
        String buttonName = "" + myDestination;
        if (myDestination == 0) {
            buttonName = "";
        }
        setText(buttonName);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
