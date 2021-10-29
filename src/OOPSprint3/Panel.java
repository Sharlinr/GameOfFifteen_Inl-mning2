package OOPSprint3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Panel extends JFrame implements ActionListener {

    ArrayList<ButtonsLogic> buttonList = new ArrayList<>();
    ArrayList<Integer> randomize = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    JButton buttonNewGame = new JButton("Nytt Spel");
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();

    public Panel() {

        setLayout(new BorderLayout());
        setTitle("15 Game");

        add(p2, BorderLayout.NORTH);
        p2.add(buttonNewGame);

        add(p, BorderLayout.CENTER);
        p.setLayout(new GridLayout(4, 4));

        buttonNewGame.addActionListener(this);

        for (int i = 0; i < 16; ++i) {
            randomize.add(i);
        }
        Collections.shuffle(randomize);
        for (int i = 0; i < 16; ++i) {
            String buttonName = "" + randomize.get(i);
            if (buttonName.equals("0")) {
                buttonName = "";
            }
            buttonList.add(new ButtonsLogic(buttonName, i, randomize.get(i), buttonList, this));
        }

        for (JButton buttons : buttonList) {
            p.add(buttons);
        }
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}