package OOPSprint3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame implements ActionListener {

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


    }
}