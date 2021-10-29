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
        panel.checkWin();
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
        if (finalPlacement < 12) {           // first, second, third row, looking down.
            ButtonsLogic buttonBelow = buttons.get(finalPlacement + 4);
            if (buttonBelow.myDestination == 0) {
                swap(buttonBelow);
            }
        } // Check down
        if (finalPlacement > 3) {           // Fourth, third, second row, looking up.
            ButtonsLogic buttonAbove = buttons.get(finalPlacement - 4);
            if (buttonAbove.myDestination == 0) {
                swap(buttonAbove);
            }
        } // Check up

        if (finalPlacement % 4 != 0) {      // Going left.
            ButtonsLogic buttonLeft = buttons.get(finalPlacement - 1);
            if (buttonLeft.myDestination == 0) {
                swap(buttonLeft);
            }
        } // Check left
        if (finalPlacement % 4 != 3) {      // Going right.
            ButtonsLogic buttonRight = buttons.get(finalPlacement + 1);
            if (buttonRight.myDestination == 0) {
                swap(buttonRight);
            }
        } // Check right
    }

}